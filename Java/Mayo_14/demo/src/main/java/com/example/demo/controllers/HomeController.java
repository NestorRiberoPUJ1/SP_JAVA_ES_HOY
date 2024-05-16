package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /* PARAMETROS DE CONSULTA */

    @GetMapping("/productos")
    public String homeProductos(@RequestParam(value = "item") String item, @RequestParam(value = "talla") Integer talla,
            @RequestParam(value = "color") String color) {

        return "Estas buscando " + item + " de talla " + talla + " en " + color;
    }

    @GetMapping("/mascotas")
    public String homeMascotas(@RequestParam(value = "sexo", required = false) String sexo,
            @RequestParam(value = "especie") String especie,
            @RequestParam(value = "edad", required = false) Integer edad) {
        return "Estas buscando " + especie + " de genero " + sexo + " de " + edad + " años";
    }

    /* VARIABLES DE RUTA */
    /* jn 12, 25-26 */
    @GetMapping("/versiculo/{libro}")
    public String homeBiblia(@PathVariable("libro") String libro) {
        return "Estas buscando " + libro;
    }

    @GetMapping("/versiculo/{libro}/{capitulo}")
    public String homeBiblia(@PathVariable("libro") String libro, @PathVariable("capitulo") Integer capitulo) {
        return "Estas buscando " + libro + " capitulo " + capitulo;
    }

    @GetMapping("/versiculo/{libro}/{capitulo}/{versiculos}")
    public String homeBiblia(@PathVariable("libro") String libro, @PathVariable("capitulo") Integer capitulo,
            @PathVariable("versiculos") String versiculos) {
        return "Estas buscando " + libro + " capitulo " + capitulo + " versiculos " + versiculos;
    }

}
