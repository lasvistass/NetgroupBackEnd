package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.DTO.ArticoloNPDTO;
import com.example.demo.entity.Articolo;

@Component
public class ArticoloNPConverter {

	public ArticoloNPDTO convertNP(Articolo articolo) {
		ArticoloNPDTO np = new ArticoloNPDTO();
		np.setNome(articolo.getNome());
		np.setPrezzo(articolo.getPrezzo());
		return np;
	}
	
	public List<ArticoloNPDTO> converListNP(List<Articolo> articoli){
		List<ArticoloNPDTO> npList = new ArrayList<>();
		for( int i = 0; i < articoli.size(); i++) {
			npList.add(convertNP(articoli.get(i)));
		}
		return npList;
	}
}
