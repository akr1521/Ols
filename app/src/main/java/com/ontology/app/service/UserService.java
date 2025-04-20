package com.ontology.app.service;


import com.ontology.app.bo.RegistrationRequest;
import com.ontology.app.bo.UserBO;
import com.ontology.app.entity.Applicant;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ontology.app.repository.ApplicantRepository;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.Optional;
@Service
public class UserService {


    @Autowired
    private ApplicantRepository applicantRepository;

   // @Autowired
   // private BCryptPasswordEncoder bCryptPasswordEncoder; // As

    /*
    public UserBO authenticateUser(String authToken) {
        // In a real-world scenario, 'authToken' would likely be a JWT or a session ID.
        // For this example, we'll simulate authentication based on a simple convention
        // where the authToken might contain the user's email (this is highly insecure for production!).

        // **Warning: This is a simplified and insecure authentication for demonstration.**
        // **Do NOT use email directly as an auth token in a real application.**

        if (authToken != null && authToken.startsWith("Basic ")) {
            // Extract base64 encoded "username:password"
            String base64Credentials = authToken.substring("Basic ".length()).trim();
            String[] credentials = new String(java.util.Base64.getDecoder().decode(base64Credentials)).split(":", 2);
            if (credentials.length == 2) {
                String email = credentials[0];
                String password = credentials[1];
                return authenticateByEmailAndPassword(email, password);
            }
        }
        return null; // Authentication failed
    }

    private UserBO authenticateByEmailAndPassword(String email, String password) {
        Optional<Applicant> applicantOptional = applicantRepository.findByEmail(email);
        if (applicantOptional.isPresent()) {
            Applicant applicant = applicantOptional.get();
            // Verify the password using BCryptPasswordEncoder (or your chosen encoder)
            if (bCryptPasswordEncoder.matches(password, applicant.getPassword())) {
                // Authentication successful
                applicant.setLastLoggedInAt(new Date());
                applicantRepository.save(applicant); // Update last logged-in time
                UserBO userBO = new UserBO();
                userBO.setId(applicant.getApplicantId());
                userBO.setEmail(applicant.getEmail());
                userBO.setIsPremium(applicant.getIsPremium());
                return userBO;
            }
        }
        return null; // Authentication failed (invalid credentials)
    }

    public boolean isPremiumUser(UserBO user) {
        return user != null && Boolean.TRUE.equals(user.getIsPremium());
    }
*/

    public Boolean verifyEmail(String email){
       Optional<Applicant>  userOptional=   applicantRepository.findByEmail( email);
       if ( userOptional.isPresent()){
            if (  userOptional.get().getEmail().equalsIgnoreCase(email))
                return true ;
       }
        return  false ;
    }

    public Boolean updateExistingUser (  UserBO userBO){
        Optional<Applicant>  userOptional=   applicantRepository.findByEmail( userBO.getEmail());
        if ( userOptional.isPresent()){
              if (userBO.getEmail()!= null){
                     Applicant applicant =  userOptional.get();
                     applicant.setEmail(userBO.getEmail());
                   Applicant  savedUser =  applicantRepository.save(applicant);
                 return  savedUser.getEmail().equalsIgnoreCase( userBO.getEmail());
              }
        }
        return false;
    }

    public void registerNewUser(RegistrationRequest request) {
        if (request == null || request.getEmail() == null || request.getPassword() == null) {
            throw new IllegalArgumentException("Email and password are required for registration.");
        }

        if (applicantRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email address already exists.");
        }

        Applicant newApplicant = new Applicant();
        newApplicant.setEmail(request.getEmail());
    //    newApplicant.setPassword(bCryptPasswordEncoder.encode(request.getPassword())); // Hash the password
        newApplicant.setCreatedAt(new Date());
        newApplicant.setPremium(false); // Default to non-premium
        applicantRepository.save(newApplicant);
    }
}
