package com.principal.data.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.principal.data.models.Usuario;
import com.principal.data.repositories.UsuarioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario createUsuario(Usuario user) {
        return usuarioRepository.save(user);
    }

    public Usuario updateUsuario(Usuario user) {
        return usuarioRepository.save(user);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

}
