package com.example.CalculadorIVA.controller;

import com.example.CalculadorIVA.servicios.DeduccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deducir-iva")
public class DeduccionController {

    @Autowired
    public DeduccionServicio deduccionServicio;

    @GetMapping("/deducir")
    public String deduccion( Model modelo){

        return "deducir.html";
    }

    @PostMapping("/deduccion")
    public String deducir(Integer iva, Integer precio, Model modelo){

        return "deducir.html";
    }




}
