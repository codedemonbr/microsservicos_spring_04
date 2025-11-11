package com.codedemonbr.workingVerbs.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String messagem, String details) {
}
