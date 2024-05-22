package com.principal.session.controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // SOLO APIs
public class HomeController {

    @GetMapping("/")
    public String root(HttpSession session) {
        Integer visitas;
        if (session.getAttribute("visitas") == null) {// NO HAY COOKIE VISITAS CREADA PREVIAMENTE
            visitas = 1; // ASIGNA VALOR ININICAL
        } else {
            visitas = (Integer) session.getAttribute("visitas"); // asigna nuevo valor
            visitas++; // INCREMENTA VALOR
        }

        session.setAttribute("visitas", visitas);
        return "GRACIAS POR VISITAR #" + visitas;
    }

    @PostMapping("/")
    public String loginPost(@RequestParam("userInput") String user, @RequestParam("passwordInput") String password) {
        
        System.out.println(user);
        System.out.println(password);
        
        return "ACCOUNT OK";
    }
    

}
