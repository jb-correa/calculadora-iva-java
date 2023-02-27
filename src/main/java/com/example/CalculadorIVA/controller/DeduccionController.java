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
@RequestMapping("/deducir-iva")
public class DeduccionController {

    @Autowired
    public CalculadoraService calculadoraService;

    @GetMapping("/deducir")
    public String deduccion(Model modelo){
        modelo.getAttribute("resultado");

        return "deducir.html";
    }

    @PostMapping("/deducir")
    public String deducir(Integer iva, Integer precio, Model modelo){

        double resultado=calculadoraService.deducirIVA(iva, precio);
        modelo.addAttribute("resultado",resultado);

        return "deducir.html";
    }




}
