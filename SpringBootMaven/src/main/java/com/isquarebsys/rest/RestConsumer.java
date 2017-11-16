package com.isquarebsys.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class RestConsumer implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(RestConsumer.class);

	public static void main(String args[]) {
		SpringApplication.run(RestConsumer.class);
	}

	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		Response response = restTemplate.getForObject("http://services.groupkt.com/country/get/iso2code/IN",
				Response.class);
		log.info(response.toString());
	}

}
