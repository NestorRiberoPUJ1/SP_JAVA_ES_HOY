package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/home")
public class HomeController {



    @GetMapping("")
    public String home() {
        return "HOME PAGE";
    }
    
    @GetMapping("/visita")
    public String homeVisita() {
        return "HOME PAGE PARA VISTANTES";
    }

    @GetMapping("/usuarios")
    public String homeUsuarios() {
        return "HOME PAGE PARA USUARIOS";
    }
    

}
