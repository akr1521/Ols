package com.ontology.app.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_posted")
    private boolean isPosted;

    @Column(name = "is_quarantined")
    private boolean isQuarantined;

    @Column( name= "is_premium")
    private boolean isPremium;

    @Column(name= "is_actively_hiring")
    private boolean isActivelyHiring;


    @Column( name="created_at")
    private Date createAt;


    @Column(name = "job_title")
    @NonNull
    private String jobTitle;


    @Column (name= "company")
    private String company;


    @Column(name = "country")
    private String country;

    @Column (name= "country_icon")
    private String countryIcon;


    @Column( name= "is_visa_covered")
    private String isVisaCovered;


    @Column(name ="is_flight_covered")
    private String isFlightCovered;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
            name = "job_skill",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<Skill> skills = new HashSet<>();


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

    public void setCreateAt (Date createAt) {
        this.createAt = createAt;
    }

    @NonNull
    public String getJobTitle () {
        return jobTitle;
    }

    public void setJobTitle (@NonNull String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany (String company) {
        this.company = company;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    public void setCountryIcon (String countryIcon) {
        this.countryIcon = countryIcon;
    }

    public void setIsVisaCovered (String isVisaCovered) {
        this.isVisaCovered = isVisaCovered;
    }

    public void setIsFlightCovered (String isFlightCovered) {
        this.isFlightCovered = isFlightCovered;
    }


    public void addSkill(Skill skill) {
        this.skills.add(skill);
        skill.getJobs().add(this);
    }

    public void removeSkill(Skill skill) {
        this.skills.remove(skill);
        skill.getJobs().remove(this);
    }

}
