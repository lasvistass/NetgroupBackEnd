package com.example.demo.controllerRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.RecensioneDTO;
import com.example.demo.entity.Recensione;
import com.example.demo.service.RecensioneService;

@RestController
@RequestMapping("/api/recensione")
public class RestRecensione {

	@Autowired
	RecensioneService recensioneService;
	
	@GetMapping(value="/getAllDTO")
	public List<RecensioneDTO> getAllRecensioniDTO(){
		return recensioneService.getAllRecensioniDTO();
	}
	
	@GetMapping(value="/getAll/{id}")
	public List<RecensioneDTO> getAllRecensioniDTOByID(@PathVariable("id") Integer id ){
		return recensioneService.getAllRecensioniDTOByIdArticolo(id);
	}
	
	
	@PostMapping(value="/newRecensione")
	public void newRecensione(@RequestBody Recensione recensione) {
		recensioneService.saveRecensione(recensione);
	}
	
}
