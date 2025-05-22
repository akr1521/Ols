package com.ontology.app.service;

import com.ontology.app.bo.AddJobRequest;
import com.ontology.app.bo.JobListResponse;
import com.ontology.app.entity.Job;
import com.ontology.app.entity.Skill;
import com.ontology.app.repository.JobRepository;
import com.ontology.app.repository.SkillRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

@Service
public class JobService {

    private final JobRepository jobRepository;
    private final SkillRepository skillRepository;

    public JobService (JobRepository jobRepository , final SkillRepository skillRepository) {
        this.jobRepository = jobRepository;
        this.skillRepository = skillRepository;
    }

    // Get Trial jobs that will be listed
    public List<Job> getIntialJobs () {
        List<Job> jobs = jobRepository.findAll();
        if (jobs != null) {

        }
        return jobs;
    }

    // Get the Premium Jobs that will be listed
    public List<Job> getPremiumJobs (String filterBy) {
        if (Objects.nonNull(filterBy)) {
        }
        return null;
    }

    @Transactional
    public Job addJob(AddJobRequest addJobRequest) {
        Job job = new Job();
        job.setPosted(addJobRequest.isPosted());
        job.setQuarantined(addJobRequest.isQuarantined());
        job.setPremium(addJobRequest.isPremium());
        job.setActivelyHiring(addJobRequest.isActivelyHiring());
        job.setCreateAt(addJobRequest.getCreateAt());
        job.setJobTitle(addJobRequest.getJobTitle());
        job.setCompany(addJobRequest.getCompany());
        job.setCountry(addJobRequest.getCountry());
        job.setCountryIcon(addJobRequest.getCountryIcon());
        job.setIsVisaCovered(addJobRequest.getIsVisaCovered());
        job.setIsFlightCovered(addJobRequest.getIsFlightCovered());
        job.setCompanyUrl(addJobRequest.getCompanyUrl());

        Set<Skill> skills = new HashSet<>();
        List<String> skillNames = addJobRequest.getSkills();
        if (skillNames != null && !skillNames.isEmpty()) {
            for (String skillName : skillNames) {
                Skill skill = skillRepository.findByName(skillName)
                        .orElseGet(() -> {
                            Skill newSkill = new Skill(skillName);
                            return skillRepository.save(newSkill);
                        });
                skills.add(skill);
            }
        }
        job.setSkills(skills);

        return jobRepository.save(job);
    }



    private List<JobListResponse> encryptInitialJobs (List<Job> jobs) {
        List<JobListResponse> response = new ArrayList<>();
        for (Job job : jobs) {
            JobListResponse jobListResponse = new JobListResponse();
            jobListResponse.setJobTitle(job.getJobTitle());
            jobListResponse.setId(job.getId());
            jobListResponse.setCountry(job.getCountry());
            jobListResponse.setCompanyUrl(job.getCompanyUrl());
            response.add(jobListResponse);
        }

        return response;
    }

    public String maskString(String input) {
        if (input == null || input.length() <= 2) {
            return input; // No masking needed for short strings
        }
        if ( input.length() <  6){
            return input.substring(1,2) +
                    IntStream.range(3, input.length()-1)
                            .mapToObj( i -> "*")
                            .reduce("", String::concat);
        }


        return input.substring(1, 2)  + IntStream.range(1, input.length() - 5)
                .mapToObj(i -> "*")
                .reduce("", String::concat);
    }



}