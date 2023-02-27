package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sumar-iva")
public class SumaController {

    @Autowired
    public CalculadoraService calculadoraService;


    @PostMapping("/")
    public String suma(Integer iva, Integer precio){

        double resultado=calculadoraService.sumarIVA( iva, precio);

        return "";
    }

}


