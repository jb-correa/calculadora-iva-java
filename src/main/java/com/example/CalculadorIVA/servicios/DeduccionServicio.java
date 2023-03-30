package com.example.CalculadorIVA.servicios;

import com.example.CalculadorIVA.entidades.Deduccion;
import com.example.CalculadorIVA.entidades.Suma;
import com.example.CalculadorIVA.repositorios.DeduccionRepositorio;
import com.example.CalculadorIVA.repositorios.SumaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
public class DeduccionServicio {

    @Autowired
    public DeduccionRepositorio deduccionRepositorio;

    @Transactional
    public Deduccion crearDeduccion(double precio, double porcentaje, double resultado){

        Deduccion d=new Deduccion();
        d.setPrecio(precio);
        d.setPorcentaje(porcentaje);
        d.setResultado(resultado);
        d.setFecha(new Date());
        deduccionRepositorio.save(d);
        return d;
    }
}
