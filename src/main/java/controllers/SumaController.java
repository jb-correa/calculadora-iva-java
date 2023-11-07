package controllers;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.SumaService;

@Controller
@RequestMapping("/suma")
public class SumaController {

    @Autowired
    private SumaService sumaService;

    @GetMapping("/suma")
    public String suma(){

        return "suma.html";
    }

    @Transactional
    @PostMapping("/suma")
    public String sumar(@RequestParam double precio, @RequestParam double porcentaje){

        sumaService.crearSuma(precio, porcentaje);

        return "suma.html";
    }

}
