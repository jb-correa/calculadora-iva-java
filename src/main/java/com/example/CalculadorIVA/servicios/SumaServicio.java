package com.example.CalculadorIVA.servicios;

import com.example.CalculadorIVA.entidades.Suma;
import com.example.CalculadorIVA.repositorios.SumaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SumaServicio {

    @Autowired
    public SumaRepositorio sumaRepositorio;

    public Suma sumarIva (double precio, double porcentaje){

        double iva=precio*porcentaje/100;

        double resultado=precio+iva;

        Suma suma=crearSuma(precio, porcentaje, resultado);

        return suma;
    }

    public Suma crearSuma(double precio, double porcentaje, double resultado){

        Suma suma=new Suma();
        suma.setPrecio(precio);
        suma.setPorcentaje(porcentaje);
        suma.setResultado(resultado);
        suma.setFecha(new Date());
        sumaRepositorio.save(suma);
        return suma;
    }

}
