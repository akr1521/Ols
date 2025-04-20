package com.ontology.app.controller;


import com.ontology.app.bo.UserBO;
import com.ontology.app.entity.Applicant;
import com.ontology.app.entity.Job;
import com.ontology.app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class JobController {


    @Autowired
    private JobService  jobService;

    @RequestMapping(value = "/jobs" , method = RequestMethod.GET)
    public List<Job> getInitialJobs() {
        return  jobService.getIntialJobs();
    }


    @RequestMapping(value = "/jobs-premium" , method = RequestMethod.GET)
    public List<Job>  getPremiumJobs(@RequestHeader Map<String, String> headers,
                                     @RequestBody UserBO userBO ,@RequestParam String filterBy){


        String authToken = extractAuthToken(headers); // Implement this method to extract your auth token
        if (authToken == null || authToken.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Authentication required");
        }
/*
        UserBO authenticatedUser = userService.authenticateUser(authToken);
        if (authenticatedUser == null) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid authentication credentials");
        }

 */
        List<Job> jobList = jobService.getPremiumJobs(filterBy);


        return jobList;
    }

    private String extractAuthToken(Map<String, String> headers) {
        // Adjust this based on how you are sending the authentication token (e.g., Authorization header with Bearer scheme)
        return headers.get("Authorization"); // Example: Assuming token is in the Authorization header
    }

}
