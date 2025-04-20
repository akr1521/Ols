package com.ontology.app.controller;
import com.ontology.app.bo.Response;
import com.ontology.app.bo.ResponseBuilder;
import com.ontology.app.entity.Ontology;
import com.ontology.app.exception.ApiException;
import com.ontology.app.exception.ErrorMessage;
import com.ontology.app.service.OntologyService;
import com.ontology.app.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OntologyController {

    @Autowired
    private OntologyService ontologyService;

    @RequestMapping(  value="/ontology/{id}", method = RequestMethod.GET)
    public ResponseEntity<? extends Response<?>>  processOntologyInfo(@PathVariable("id") String id){
        Consumer<Ontology> response = null;
        if  (Objects.isNull(id)) {
            throw new ApiException(ErrorMessage.INVALID_ID , null, HttpStatus.BAD_REQUEST, ZonedDateTime.now());
        }
        Optional<Ontology>  ontologyResponseOp = ontologyService.findOntologyInfo(id);
        if ( ontologyResponseOp.isPresent()){
            return ResponseBuilder.buildSuccessResponse(MapperUtils.mapToOntologyBO(ontologyResponseOp.get()));
        }
        return ResponseBuilder.buildErrorResponse(null, HttpStatus.NOT_FOUND, ErrorMessage.ONTOLOGY_INF_NOT_FOUND );
    }


    @RequestMapping (value = "/java/{userStatus}")
    public ResponseEntity<? extends Response<?>> processJavaQuestions( @RequestHeader Map<String,String> headers){
        headers.forEach((key, value) -> {
        });

        return null;
    }




    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("http://localhost:3000"); // Replace with your React app's origin
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter((CorsConfigurationSource) source);
    }
}
