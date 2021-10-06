package com.example.kafka.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
	
	@NotBlank(message = "Must be filled.")
	private String name;
	@Positive(message = "Must be a postive number.")
	private BigDecimal value;

}
