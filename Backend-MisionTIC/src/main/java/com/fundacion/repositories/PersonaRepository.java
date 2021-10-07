package com.fundacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundacion.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
