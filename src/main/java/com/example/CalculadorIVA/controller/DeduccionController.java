package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deducir-iva")
public class DeduccionController {

    @Autowired
    public CalculadoraService calculadoraService;

    @PostMapping("/")
    public String deduccion(Integer iva, Integer precio){

        double resultado=calculadoraService.deducirIVA(iva, precio);

        return "";
    }
}
