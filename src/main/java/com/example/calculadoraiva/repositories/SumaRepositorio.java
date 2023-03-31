package com.example.calculadoraiva.repositories;

import com.example.calculadoraiva.entities.Suma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumaRepositorio  extends JpaRepository<Suma, String> {
}
