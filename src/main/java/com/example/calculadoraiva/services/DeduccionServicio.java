package com.example.calculadoraiva.services;

import com.example.calculadoraiva.entities.Deduccion;
import com.example.calculadoraiva.repositories.DeduccionRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DeduccionServicio {

    @Autowired
    private DeduccionRepositorio deduccionRepositorio;

    @Transactional
    public void crearDeduccion(Deduccion d){

        double iva=d.getPrecio()*d.getPorcentaje()/100;
        d.setResultado(d.getPrecio()+iva);
        d.setFecha(new Date());

        deduccionRepositorio.save(d);

    }

    public List<Deduccion> listarTodos(){
        return deduccionRepositorio.findAll();
    }

}
