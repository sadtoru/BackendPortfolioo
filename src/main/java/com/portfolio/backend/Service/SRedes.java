package com.portfolio.backend.Service;

import com.portfolio.backend.Entity.Redes;
import com.portfolio.backend.Repository.RRedes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SRedes {

    @Autowired
    RRedes rRedes;

    public List<Redes> list(){
        return rRedes.findAll();
    }

    public Optional<Redes> getOne(int id){
        return rRedes.findById(id);
    }

    public Optional<Redes> getByNombre(String nombre){
        return rRedes.findByNombre(nombre);
    }

    public void save(Redes redes){
        rRedes.save(redes);
    }

    public void delete(int id){
        rRedes.deleteById(id);
    }

    public boolean existsById(int id){
        return rRedes.existsById(id);
    }

    public boolean existsByNombre(String nombre){
        return rRedes.existsByNombre(nombre);
    }
}
