package com.ontology.app.service;

import com.ontology.app.bo.JobListResponse;
import com.ontology.app.entity.Job;
import com.ontology.app.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

   public  List<Job> getIntialJobs() {
        List<Job>  jobs =  jobRepository.findAll();
        if (jobs != null ) {
            jobs.stream().forEach( System.out::println);
        }
        return  jobs;
    }

  public    List<Job>   getPremiumJobs( String filterBy){
        if (Objects.nonNull(  filterBy))
        {
        }
        return null;
    }


    private  List<JobListResponse>  encryptInitialJobs(List<Job>  jobs){
       List<JobListResponse>  response = new ArrayList<>();
       for (  Job   job :  jobs){

           JobListResponse  jobListResponse = new JobListResponse();
            jobListResponse.setJobTitle(  job.getJobTitle());

           response.add(jobListResponse);
       }

       return response;
    }


}
