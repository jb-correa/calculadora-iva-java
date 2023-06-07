package com.example.calculadoraiva.controllers;

import com.example.calculadoraiva.services.DeduccionServicio;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/deducir-iva")
public class DeduccionControlador {

    @Autowired
    private DeduccionServicio deduccionServicio;

    @GetMapping("")
    public String deduccion(){
        return "deducir.html";
    }

    @Transactional
    @PostMapping("")
    public String deducir(@RequestParam double precio, @RequestParam double porcentaje){

        System.out.println(precio);
        System.out.println(porcentaje);

        deduccionServicio.crearDeduccion(precio, porcentaje);

        return "deducir.html";
    }

}
