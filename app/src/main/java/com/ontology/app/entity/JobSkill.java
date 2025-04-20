package com.ontology.app.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "job_skill")

@IdClass(JobSkillId.class) // Composite primary key
public class JobSkill {

    @Id
    @Column(name = "job_id")
    private Long jobId;

    @Id
    @Column(name = "skill_id")
    private Long skillId;

    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Job job;

    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id", insertable = false, updatable = false)
    private Skill skill;

    public JobSkill(Long jobId, Long skillId) {
        this.jobId = jobId;
        this.skillId = skillId;
    }
}