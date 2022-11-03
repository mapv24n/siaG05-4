package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Tripulante;

@Repository
public interface TripulanteService extends JpaRepository<Tripulante, Integer> {

}
