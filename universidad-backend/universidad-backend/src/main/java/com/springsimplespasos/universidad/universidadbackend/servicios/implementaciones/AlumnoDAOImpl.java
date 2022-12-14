package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.repositorios.AlumnoRepository;
import com.springsimplespasos.universidad.universidadbackend.repositorios.PersonaRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDao {

    @Autowired

    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos") PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> buscarAlumnoPorNombreCarrera(String nombre) {
        return ((AlumnoRepository) repository).buscarAlumnoPorNombreCarrera(nombre);
    }


}

