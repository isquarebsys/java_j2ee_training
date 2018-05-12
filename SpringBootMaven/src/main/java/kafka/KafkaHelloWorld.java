package kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ref: http://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world
 * 
 * Pre-req
 * 	Install Kafka and keep the zookeeper and kafka running
 *  Kafka's default port 9092 is used by the KafkaSender
 * 
 * @author user
 *
 */
@SpringBootApplication
public class KafkaHelloWorld {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] { KafkaHelloWorld.class }, args);
	}
}