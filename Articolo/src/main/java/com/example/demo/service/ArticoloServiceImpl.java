package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ArticoloDTO;
import com.example.demo.DTO.ArticoloNPDTO;
import com.example.demo.converter.ArticoloConverter;
import com.example.demo.converter.ArticoloNPConverter;
import com.example.demo.entity.Articolo;
import com.example.demo.repository.ArticoloRepository;

@Service
public class ArticoloServiceImpl implements ArticoloService{

	@Autowired
	ArticoloRepository articoloRepository;
	
	@Autowired
	ArticoloConverter articoloConverter;
	
	@Autowired
	ArticoloNPConverter articoloNPConverter;
	
	
	@Override
	public List<Articolo> getAllArticolo() {
		return articoloRepository.findAll();
	}

	@Override
	public List<ArticoloDTO> getAllArticoloDTO() {
		return articoloConverter.covertListArticolo(getAllArticolo());
	}

	@Override
	public ArticoloDTO getArticoloById(Integer id) {
		return articoloConverter.covertArticolo(articoloRepository.findById(id).get());
	}

	@Override
	public Articolo getArticoloNormaleById(Integer id) {
		return articoloRepository.findById(id).get();
	}

	@Override
	public List<ArticoloNPDTO> getAllNP() {
		return articoloNPConverter.converListNP(articoloRepository.findAll());
	}

}
