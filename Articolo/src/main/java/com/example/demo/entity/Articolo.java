package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.example.demo.DTO.RecensioneDTO;

import lombok.Data;

@Entity
@Table(name="Articolo_tab")
@Data
public class Articolo {

	@Id
	@Column(name="idArticolo")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idArticolo;
	
	private String nome;
	
	private double prezzo;
	
	@Transient
	List<RecensioneDTO> recensioniDTO;
}
