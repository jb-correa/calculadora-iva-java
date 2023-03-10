package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.entidades.Suma;
import com.example.CalculadorIVA.servicios.SumaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sumar-iva/{id}")
public class SumaController {

    @Autowired
    public SumaServicio sumaServicio;

    @GetMapping("/")
    public String suma(@PathVariable("id") String id, Model modelo){


        return "sumar.html";
    }

    @PostMapping("/")
    public String sumar(double precio, double iva, Model modelo){

        Suma suma=sumaServicio.sumarIva(precio, iva);
        String id=suma.getId();

        return "sumar.html";
    }

}


