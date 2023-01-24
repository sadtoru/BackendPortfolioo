package com.portfolio.backend.Repository;

import com.portfolio.backend.Entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RRedes extends JpaRepository<Redes, Integer> {
    public Optional<Redes> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
