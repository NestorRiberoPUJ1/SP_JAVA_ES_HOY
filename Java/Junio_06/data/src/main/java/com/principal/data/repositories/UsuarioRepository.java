package com.principal.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.data.models.Usuario;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    
    /* OBTENER TODA LA LISTA DE USUARIOS */
    List<Usuario> findAll();

    /* BUSCAR POR ALGUNA COLUMNA */
    List<Usuario> findByDni(String dni);
    List<Usuario> findByNombre(String nombre);
    List<Usuario> findByApellido(String apellido);
    List<Usuario> findByEmail(String email);

    /* CONTAR COINCIDENCIAS */
    Long countBySoltero(Boolean soltero);

}
