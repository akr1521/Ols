package com.ontology.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {

    @JsonProperty("self")
    private Link self;
    @JsonProperty("terms")
    private Link terms;
    @JsonProperty("properties")
    private Link properties;
    @JsonProperty("individuals")
    private Link individuals;

    public Link getSelf() {
        return self;
    }
    @JsonProperty("self")
    public void setSelf(Link self) {
        this.self = self;
    }

    public Link getTerms() {
        return terms;
    }
    @JsonProperty("terms")
    public void setTerms(Link terms) {
        this.terms = terms;
    }

    public Link getProperties() {
        return properties;
    }
    @JsonProperty("properties")
    public void setProperties(Link properties) {
        this.properties = properties;
    }

    public Link getIndividuals() {
        return individuals;
    }
    @JsonProperty("individuals")
    public void setIndividuals(Link individuals) {
        this.individuals = individuals;
    }

    @Override
    public String toString() {
        return "Links{" +
                "self=" + self +
                ", terms=" + terms +
                ", properties=" + properties +
                ", individuals=" + individuals +
                '}';
    }
}
