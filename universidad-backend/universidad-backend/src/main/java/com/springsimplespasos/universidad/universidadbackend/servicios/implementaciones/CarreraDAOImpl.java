package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.repositorios.CarreraRpository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarreraDAOImpl implements CarreraDAO {

    @Autowired
    private CarreraRpository rpository;

    @Override
    public Optional<Carrera> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Carrera save(Carrera carrera) {
        return null;
    }

    @Override
    public Iterable<Carrera> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
