package com.principal.data.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.principal.data.models.Propiedades;
import com.principal.data.models.Usuario;
import com.principal.data.services.PropiedadesService;
import com.principal.data.services.UsuarioService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/propiedades")
public class PropiedadesApi {

    private final PropiedadesService propiedadesService;
    private final UsuarioService usuarioService;

    @GetMapping("")
    public List<Propiedades> getPropiedades() {
        return propiedadesService.getPropiedades();
    }

    @GetMapping("/{id}")
    public Propiedades getPropiedadById(@PathVariable("id") Long id){
        return propiedadesService.getPropiedadById(id);
    }

    @PostMapping("")
    public Propiedades createPropiedad(@RequestParam("registro") String registro,
            @RequestParam("categoria") String categoria,
            @RequestParam("direccion") String direccion, @RequestParam("area") Double area, @RequestParam("user_id") Long user_id){
        
        Usuario foundUser = usuarioService.getUsuarioById(user_id);
        if (foundUser == null) {
            return null;
        }

        Propiedades propiedad = new Propiedades(null, registro, categoria, direccion, area, foundUser, null, null);
        return propiedadesService.createPropiedad(propiedad);
    }

    @PutMapping("/{id}")
    public Propiedades updatePropiedad(@PathVariable("id") Long id,
            @RequestParam("registro") String registro, @RequestParam("categoria") String categoria,
            @RequestParam("direccion") String direccion, @RequestParam("area") Double area) {

        Propiedades propiedad = new Propiedades(id, registro, categoria, direccion, area, null, null, null);

        return propiedadesService.updatePropiedad(propiedad);
    }

    @DeleteMapping("/{id}")
    public void deletePropiedad(@PathVariable("id") Long id) {
        propiedadesService.deletePropiedad(id);
    }

}
