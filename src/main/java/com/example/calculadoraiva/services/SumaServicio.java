package com.example.calculadoraiva.services;

import com.example.calculadoraiva.entities.Suma;
import com.example.calculadoraiva.repositories.SumaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SumaServicio {

    @Autowired
    private SumaRepositorio sumaRepositorio;

    @Transactional
    public void crearSuma(double precio, double porcentaje){
        double iva=precio*porcentaje/100;
        double resultado=precio+iva;
        Suma suma=new Suma();
        suma.setPrecio(precio);
        suma.setPorcentaje(porcentaje);
        suma.setResultado(resultado);
        suma.setFecha(new Date());
        sumaRepositorio.save(suma);

    }



}
