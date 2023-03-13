package com.example.CalculadorIVA.repositorios;

import com.example.CalculadorIVA.entidades.Deduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeduccionRepositorio extends JpaRepository<Deduccion, String> {

}
