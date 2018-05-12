package kafka;

import org.junit.ClassRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
@RequestMapping(value="/jsa/kafka")
public class KafkaSendController {
	private static final String HELLOWORLD_TOPIC = "helloworld.t";
	@Autowired
	Sender producer;
	
	@ClassRule
	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, HELLOWORLD_TOPIC);
	
	@GetMapping(value="/producer")
	public String producer(@RequestParam("data")String data){
		producer.send(HELLOWORLD_TOPIC,data);
		
		return "Done";
	}
	
	@GetMapping(value="/consumer")
	public String getAllRecievedMessage(){
//		String messages = storage.toString();
//		storage.clear();
//		
//		return messages;
		return null;
	}
}