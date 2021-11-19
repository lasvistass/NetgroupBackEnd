package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.RecensioneDTO;
import com.example.demo.converter.RecensioneConverter;
import com.example.demo.entity.Recensione;
import com.example.demo.repository.RecensioneRepository;

@Service
public class RecensioneServiceImpl implements RecensioneService {

	@Autowired
	RecensioneRepository recensioneRepository;
	
	@Autowired
	RecensioneConverter recensioneConverter;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;
	
	@Override
	public List<Recensione> getAllRecensioni() {
		return recensioneRepository.findAll();
	}

	@Override
	public List<RecensioneDTO> getAllRecensioniDTO() {
		return recensioneConverter.convertListRecensione(getAllRecensioni());
	}

	@Override
	public List<RecensioneDTO> getAllRecensioniDTOByIdArticolo(Integer id) {
		List<Recensione> recensioni = recensioneRepository.findAll(); 
		for(int i = 0; i < recensioni.size(); i++) {
			if (recensioni.get(i).getIdArticolo()!= id) {
				recensioni.remove(i);
			}
		}
		return recensioneConverter.convertListRecensione(recensioni);
	}

	@Override
	public Recensione saveRecensione(Recensione recensione) {
		recensione.setId(sequenceGeneratorService.generateSequence(Recensione.SEQUENCE_NAME));
		return recensioneRepository.save(recensione);
	}

}
