package com.ontology.app.exception;

import java.time.LocalDateTime;

public class DatabaseException extends RuntimeException {
    private  String httpStatus ;
    private  int httpStatusCode;
    private LocalDateTime localDateTime;

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatabaseException (String message, String httpStatus, int httpStatusCode, LocalDateTime  timeofEveent){
        super (  message);
        this.httpStatus =   httpStatus;
        this.httpStatusCode = httpStatusCode;
        this.localDateTime  = timeofEveent;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
