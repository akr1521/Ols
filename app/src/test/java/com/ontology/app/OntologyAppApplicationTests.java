package com.ontology.app;

import com.ontology.app.entity.Ontology;
import com.ontology.app.service.ApiService;
import com.ontology.app.service.OntologyService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import  org.junit.jupiter.api.Assertions;
import java.util.Optional;


import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import org.junit.jupiter.engine.*;
@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
class OntologyAppApplicationTests {

	@Test
	void contextLoads() {

	}

	@InjectMocks
	private OntologyService  ontologyTestService;
	@Mock
	private ApiService apimockService;

	Optional<Ontology>  opOnotologyInfo;




	@Test
	public void test_findOntologyInfo_WhenIdIsPresent_thenReturnOntologyInfo() {
		Ontology ontology = new Ontology();
		opOnotologyInfo = Optional.of( ontology);
		when (apimockService.makeRequestToOntologyApi(Mockito.any())).thenReturn( opOnotologyInfo);
		String id = "efo";
		opOnotologyInfo = ontologyTestService.findOntologyInfo(id);
		 Assertions.assertNotNull( opOnotologyInfo );
	}

}
