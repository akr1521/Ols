package com.ontology.app.bo;

import com.ontology.app.entity.Ontology;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseBuilder {
    public static <T> ResponseEntity<Response<T>> buildSuccessResponse(T data) {
        Response<T> response = new Response<>(HttpStatus.OK.value(), "Success", data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static<T> ResponseEntity<Response<T>> buildErrorResponse(T data, HttpStatus status, String message){
        Response<T> response = new Response<>(status.value(), message, data);
        return new ResponseEntity<>(response, status);
    }
}
