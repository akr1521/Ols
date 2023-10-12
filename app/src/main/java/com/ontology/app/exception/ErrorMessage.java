package com.ontology.app.exception;

public interface ErrorMessage {
    String  ONTOLOGY_INF_NOT_FOUND = "Ontology information not found !" ;
    String  INVALID_ID="Invalid Id. Please try again with a valid ID";

    String  DATABASE_ERROR= "Failed to connnect with database";
    String FAILED_API= "Failed to get a Response from EMB";
}
