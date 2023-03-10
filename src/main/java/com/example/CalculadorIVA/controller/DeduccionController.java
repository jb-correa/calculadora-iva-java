package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/deducir-iva/{resultado}")
public class DeduccionController {

    @Autowired
    public CalculadoraService calculadoraService;

    @GetMapping("/")
    public String deduccion(@PathVariable("resultado") String res, Model modelo){

        double resultado= Double.parseDouble(res);
        modelo.addAttribute("resultado", resultado);
        return "deducir.html";
    }

    @PostMapping("/")
    public String deducir(Integer iva, Integer precio, Model modelo){

        double resultado=calculadoraService.deducirIVA(iva, precio);
        modelo.addAttribute("resultado", resultado);

        return "deducir.html";
    }




}
