package it.epicode.m5_s3_g5test.exceptions;

import it.epicode.dto.DtoBase;
import it.epicode.m5_s3_g5test.dto.RegisterUserDto;

public class PersistEntityException extends ServiceException {
    private static final long serialVersionUID = 1L;

    public final DtoBase invalidDto;

    public PersistEntityException(RegisterUserDto invalidDto) {
        this.invalidDto = invalidDto;
    }
}
