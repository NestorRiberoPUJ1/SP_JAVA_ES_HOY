package com.principal.data.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.principal.data.models.Usuario;
import com.principal.data.services.UsuarioService;

import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioApi {
    private final UsuarioService usuarioService;

    @GetMapping("")
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable("id") Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping("")
    public Usuario createUsuario(@RequestParam("dni") String dni, @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido, @RequestParam("email") String email,
            @RequestParam("telefono") String telefono, @RequestParam("cumpleaños") String cumpleaños,
            @RequestParam("soltero") Boolean soltero, @RequestParam("estatura") String estatura) {
        Usuario usuario = new Usuario(null, dni, nombre, apellido, email, telefono, new Date(cumpleaños), soltero,
                Double.parseDouble(estatura), null,
                null,null);
        return usuarioService.createUsuario(usuario);

    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable("id") Long id,
            @RequestParam("dni") String dni, @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido, @RequestParam("email") String email,
            @RequestParam("telefono") String telefono, @RequestParam("cumpleaños") String cumpleaños,
            @RequestParam("soltero") Boolean soltero, @RequestParam("estatura") String estatura) {

        Usuario usuario = new Usuario(id, dni, nombre, apellido, email, telefono, new Date(cumpleaños), soltero,
                Double.parseDouble(estatura), null, null,null);

        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Long id) {
        usuarioService.deleteUsuario(id);
    }

}
