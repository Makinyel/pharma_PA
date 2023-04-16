package com.example.pharma.infrastructure.repository;

import com.example.pharma.domain.entities.Keys.KeyPersona;
import com.example.pharma.domain.entities.Persona.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, KeyPersona> {
}
