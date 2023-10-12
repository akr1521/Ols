package com.ontology.app.bo;

import java.util.List;

public class OntologyBO {
    private String ontologyId;
    private String title;
    private String description;
    private List<String> definitionProperties;
    private List<String> synonymProperties;

    public OntologyBO() {

    }
    public String getOntologyId() {
        return ontologyId;
    }

    public void setOntologyId(String ontologyId) {
        this.ontologyId = ontologyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getDefinitionProperties() {
        return definitionProperties;
    }

    public void setDefinitionProperties(List<String> definitionProperties) {
        this.definitionProperties = definitionProperties;
    }

    public List<String> getSynonymProperties() {
        return synonymProperties;
    }

    public void setSynonymProperties(List<String> synonymProperties) {
        this.synonymProperties = synonymProperties;
    }
}
