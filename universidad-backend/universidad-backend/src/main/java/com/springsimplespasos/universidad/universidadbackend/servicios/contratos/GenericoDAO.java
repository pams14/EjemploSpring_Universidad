package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface GenericoDAO<E> {

    @Transactional(readOnly = true)
    Optional<E> findById(Integer id);

    E save(E entidad);

    Iterable<E> findAll();

    void deleteById(Integer id);
}

