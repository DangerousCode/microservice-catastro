package com.ust.catastro.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SpringFoxConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ust.catastro.controllers"))
				.paths(PathSelectors.any())
				.build()
				.produces(new HashSet<>(Arrays.asList(MediaType.APPLICATION_JSON_VALUE)))
				.consumes(new HashSet<>(Arrays.asList(MediaType.APPLICATION_JSON_VALUE)))
				.useDefaultResponseMessages(false)
				.apiInfo(getApiInfo())
				.tags(getFirstTag(), getRemainingTags())
		;
	}
	
	private ApiInfo getApiInfo() {
	    return new ApiInfo(
	            "Catastro API",
	            "API para la consulta de información en el catastro",
	            "1.0.0",
	            "TERMS OF SERVICE URL",
	            new Contact("NAME","URL","EMAIL"),
	            "LICENSE",
	            "LICENSE URL",
	            Collections.emptyList()
	    );
	}
	
	private Tag getFirstTag() {
		return new Tag("Catastro", "Listado de endpoints para consultar información en el Catastro.");
	}
	
	private Tag[] getRemainingTags() {
		return new Tag[] {
			new Tag("Catastro", "Listado de endpoints para consultar información en el Catastro.")
		};
	}
}
