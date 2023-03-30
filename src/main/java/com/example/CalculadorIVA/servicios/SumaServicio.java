package com.example.CalculadorIVA.servicios;

import com.example.CalculadorIVA.entidades.Suma;
import com.example.CalculadorIVA.repositorios.SumaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
public class SumaServicio {

    @Autowired
    public SumaRepositorio sumaRepositorio;

    @Transactional
    public void crearSuma(double precio, double porcentaje, double resultado){

        Suma suma=new Suma();
        suma.setPrecio(precio);
        suma.setPorcentaje(porcentaje);
        suma.setResultado(resultado);
        suma.setFecha(new Date());
        sumaRepositorio.save(suma);
        System.out.println(suma);
    }

}
