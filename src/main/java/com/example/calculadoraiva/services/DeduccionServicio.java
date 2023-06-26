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
    public void crearDeduccion(double precio, double porcentaje){
        double iva=precio*porcentaje/100;
        double resultado=precio-iva;
        Deduccion d=new Deduccion();
        d.setPrecio(precio);
        d.setPorcentaje(porcentaje);
        d.setResultado(resultado);
        d.setFecha(new Date());
        deduccionRepositorio.save(d);

    }

    public List<Deduccion> listarTodos(){
        List<Deduccion> lista =deduccionRepositorio.findAll();
        return lista;
    }

}
