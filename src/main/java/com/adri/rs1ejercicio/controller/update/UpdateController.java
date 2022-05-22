package com.adri.rs1ejercicio.controller.update;

import com.adri.rs1ejercicio.Servicio;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UpdateController implements Update{
    @Autowired
    Servicio servicio;

    @Override
    public Persona updatePersona(Long id, Persona pModificada) {
        Persona pGuardada = servicio.findPersona(id);
        Optional<Persona> oP = Optional.of(pModificada);
        //Update
        pGuardada.setNombre(oP.map(Persona::getNombre).orElse(pGuardada.getNombre()));
        pGuardada.setEdad(oP.map(Persona::getEdad).orElse(pGuardada.getEdad()));
        pGuardada.setPoblacion(oP.map(Persona::getPoblacion).orElse(pGuardada.getPoblacion()));
        return pGuardada;
    }
}
