package com.example.CalculadorIVA.repositorios;

import com.example.CalculadorIVA.entidades.Suma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SumaRepositorio extends JpaRepository<Suma, String> {



}
