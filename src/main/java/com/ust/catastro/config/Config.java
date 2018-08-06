package com.ust.catastro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.ust.catastro.clients.CatastroDetailClient;
import com.ust.catastro.clients.impl.CatastroDetailClientImpl;

@Configuration
public class Config {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.ust.catastro.wsdl");
		return marshaller;
	}

	@Bean
	public CatastroDetailClient catastroDetailClient(Jaxb2Marshaller marshaller) {
		CatastroDetailClient client = new CatastroDetailClientImpl(marshaller);
		return client;
	}
	

}
