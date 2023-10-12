package com.ontology.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.cglib.core.Local;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;


@Document(collection = "Ols")
public class Ontology {
    @Id
    private String id;
    @JsonProperty("languages")
    private List<String> languages;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("ontologyId")
    private String ontologyId;
    @JsonProperty("loaded")
    private String loaded;
    private String updated;
    private String status;
    private String message;
    private String version;
    private String fileHash;
    private int loadAttempts;
    private int numberOfTerms;
    private int numberOfProperties;
    private int numberOfIndividuals;
    @JsonProperty("config")
    private Config config;
    private List<String> baseUris;
    @JsonProperty("_links")
    private Links _links;

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getOntologyId() {
        return ontologyId;
    }

    public void setOntologyId(String ontologyId) {
        this.ontologyId = ontologyId;
    }

    public String getLoaded() {
        return loaded;
    }

    public void setLoaded(String loaded) {
        this.loaded = loaded;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public int getLoadAttempts() {
        return loadAttempts;
    }

    public void setLoadAttempts(int loadAttempts) {
        this.loadAttempts = loadAttempts;
    }

    public int getNumberOfTerms() {
        return numberOfTerms;
    }

    public void setNumberOfTerms(int numberOfTerms) {
        this.numberOfTerms = numberOfTerms;
    }

    public int getNumberOfProperties() {
        return numberOfProperties;
    }

    public void setNumberOfProperties(int numberOfProperties) {
        this.numberOfProperties = numberOfProperties;
    }

    public int getNumberOfIndividuals() {
        return numberOfIndividuals;
    }

    public void setNumberOfIndividuals(int numberOfIndividuals) {
        this.numberOfIndividuals = numberOfIndividuals;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public List<String> getBaseUris() {
        return baseUris;
    }

    public void setBaseUris(List<String> baseUris) {
        this.baseUris = baseUris;
    }

    public Links get_links() {
        return _links;
    }

    @JsonProperty("_links")
    public void set_links(Links _links) {
        this._links = _links;
    }

    @Override
    public String toString() {
        return "Ontology{" +
                "id='" + id + '\'' +
                ", languages=" + languages +
                ", lang='" + lang + '\'' +
                ", ontologyId='" + ontologyId + '\'' +
                ", loaded='" + loaded + '\'' +
                ", updated='" + updated + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", version='" + version + '\'' +
                ", fileHash='" + fileHash + '\'' +
                ", loadAttempts=" + loadAttempts +
                ", numberOfTerms=" + numberOfTerms +
                ", numberOfProperties=" + numberOfProperties +
                ", numberOfIndividuals=" + numberOfIndividuals +
                ", config=" + config +
                ", baseUris=" + baseUris +
                ", _links=" + _links +
                '}';
    }
}
