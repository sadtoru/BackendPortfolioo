package com.portfolio.backend.Repository;

import com.portfolio.backend.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer> {

    public Optional<Proyecto>findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
