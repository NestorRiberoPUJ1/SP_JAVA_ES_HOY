package com.principal.data.services;

import org.springframework.stereotype.Service;

import com.principal.data.models.Usuario;
import com.principal.data.repositories.UsuarioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario user) {
        return usuarioRepository.save(user);
    }

}
