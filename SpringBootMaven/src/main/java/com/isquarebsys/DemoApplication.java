package com.isquarebsys;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jersey.JerseyConfig;


@EnableAutoConfiguration
@Configuration
@SpringBootApplication
@ComponentScan("com.isquarebsys.ws.jaxb")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean jerseyServlet() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/jersey/*");
	    // our rest resources will be available in the path /rest/*
	    registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
	    return registration;
	}
}
