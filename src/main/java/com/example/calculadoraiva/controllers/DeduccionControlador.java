package com.example.calculadoraiva.controllers;

import com.example.calculadoraiva.services.DeduccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deducir-iva")
public class DeduccionControlador {

    @Autowired
    private DeduccionServicio deduccionServicio;

    @GetMapping("")
    public String deduccion(){
        return "";
    }

}
