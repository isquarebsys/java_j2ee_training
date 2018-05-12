package com.isquarebsys;

import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.test.rule.KafkaEmbedded;

import kafka.Receiver;
import kafka.Sender;

@SpringBootApplication
public class SpringKafkaApplication {
	private static final String HELLOWORLD_TOPIC = "helloworld.t";

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

	// @ClassRule
	// public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true,
	// HELLOWORLD_TOPIC);

//	@Autowired
//	private Receiver receiver;
//
//	@Autowired
//	private Sender sender;
//
//	@Test
//	public void testReceive() throws Exception {
//		sender.send(HELLOWORLD_TOPIC, "Hello Spring Kafka!");
//
//		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
//		System.out.println(receiver.getLatch().getCount());
//	}
//
//	@Bean
//	public Receiver receiver() {
//		return new Receiver();
//	}
//
//	@Bean
//	public Sender sender() {
//		return new Sender();
//	}
}
