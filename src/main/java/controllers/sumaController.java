package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/suma")
public class sumaController {

    @GetMapping("")
    public String suma (){

        return "suma.html";
    }

}
