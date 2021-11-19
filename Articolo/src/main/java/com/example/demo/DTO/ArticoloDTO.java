package com.example.demo.DTO;

import java.util.List;

import lombok.Data;

@Data
public class ArticoloDTO {

	private String nome;
	private double prezzo;
	private List<RecensioneDTO> recensioniDTO;
}
