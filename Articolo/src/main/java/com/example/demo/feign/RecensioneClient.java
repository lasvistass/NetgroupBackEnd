package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.DTO.RecensioneDTO;

@FeignClient(name="RecensioneService", url="http://localhost:8091")
public interface RecensioneClient {
	
	@GetMapping(value="/api/recensione/getAllDTO")
	public List<RecensioneDTO> getAllRecensioniDTO();

	@GetMapping(value="/api/recensione/getAll/{id}")
	public List<RecensioneDTO> getAllRecensioniDTOByID(@PathVariable("id") Integer id );
}
