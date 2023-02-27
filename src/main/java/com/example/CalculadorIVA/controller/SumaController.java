package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sumar-iva")
public class SumaController {

    @Autowired
    public CalculadoraService calculadoraService;

    @GetMapping("/sumar")
    public String suma(Model modelo){
        modelo.getAttribute("resultado");

        return "sumar.html";
    }

    @PostMapping("/sumar")
    public String sumar(Integer iva, Integer precio, Model modelo){

        double resultado=calculadoraService.sumarIVA(iva, precio);
        modelo.addAttribute("resultado",resultado);

        return "";
    }

}


