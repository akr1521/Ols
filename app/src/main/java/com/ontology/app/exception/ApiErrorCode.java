package com.ontology.app.exception;

public enum ApiErrorCode {

     NOT_FOUND(404 , ErrorMessage.ONTOLOGY_INF_NOT_FOUND) ,BAD_REQUEST (400,ErrorMessage.INVALID_ID);
     private final  int errorCode;
     ApiErrorCode (int errorCode, String m ){
            this.errorCode = errorCode;
    }
     int getErrorCode ( ){
            return errorCode;
     }

}

