package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.entidades.Suma;
import com.example.CalculadorIVA.repositorios.SumaRepositorio;
import com.example.CalculadorIVA.servicios.SumaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sumar-iva")
public class SumaController {

    @Autowired
    public SumaServicio sumaServicio;

    @Autowired
    public SumaRepositorio sumaRepositorio;

    @GetMapping("/sumar")
    public String suma( Model modelo){


        return "sumar.html";
    }

    @PostMapping("/suma")
    public String sumar(double precio, double iva, Model modelo){

        double impuesto=precio*iva/100;
        double resultado=precio+impuesto;

        Suma suma=sumaServicio.crearSuma(precio, iva, resultado);
        modelo.addAttribute("suma", suma);
        modelo.addAttribute("id", suma.getId());

        return "sumado.html";
    }

    @GetMapping("/suma")
    public String sumado(Model modelo){

        String id= (String) modelo.getAttribute("id");

        Suma suma = sumaRepositorio.getById(id);

        System.out.println(suma);

        return "sumado.html";
    }

}


