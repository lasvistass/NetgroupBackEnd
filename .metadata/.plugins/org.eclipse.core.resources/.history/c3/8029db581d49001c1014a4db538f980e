package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.DTO.ArticoloDTO;
import com.example.demo.DTO.RecensioneDTO;
import com.example.demo.entity.Articolo;
import com.example.demo.feign.RecensioneClient;

@Component
public class ArticoloConverter {
	
	@Autowired
	RecensioneClient recensioneClient;

	public ArticoloDTO covertArticolo(Articolo articolo) {
		ArticoloDTO articoloDTO = new ArticoloDTO();
		articoloDTO.setNome(articolo.getNome());
		articoloDTO.setPrezzo(articolo.getPrezzo());
		List<RecensioneDTO> recensioni = recensioneClient.getAllRecensioniDTOByID(articolo.getIdArticolo());
		for(int i = 0; i < recensioni.size(); i++) {
			articoloDTO.getRecensioniDTO().add(recensioni.get(i));
		}
		return articoloDTO;
	}
	
	public List<ArticoloDTO> covertListArticolo(List<Articolo> articoli){
		List<ArticoloDTO> articoliDTO = new ArrayList<>();
		for( int i = 0; i < articoli.size(); i++) {
			articoliDTO.add(covertArticolo(articoli.get(i)));
		}
		return articoliDTO;
	}
}
