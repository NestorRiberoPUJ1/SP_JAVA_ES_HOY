package com.principal.plantillas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {

    @GetMapping("/")
    public String root() {
        return "demo.jsp";
    }

    @GetMapping("/demo/{mascota}/{genero}")
    public String getMethodName(Model model, @PathVariable("mascota") String mascota,@PathVariable("genero") String genero) {
        Integer edad=12;
        Integer estatura=24;
        model.addAttribute("pet", mascota);
        model.addAttribute("gender", genero);
        model.addAttribute("age", edad);
        model.addAttribute("height", estatura);
        return "mascota.jsp";
    }

}
