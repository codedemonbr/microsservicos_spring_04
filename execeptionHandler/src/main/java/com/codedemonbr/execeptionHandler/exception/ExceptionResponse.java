package com.codedemonbr.execeptionHandler.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String detail) {
}
