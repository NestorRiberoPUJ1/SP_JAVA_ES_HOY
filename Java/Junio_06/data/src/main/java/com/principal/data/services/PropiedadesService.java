package com.principal.data.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.principal.data.models.Propiedades;
import com.principal.data.repositories.PropiedadesRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
public class PropiedadesService {
    
    private final PropiedadesRepository propiedadesRepository;

    public List<Propiedades> getPropiedades() {
        return propiedadesRepository.findAll();
    }

    public Propiedades getPropiedadById(Long id) {
        return propiedadesRepository.findById(id).orElse(null);
    }

    public Propiedades createPropiedad(Propiedades propiedad) {
        return propiedadesRepository.save(propiedad);
    }

    public Propiedades updatePropiedad(Propiedades propiedad) {
        return propiedadesRepository.save(propiedad);
    }

    public void deletePropiedad(Long id) {
        propiedadesRepository.deleteById(id);
    }


}
