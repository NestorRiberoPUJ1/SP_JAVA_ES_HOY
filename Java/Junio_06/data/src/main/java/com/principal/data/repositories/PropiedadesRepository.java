package com.principal.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.data.models.Propiedades;
import java.util.List;
import java.util.Optional;

@Repository
public interface PropiedadesRepository extends CrudRepository<Propiedades, Long> {

    List<Propiedades> findAll();
    Optional<Propiedades> findById(Long id);

}
