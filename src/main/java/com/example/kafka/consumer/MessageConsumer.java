package com.example.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.kafka.model.Message;

@Component
public class MessageConsumer {
	
	@KafkaListener(topics = "${message.topic}")
	public void messageConsumer(ConsumerRecord<String, Message> consumerRecord) {
		
		System.out.println("Chave: " + consumerRecord.key());
		System.out.println("Mensagem: " + consumerRecord.value());
	}
	

}
