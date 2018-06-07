package com.isquarebsys;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * New instructions based on https://spring.io/guides/gs/spring-boot-docker/
 * 
 * STEPS
 * 		1. Login to docker
 * 		2. git clone https://github.com/isquarebsys/java_j2ee_training
 * 		3. Navigate to the Docker_SBoot. This folder already has a Dockerfile
 *		4. pom.xml is updated with dockerfile-maven-plugin which is a helper to create docker images
 *		5. Build a tagged docker image: mvn install dockerfile:build
 *		6. Run the image: docker run -p 8080:8080 -t docker.springboot/docker.sboot
 *		7. Test the application@http://192.168.99.100:8080/ where 192.168.99.100 is the docker ip 
 */


/**
 * OLD Instructions: Do NOT follow
 * 
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
