package com.isquarebsys;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * References
 * 	https://github.com/spotify/docker-maven-plugin
 * 	https://spring.io/guides/gs/spring-boot-docker/
 * 
 * 	Specifying TLS certs for pom.xml and other configs
 * 		https://github.com/fabric8io/docker-maven-plugin/blob/master/src/main/asciidoc/inc/_global-configuration.adoc
 * @author user
 * 
 * Steps to build docker image
 * 	1. Navigate to the workspace path
 * 	2. Issue: mvn install package docker:build
 * 	3. Put the docker certs under docker folder and update certPath in pom.xml 
 * 	4. Update dockerHost in pom.xml
 * 
 * Error
	Failed to execute goal com.spotify:docker-maven-plugin:1.1.1:build (default-cli) on project docker.sboot: 
 	Exception caught: java.util.concurrent.ExecutionException: com.spotify.docker.client.shaded.javax.ws.rs.ProcessingException: 
	javax.net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException: PKIX path building failed: 
	sun.security.provider.certpath.SunCertPathBuilderException: 
	unable to find valid certification path to requested target
 *
 */

@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class DockerSBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSBootApplication.class, args);
	}
}
