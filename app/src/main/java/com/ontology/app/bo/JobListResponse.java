package com.ontology.app.bo;

import java.util.Set;

public class JobListResponse {
    private Long id;
    private boolean isPosted;

    private boolean isPremium;
    private boolean isActivelyHiring;

    private String jobTitle;
    private String country;

    private String countryIcon;

    private String isVisaCovered;

    private String isFlightCovered;

    private String companyUrl;

    private Set<String> skills;


    public String getCompanyUrl () {
        return companyUrl;
    }

    public void setCompanyUrl (String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public Set<String> getSkills () {
        return skills;
    }

    public void setSkills (Set<String> skills) {
        this.skills = skills;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public boolean isPosted () {
        return isPosted;
    }

    public void setPosted (boolean posted) {
        isPosted = posted;
    }

    public boolean isPremium () {
        return isPremium;
    }

    public void setPremium (boolean premium) {
        isPremium = premium;
    }

    public boolean isActivelyHiring () {
        return isActivelyHiring;
    }

    public void setActivelyHiring (boolean activelyHiring) {
        isActivelyHiring = activelyHiring;
    }

    public String getJobTitle () {
        return jobTitle;
    }

    public void setJobTitle (String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    public String getCountryIcon () {
        return countryIcon;
    }

    public void setCountryIcon (String countryIcon) {
        this.countryIcon = countryIcon;
    }

    public String getIsVisaCovered () {
        return isVisaCovered;
    }

    public void setIsVisaCovered (String isVisaCovered) {
        this.isVisaCovered = isVisaCovered;
    }

    public String getIsFlightCovered () {
        return isFlightCovered;
    }

    public void setIsFlightCovered (String isFlightCovered) {
        this.isFlightCovered = isFlightCovered;
    }
}
