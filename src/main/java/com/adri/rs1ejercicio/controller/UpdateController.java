package com.adri.rs1ejercicio.controller;

import com.adri.rs1ejercicio.IPersonaService;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class UpdateController{
    @Autowired
    IPersonaService servicio;

    @PutMapping("/{id}")
    public Persona updatePersona(
            @PathVariable("id") Long id,
            @RequestBody Persona pModificada
    ) {
        Persona pGuardada = servicio.findPersona(id);
        Optional<Persona> oP = Optional.of(pModificada);
        //Update
        pGuardada.setNombre(oP.map(Persona::getNombre).orElse(pGuardada.getNombre()));
        pGuardada.setEdad(oP.map(Persona::getEdad).orElse(pGuardada.getEdad()));
        pGuardada.setPoblacion(oP.map(Persona::getPoblacion).orElse(pGuardada.getPoblacion()));
        return pGuardada;
    }
}
