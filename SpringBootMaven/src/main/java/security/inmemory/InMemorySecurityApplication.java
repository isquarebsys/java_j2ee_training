package security.inmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class InMemorySecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(InMemorySecurityApplication.class, args);
	}
}
