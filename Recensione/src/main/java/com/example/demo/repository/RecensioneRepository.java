package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Recensione;

public interface RecensioneRepository extends MongoRepository<Recensione, Integer> {

	
}
