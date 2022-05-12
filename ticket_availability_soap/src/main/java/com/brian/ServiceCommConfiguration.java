package com.brian;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class ServiceCommConfiguration {

	
	@Bean
	public RestTemplate restTemplate() {
		/*
		 * RestTemplate is a type that is built into Spring that allows you to make HTTP requests to services.
		 * In our case, we want to make a POST request to our other SOAP service.
		 */
		
		final String BASE_URL = "http://localhost:8002/soap-service";
		DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(BASE_URL);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setUriTemplateHandler(uriBuilderFactory);
		return restTemplate;
	}
}