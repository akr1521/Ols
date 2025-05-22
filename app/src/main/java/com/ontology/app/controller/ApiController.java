package com.ontology.app.controller;


import com.ontology.app.bo.AuthRequest;
import com.ontology.app.bo.Response;
import com.ontology.app.bo.ResponseBuilder;
import com.ontology.app.bo.UserBO;
import com.ontology.app.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class ApiController {

    final private  UserService userService;

    public ApiController(final UserService userService) {
        this.userService =  userService;
    }


    @RequestMapping( method = RequestMethod.GET , value = "/jobs/initial")
    public ResponseEntity<Response<String>>   getTrialJobs(){

    return new ResponseEntity<>(HttpStatusCode.valueOf(400));
    }




    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthRequest authRequest) throws Exception {
  /*     try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String jwt = jwtUtil.generateToken(userDetails);

            return ResponseEntity.ok(new AuthResponse(jwt));
        } catch (Exception e) {
            throw new Exception("Invalid username or password", e);
        }
     */
    return  new ResponseEntity ( "Not yet Implemented" , HttpStatus.UNPROCESSABLE_ENTITY);
    }


    @GetMapping(value = "/validate")
    public ResponseEntity<Void>  validateToken(@RequestHeader("Authorization")
                                               String authHeader){
         if (authHeader == null ||   !authHeader.startsWith("Bearer ")){
             return ResponseEntity.status( HttpStatus.UNAUTHORIZED).build();
         }
        return  null;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST )
    public ResponseEntity<Object>   registerUser(@RequestBody @NonNull UserBO userBO, @RequestHeader Map<String,String> headers) {

        if (Objects.isNull(userBO) ||  Objects.isNull(  userBO.getEmail()) ||
         Objects.isNull( userBO.getPassword())){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST , null);
        }


        return  new ResponseEntity<>(HttpStatusCode.valueOf(201));
    }

    @RequestMapping(value = "/reset-password", method = RequestMethod.PUT )
    public ResponseEntity<Object>  forgotPassword(@RequestBody @NonNull String email, @RequestHeader Map<String,String> headers) {
          if  (userService.verifyEmail(email)) {

          }

        return new ResponseEntity<>(HttpStatusCode.valueOf( 200));
    }



    @RequestMapping(value = "/update-account", method = RequestMethod.PUT )
    public ResponseEntity<Object>  updateUser(@RequestBody @NonNull UserBO userBO, @RequestHeader Map<String,String> headers) {

        return new ResponseEntity<>(HttpStatusCode.valueOf( 200));
    }




}
