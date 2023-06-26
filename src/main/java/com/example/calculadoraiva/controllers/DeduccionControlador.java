package com.example.calculadoraiva.controllers;

import com.example.calculadoraiva.entities.Deduccion;
import com.example.calculadoraiva.repositories.DeduccionRepositorio;
import com.example.calculadoraiva.services.DeduccionServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/deducir-iva")
public class DeduccionControlador {

    @Autowired
    private DeduccionServicio deduccionServicio;
    @Autowired
    private DeduccionRepositorio deduccionRepositorio;

    @GetMapping("")
    public String deduccion(){
        return "deducir.html";
    }

    @PostMapping("")
    public String deducir(@RequestParam double precio, @RequestParam double porcentaje, ModelMap model){

        System.out.println(precio);
        System.out.println(porcentaje);

        deduccionServicio.crearDeduccion(precio, porcentaje);


        return "deducido.html";
    }

    @GetMapping("/deducido")
    public String deducido(ModelMap model){

        List<Deduccion> lista=deduccionServicio.listarTodos();
        Deduccion d=lista.get(lista.size()-1);
        System.out.println(d);
        model.put("d", d);
        return "deducido.html";
    }

}
