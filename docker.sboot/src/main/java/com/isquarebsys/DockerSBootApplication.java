package com.isquarebsys;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class DockerSBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSBootApplication.class, args);
	}
}
