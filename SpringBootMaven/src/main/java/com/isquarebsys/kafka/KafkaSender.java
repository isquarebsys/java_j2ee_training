package com.isquarebsys.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	
	/**
	 * KafkaTemplate is a Wrapper like HibernateTemplate to deal with Kafka
	 */
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	String kafkaTopic = "helloworld";
	public void send(String data) {
		kafkaTemplate.send(kafkaTopic, data);
	}
}