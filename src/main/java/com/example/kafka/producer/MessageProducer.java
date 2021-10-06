package com.example.kafka.producer;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.kafka.model.Message;

@Component
public class MessageProducer {
	
    @Value("${message.topic}")
    private String messageTopic;
 
    private final KafkaTemplate<String, Message> kafkaTemplate;
 
    public MessageProducer(final KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
 
    public void send(Message message) {
        final String mensageKey = UUID.randomUUID().toString();
        kafkaTemplate.send(messageTopic, mensageKey, message);
    }

}
