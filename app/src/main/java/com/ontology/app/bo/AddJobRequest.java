package com.ontology.app.bo;

import java.util.Date;
import java.util.List;

public class AddJobRequest {
    private boolean isPosted;
    private boolean isQuarantined;
    private boolean isPremium;
    private boolean isActivelyHiring;
    private Date createAt;
    private String jobTitle;
    private String company;
    private String country;
    private String countryIcon;
    private String isVisaCovered;
    private String isFlightCovered;
    private String companyUrl;
    private List<String> skills; //

    public boolean isPosted () {
        return isPosted;
    }

    public void setPosted (boolean posted) {
        isPosted = posted;
    }

    public boolean isQuarantined () {
        return isQuarantined;
    }

    public void setQuarantined (boolean quarantined) {
        isQuarantined = quarantined;
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

    public Date getCreateAt () {
        return createAt;
    }

    public void setCreateAt (Date createAt) {
        this.createAt = createAt;
    }

    public String getJobTitle () {
        return jobTitle;
    }

    public void setJobTitle (String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany () {
        return company;
    }

    public void setCompany (String company) {
        this.company = company;
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

    public String getCompanyUrl () {
        return companyUrl;
    }

    public void setCompanyUrl (String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public List<String> getSkills () {
        return skills;
    }

    public void setSkills (List<String> skills) {
        this.skills = skills;
    }
}
