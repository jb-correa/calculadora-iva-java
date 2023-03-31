package com.example.calculadoraiva.repositories;

import com.example.calculadoraiva.entities.Deduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeduccionRepositorio extends JpaRepository<Deduccion, String> {
}
