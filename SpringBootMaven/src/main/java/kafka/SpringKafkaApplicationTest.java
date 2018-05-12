package kafka;
import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.TestContextBootstrapper;
import org.springframework.test.context.junit4.SpringRunner;

import com.isquarebsys.SpringKafkaApplication;


/**
 * https://memorynotfound.com/spring-kafka-consume-producer-example/
 * 
 * 
 * @author user
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringKafkaApplication.class)
@DirtiesContext
public class SpringKafkaApplicationTest {

	private static final String HELLOWORLD_TOPIC = "helloworld.t";

	@ClassRule
	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, HELLOWORLD_TOPIC);

	@Autowired
	private Receiver receiver;

	@Autowired
	private Sender sender;
	
	@Bean
	public Receiver receiver() {
		return new Receiver();
	}

	@Bean
	public Sender sender() {
		return new Sender();
	}	

	@Test
	public void testReceive() throws Exception {
		sender.send(HELLOWORLD_TOPIC, "Hello Spring Kafka!");

		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
		System.out.println(receiver.getLatch().getCount());
	}
}