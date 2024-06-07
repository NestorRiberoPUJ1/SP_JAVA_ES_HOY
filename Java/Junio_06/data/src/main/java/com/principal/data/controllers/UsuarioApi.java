package com.principal.data.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.principal.data.models.Usuario;
import com.principal.data.services.UsuarioService;

import lombok.AllArgsConstructor;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioApi {
    private final UsuarioService usuarioService;

    @PostMapping("")
    public String createUser() {

        Usuario nestor = new Usuario(null, "12345678", "Nestor", "Ribero", "nestor@email.com", "575757570",
                new Date("1997/06/20"), false, 185.0, null, null);

        System.out.println(nestor);
        usuarioService.createUsuario(nestor);

        return "CREATED";
    }

}
