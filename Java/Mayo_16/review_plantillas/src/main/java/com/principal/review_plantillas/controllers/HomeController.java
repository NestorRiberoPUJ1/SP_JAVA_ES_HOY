package com.principal.review_plantillas.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root(Model model) {
        String saludo = "HOLA AMIGUITOS";
        model.addAttribute("saludo", saludo);

        return "index.jsp";
    }

    @GetMapping("/estudiantes")
    public String estudiantesPage(Model model) {

        ArrayList<String> listaEstudiantes = new ArrayList<String>();
        listaEstudiantes.add("Max");
        listaEstudiantes.add("Checo");
        listaEstudiantes.add("Charles");
        listaEstudiantes.add("Carlos");
        listaEstudiantes.add("Fernando");
        listaEstudiantes.add("Lando");
        listaEstudiantes.add("George");
        listaEstudiantes.add("Kevin");

        
        model.addAttribute("listaEstudiantes", listaEstudiantes);

        return "estudiantes.jsp";
    }

}
