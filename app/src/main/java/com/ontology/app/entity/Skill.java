package com.ontology.app.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "skill")

public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skillId;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description")
    private String description;



    @ManyToMany(mappedBy = "skills")
    private Set<Job> jobs = new HashSet<>();


    // Optional: Add a constructor with required fields
    public Skill(String name) {
        this.name = name;
    }

    public Set<Job> getJobs () {
        return jobs;
    }

    public void setJobs (Set<Job> jobs) {
        this.jobs = jobs;
    }

    public Long getSkillId () {
        return skillId;
    }

    public void setSkillId (Long skillId) {
        this.skillId = skillId;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
}