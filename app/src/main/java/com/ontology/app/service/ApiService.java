package com.ontology.app.service;


import com.ontology.app.entity.Ontology;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;
@Service
public interface ApiService {
    Optional<Ontology> makeRequestToOntologyApi(String[] params);
}
