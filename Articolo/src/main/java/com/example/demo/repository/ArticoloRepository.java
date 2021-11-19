package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Articolo;

public interface ArticoloRepository extends JpaRepository<Articolo, Integer> {

}
