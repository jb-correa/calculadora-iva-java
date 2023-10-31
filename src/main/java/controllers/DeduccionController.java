package controllers;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.DeduccionService;

@Controller
@RequestMapping("/deduccion")
public class DeduccionController {

    @Autowired
    private DeduccionService deduccionService;

    @GetMapping("")
    public String deduccion (){

        return "deduccion.html";
    }

    @Transactional
    @PostMapping("")
    public String deducir(@RequestParam double precio, @RequestParam double porcentaje){

        deduccionService.crearDeduccion(precio, porcentaje);

        return "deduccion.html";
    }


}
