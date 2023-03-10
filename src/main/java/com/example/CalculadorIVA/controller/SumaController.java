package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.servicios.SumaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sumar-iva")
public class SumaController {

    @Autowired
    public SumaServicio sumaServicio;

    @GetMapping("/")
    public String suma( Model modelo){


        return "sumar.html";
    }

    @PostMapping("/")
    public String sumar(Integer iva, Integer precio, Model modelo){

        double resultado=sumaServicio.sumarIva(iva, precio);

        return "sumar.html/<double:resultado>";
    }

}


