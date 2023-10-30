package com.example.calculadoraiva.controllers;

import com.example.calculadoraiva.entities.Deduccion;
import com.example.calculadoraiva.entities.Suma;
import com.example.calculadoraiva.repositories.SumaRepositorio;
import com.example.calculadoraiva.services.SumaServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sumar-iva")
public class SumaControlador {

    @Autowired
    private SumaServicio sumaServicio;

    @Autowired
    private SumaRepositorio sumaRepositorio;

    @GetMapping("")
    public String suma(){
        return "sumar.html";
    }

    @PostMapping("")
    public String sumar(@RequestParam double precio, @RequestParam double porcentaje, ModelMap modelo){

        sumaServicio.crearSuma(precio, porcentaje);

        return "sumado.html";
    }

    @GetMapping("/sumado")
    public String sumado(ModelMap model){

        List<Suma> lista=sumaServicio.listarTodos();

        Suma s=lista.get(lista.size()-1);
        System.out.println(s);
        model.put("s", s);
        return "sumado.html";
    }

}
