package it.epicode.exceptions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestControllerAdvice
@Slf4j
public class ExceptionsHandler {

	@ExceptionHandler(BadRequestException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorsPayload handleBadRequest(BadRequestException e) {
		List<String> errorsMessages = new ArrayList<>();
		if (e.getErrorsList() != null)
			errorsMessages = e.getErrorsList().stream().map(err -> err.getDefaultMessage()).toList();
		return new ErrorsPayload(e.getMessage(), LocalDateTime.now());
	}

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorsPayload handleNotFound(NotFoundException e) {
		return new ErrorsPayload(e.getMessage(), LocalDateTime.now());
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorsPayload handleGeneric(Exception e) {
		e.printStackTrace();
		return new ErrorsPayload("Errore generico, risolveremo il prima possibile", LocalDateTime.now());
	}

}
