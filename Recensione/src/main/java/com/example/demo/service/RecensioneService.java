package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.RecensioneDTO;
import com.example.demo.entity.Recensione;

public interface RecensioneService {

	List<Recensione> getAllRecensioni();
	
	List<RecensioneDTO> getAllRecensioniDTO();
	
	List<RecensioneDTO> getAllRecensioniDTOByIdArticolo(Integer id);
	
	Recensione saveRecensione(Recensione recensione);
}
