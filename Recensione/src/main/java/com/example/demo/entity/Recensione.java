package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document("Recensioni")
public class Recensione {

	public static final String SEQUENCE_NAME = "recensione_sequence";
	
	private Long id;
	
	@Field("idArticolo")
	private int  idArticolo;
	
	@Field("Testo")
	private String  testo;
}
