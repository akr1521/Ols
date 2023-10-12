package com.ontology.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalAppExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<Object>  handleNotFoundException( ApiException e){
        ApiException apiException = new ApiException(e.getMessage() , e,e.getHttpStatus() , ZonedDateTime.now());
        return new ResponseEntity<>( apiException,e.getHttpStatus());
    }



}
