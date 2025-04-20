package com.ontology.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name ="applicant")
public class Applicant
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="applicant_id")
    private  Long applicantId;
    @Column(name="email" , nullable = false)
    private String email;
    @Column(name= "password" , nullable = false)
    private String password;
    @Column (name="created_at" , nullable = false)
    private Date createdAt;
    @Column(name ="last_loggedin_at")
    private Date  lastLoggedInAt;
    @Column(name="is_premium" , nullable = false)
    private Boolean isPremium;
    @Column(name="last_forgotten_password_used")
    private Date lastForgottenPassword;

    public Long getApplicantId () {
        return applicantId;
    }

    public void setApplicantId (Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public Date getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt (Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastLoggedInAt () {
        return lastLoggedInAt;
    }

    public void setLastLoggedInAt (Date lastLoggedInAt) {
        this.lastLoggedInAt = lastLoggedInAt;
    }

    public Boolean getPremium () {
        return isPremium;
    }

    public void setPremium (Boolean premium) {
        isPremium = premium;
    }

    public Date getLastForgottenPassword () {
        return lastForgottenPassword;
    }

    public void setLastForgottenPassword (Date lastForgottenPassword) {
        this.lastForgottenPassword = lastForgottenPassword;
    }
}
