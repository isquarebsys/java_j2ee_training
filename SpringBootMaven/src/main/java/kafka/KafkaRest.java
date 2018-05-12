package kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka/")
public class KafkaRest {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping(value = "/send")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message sent successfully";
	}

}

