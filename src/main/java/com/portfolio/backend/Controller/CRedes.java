package com.portfolio.backend.Controller;

import com.portfolio.backend.Dto.dtoRedes;
import com.portfolio.backend.Entity.Redes;
import com.portfolio.backend.Security.Controller.Mensaje;
import com.portfolio.backend.Service.SRedes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redes")
@CrossOrigin(origins = "https://portfolio-daia.web.app")
public class CRedes {

    @Autowired
    SRedes sRedes;

    @GetMapping("/lista")
    public ResponseEntity<List<Redes>> list(){
        List<Redes> list = sRedes.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Redes> getById(@PathVariable("id") int id){
        if(!sRedes.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.BAD_REQUEST);
        }

        Redes redes = sRedes.getOne(id).get();
        return new ResponseEntity(redes, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sRedes.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        }
        sRedes.delete(id);
        return new ResponseEntity(new Mensaje("Red eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoRedes dtoredes){
        if(StringUtils.isBlank(dtoredes.getUrl())){
            return new ResponseEntity(new Mensaje("La url es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        if(sRedes.existsByNombre(dtoredes.getNombre())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Redes redes = new Redes(
                dtoredes.getNombre(), dtoredes.getUrl(), dtoredes.getIconRed()
        );

        sRedes.save(redes);
        return new ResponseEntity(new Mensaje("red creada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody dtoRedes dtoredes){
        if(!sRedes.existsById(id)){
        return new ResponseEntity(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        }
        if(sRedes.existsByNombre(dtoredes.getNombre()) && sRedes.getByNombre(dtoredes.getNombre()).get().getId() != id ){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoredes.getUrl())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacío"), HttpStatus.BAD_REQUEST);
        }

        Redes redes = sRedes.getOne(id).get();

        redes.setNombre(dtoredes.getNombre());
        redes.setUrl(dtoredes.getUrl());
        redes.setIconRed(dtoredes.getIconRed());

        sRedes.save(redes);

        return new ResponseEntity(new Mensaje("Red actualizada"), HttpStatus.OK);

    }



}
