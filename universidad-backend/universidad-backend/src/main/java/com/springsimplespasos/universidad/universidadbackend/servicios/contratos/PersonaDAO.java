package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface PersonaDAO extends GenericoDAO<Persona> {


    @Transactional(readOnly = true)
    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);

    @Transactional(readOnly = true)
    Optional<Persona> buscarPorDni(String dni);

    @Transactional(readOnly = true)
    Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
