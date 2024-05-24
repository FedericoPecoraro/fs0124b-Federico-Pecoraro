package it.epicode.exceptions;

import lombok.Getter;
import org.springframework.validation.ObjectError;

import java.util.List;

@Getter
public class BadRequestException extends RuntimeException {
	private List<ObjectError> errorsList;

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(List<ObjectError> errorsList) {
		super("Errori nel body");
		this.errorsList = errorsList;
	}

}