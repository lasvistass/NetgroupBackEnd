package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.ArticoloDTO;
import com.example.demo.entity.Articolo;

public interface ArticoloService {

	List<Articolo> getAllArticolo();
	
	List<ArticoloDTO> getAllArticoloDTO();
	
	ArticoloDTO getArticoloById(Integer id);
	
	Articolo getArticoloNormaleById(Integer id);
}
