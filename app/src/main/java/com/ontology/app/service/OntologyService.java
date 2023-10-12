package com.ontology.app.service;

import com.ontology.app.entity.Ontology;
import com.ontology.app.exception.ApiException;
import com.ontology.app.exception.DatabaseException;
import com.ontology.app.exception.ErrorMessage;
import com.ontology.app.repository.OntologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OntologyService {
    @Autowired
    private    ApiService  apiService;
    @Autowired
    private OntologyRepository ontologyRepository;

    public  Optional<Ontology> findOntologyInfo(String id ){
         Optional<Ontology> ontologyOp =  apiService.makeRequestToOntologyApi(new String[]{id});
         if (ontologyOp.isPresent()) {
             return ontologyOp;
         }
         else{
             ontologyOp =  ontologyRepository.findByOntologyId( id);
             if ( ontologyOp.isPresent()){
                 return ontologyOp;
             }
           throw new DatabaseException( ErrorMessage.DATABASE_ERROR, HttpStatus.UNPROCESSABLE_ENTITY.name(), HttpStatus.UNPROCESSABLE_ENTITY.value(), LocalDateTime.now());
         }
    }

}
