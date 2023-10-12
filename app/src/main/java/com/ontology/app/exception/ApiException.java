package com.ontology.app.exception;


import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException extends RuntimeException {
     private  final String message;
     private  final Throwable exception;
     private  final HttpStatus httpStatus;
     private final ZonedDateTime time;


        public ApiException(String message, Throwable cause, HttpStatus status , ZonedDateTime time){
            this.time = time;
            this.message = message;
            this.exception = cause;
            this.httpStatus = status;
        }

    public String getMessage() {
        return message;
    }

    public Throwable getException() {
        return exception;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTime() {
        return time;
    }
}
