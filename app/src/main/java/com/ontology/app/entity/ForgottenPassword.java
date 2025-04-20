package com.ontology.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "forgotten_password")

public class ForgottenPassword {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID token;

    @Column(name = "applicant_id", nullable = false, updatable = false)
    private Long applicantId;

    @Column(name = "email", nullable = false, updatable = false)
    private String email;

    @CreationTimestamp
    @Column(name = "creation_timestamp", nullable = false, updatable = false)
    private LocalDateTime creationTimestamp;

    @Column(name = "expiration_timestamp", nullable = false)
    private LocalDateTime expirationTimestamp;

    @Column(name = "used", nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean used = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applicant_id", referencedColumnName = "applicant_id", insertable = false, updatable = false)
    private Applicant applicant;

    public ForgottenPassword(Long applicantId, String email, LocalDateTime expirationTimestamp) {
        this.applicantId = applicantId;
        this.email = email;
        this.expirationTimestamp = expirationTimestamp;
    }

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

    public LocalDateTime getCreationTimestamp () {
        return creationTimestamp;
    }

    public void setCreationTimestamp (LocalDateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public LocalDateTime getExpirationTimestamp () {
        return expirationTimestamp;
    }

    public void setExpirationTimestamp (LocalDateTime expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    public boolean isUsed () {
        return used;
    }

    public void setUsed (boolean used) {
        this.used = used;
    }

    public Applicant getApplicant () {
        return applicant;
    }

    public void setApplicant (Applicant applicant) {
        this.applicant = applicant;
    }
}