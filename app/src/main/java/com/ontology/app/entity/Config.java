package com.ontology.app.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Config {
    @JsonProperty ("id")
    private String id;
    @JsonProperty ("versionIri")
    private String versionIri;
    @JsonProperty ("namespace")
    private String namespace;
    @JsonProperty ("preferredPrefix")
    private String preferredPrefix;
    private String title;
    private String description;
    private String homepage;
    private String version;
    private String mailingList;
    private String tracker;
    private String logo;
    private List<String> creators;
    private String annotations;
    private String fileLocation;
    private boolean oboSlims;
    private String labelProperty;
    private List<String> definitionProperties;
    private List<String> synonymProperties;
    private List<String> hierarchicalProperties;
    private List<String> baseUris;
    private List<String> hiddenProperties;
    private List<String> preferredRootTerms;
    private boolean isSkos;
    private boolean allowDownload;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersionIri() {
        return versionIri;
    }

    public void setVersionIri(String versionIri) {
        this.versionIri = versionIri;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getPreferredPrefix() {
        return preferredPrefix;
    }

    public void setPreferredPrefix(String preferredPrefix) {
        this.preferredPrefix = preferredPrefix;
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

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMailingList() {
        return mailingList;
    }

    public void setMailingList(String mailingList) {
        this.mailingList = mailingList;
    }

    public String getTracker() {
        return tracker;
    }

    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<String> getCreators() {
        return creators;
    }

    public void setCreators(List<String> creators) {
        this.creators = creators;
    }

    public String getAnnotations() {
        return annotations;
    }

    public void setAnnotations(String annotations) {
        this.annotations = annotations;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public boolean isOboSlims() {
        return oboSlims;
    }

    public void setOboSlims(boolean oboSlims) {
        this.oboSlims = oboSlims;
    }

    public String getLabelProperty() {
        return labelProperty;
    }

    public void setLabelProperty(String labelProperty) {
        this.labelProperty = labelProperty;
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

    public List<String> getHierarchicalProperties() {
        return hierarchicalProperties;
    }

    public void setHierarchicalProperties(List<String> hierarchicalProperties) {
        this.hierarchicalProperties = hierarchicalProperties;
    }

    public List<String> getBaseUris() {
        return baseUris;
    }

    public void setBaseUris(List<String> baseUris) {
        this.baseUris = baseUris;
    }

    public List<String> getHiddenProperties() {
        return hiddenProperties;
    }

    public void setHiddenProperties(List<String> hiddenProperties) {
        this.hiddenProperties = hiddenProperties;
    }

    public List<String> getPreferredRootTerms() {
        return preferredRootTerms;
    }

    public void setPreferredRootTerms(List<String> preferredRootTerms) {
        this.preferredRootTerms = preferredRootTerms;
    }

    public boolean isSkos() {
        return isSkos;
    }

    @JsonProperty ("isSkos")
    public void setSkos(boolean skos) {
        isSkos = skos;
    }

    public boolean isAllowDownload() {
        return allowDownload;
    }
    @JsonProperty ("allowDownload")
    public void setAllowDownload(boolean allowDownload) {
        this.allowDownload = allowDownload;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id='" + id + '\'' +
                ", versionIri='" + versionIri + '\'' +
                ", namespace='" + namespace + '\'' +
                ", preferredPrefix='" + preferredPrefix + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", homepage='" + homepage + '\'' +
                ", version='" + version + '\'' +
                ", mailingList='" + mailingList + '\'' +
                ", tracker='" + tracker + '\'' +
                ", logo='" + logo + '\'' +
                ", creators=" + creators +
                ", annotations='" + annotations + '\'' +
                ", fileLocation='" + fileLocation + '\'' +
                ", oboSlims=" + oboSlims +
                ", labelProperty='" + labelProperty + '\'' +
                ", definitionProperties=" + definitionProperties +
                ", synonymProperties=" + synonymProperties +
                ", hierarchicalProperties=" + hierarchicalProperties +
                ", baseUris=" + baseUris +
                ", hiddenProperties=" + hiddenProperties +
                ", preferredRootTerms=" + preferredRootTerms +
                ", isSkos=" + isSkos +
                ", allowDownload=" + allowDownload +
                '}';
    }
}
