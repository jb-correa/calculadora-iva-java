package com.example.calculadoraiva.controllers;

import com.example.calculadoraiva.entities.Deduccion;
import com.example.calculadoraiva.services.DeduccionServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/deducir-iva")
public class DeduccionControlador {

    @Autowired
    private DeduccionServicio deduccionServicio;

    @GetMapping("")
    public String deduccion(){
        return "deducir.html";
    }

    @PostMapping("")
    public String deducir(@RequestParam double precio, @RequestParam double porcentaje){

        System.out.println(precio);
        System.out.println(porcentaje);

        deduccionServicio.crearDeduccion(precio, porcentaje);

        return "deducido.html";
    }

    @GetMapping("deducido")
    public String deducido(ModelMap model){
        List<Deduccion> lista=deduccionServicio.listarTodos();

        Deduccion d=lista.get(lista.size()-1);
        model.put("d", d);

        return "deducido.html";
    }

}
