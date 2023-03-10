package com.example.CalculadorIVA.repositorios;

import com.example.CalculadorIVA.entidades.Deduccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeduccionRepositorio extends JpaRepository<Deduccion, String> {

}
