package com.example.CalculadorIVA.controller;


import com.example.CalculadorIVA.servicios.SumaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LandingController {


    @GetMapping("/")
    public String calcular(){

        return "index.html";
    }

}
