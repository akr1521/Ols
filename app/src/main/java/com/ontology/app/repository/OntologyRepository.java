package com.ontology.app.repository;


import com.ontology.app.entity.Ontology;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OntologyRepository  extends MongoRepository<Ontology,String> {
    Optional<Ontology> findByOntologyId(String id);
}
