package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;


import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;

public interface AlumnoDao extends PersonaDAO {
    Iterable<Persona> buscarAlumnoPorNombreCarrera(String nombre);

}
