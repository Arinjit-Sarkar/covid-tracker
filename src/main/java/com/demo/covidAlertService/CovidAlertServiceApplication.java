package com.demo.covidAlertService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CovidAlertServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CovidAlertServiceApplication.class, args);
		
		
	}

	@Bean
	RestTemplate template(RestTemplateBuilder builder)
	{
		return builder.build();
	}
	
	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(CovidAlertServiceApplication.class);
	 }
}
