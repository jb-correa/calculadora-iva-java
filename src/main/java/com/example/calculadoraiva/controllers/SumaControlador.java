package com.example.calculadoraiva.controllers;

import com.example.calculadoraiva.services.SumaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sumar-iva")
public class SumaControlador {

    @Autowired
    private SumaServicio sumaServicio;

    @GetMapping("")
    public String suma(){
        return "sumar.html";
    }

    @PostMapping("")
    public String sumar(@RequestParam double precio, @RequestParam double porcentaje){

        sumaServicio.crearSuma(precio, porcentaje);

        return "sumar.html";
    }

}
