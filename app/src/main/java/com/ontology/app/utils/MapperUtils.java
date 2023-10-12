package com.ontology.app.utils;

import com.ontology.app.bo.OntologyBO;
import com.ontology.app.entity.Ontology;

public class MapperUtils {
    public static OntologyBO mapToOntologyBO (Ontology source){
        OntologyBO  ontologyBO = new OntologyBO();
        ontologyBO.setOntologyId(source.getOntologyId());
        ontologyBO.setDescription(source.getConfig().getDescription());
        ontologyBO.setTitle(source.getConfig().getTitle());
        ontologyBO.setDefinitionProperties(source.getConfig().getDefinitionProperties());
        ontologyBO.setSynonymProperties(source.getConfig().getSynonymProperties());
        return ontologyBO;
    }
}
