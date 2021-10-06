package com.example.kafka.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.model.Message;
import com.example.kafka.producer.MessageProducer;

@RestController
@RequestMapping("/mensagem")
public class KafkaController {
	
	@Autowired
	MessageProducer messageProducer;
	
	@PostMapping
	public Message post(@RequestBody @Valid Message message) {
		messageProducer.send(message);
		return message;
	}

}
