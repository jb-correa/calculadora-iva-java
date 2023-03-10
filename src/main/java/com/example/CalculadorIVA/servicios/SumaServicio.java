package com.example.CalculadorIVA.servicios;

import com.example.CalculadorIVA.entidades.Suma;
import com.example.CalculadorIVA.repositorios.SumaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumaServicio {

    @Autowired
    public SumaRepositorio sumaRepositorio;

    public double sumarIva (double precio, double porcentaje){

        double iva=precio*porcentaje/100;

        double resultado=precio+iva;

        return resultado;
    }

    public void crearSuma(double precio, double porcentaje, double resultado){



    }

}
