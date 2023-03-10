package com.example.CalculadorIVA.servicios;

import com.example.CalculadorIVA.repositorios.DeduccionRepositorio;
import com.example.CalculadorIVA.repositorios.SumaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeduccionServicio {

    @Autowired
    public DeduccionRepositorio deduccionRepositorio;

    public double deducirIva (double precio, double porcentaje){

        double iva=precio*porcentaje/100;

        double resultado=precio-iva;

        return resultado;
    }
}
