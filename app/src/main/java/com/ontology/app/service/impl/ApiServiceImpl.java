package com.ontology.app.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ontology.app.constants.AppConstants;
import com.ontology.app.entity.Ontology;
import com.ontology.app.exception.ApiException;
import com.ontology.app.exception.ErrorMessage;
import com.ontology.app.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Optional;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private Environment environment;

    public Optional<Ontology> makeRequestToOntologyApi(String[] params){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {
                return response.getStatusCode().is5xxServerError();
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {
                throw new ApiException( ErrorMessage.INVALID_ID, null ,  HttpStatus.UNPROCESSABLE_ENTITY, ZonedDateTime.now());
            }
        });
        ResponseEntity<String> ontologyResponse = restTemplate.getForEntity(Objects.requireNonNull(environment.getProperty(AppConstants.ONTOLOGY_API_URL)+ params[0]), String.class, params[0] );
        System.out.println (  " Api Response :  " + ontologyResponse.getBody());
        ObjectMapper   mapper = new ObjectMapper();
        try {
            Ontology   ontologyInfo  =  mapper.readValue(  ontologyResponse.getBody(), Ontology.class);
            System.out.println(   ontologyInfo);
            if( Objects.nonNull(ontologyInfo)){
                 return  Optional.of(ontologyInfo);
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
      throw new ApiException(ErrorMessage.ONTOLOGY_INF_NOT_FOUND, null, HttpStatus.NOT_FOUND, ZonedDateTime.now());
    }


}
