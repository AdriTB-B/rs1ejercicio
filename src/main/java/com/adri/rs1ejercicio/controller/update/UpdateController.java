package com.adri.rs1ejercicio.controller.update;

import com.adri.rs1ejercicio.Servicio;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateController implements Update{
    @Autowired
    Servicio servicio;

    @Override
    public Persona updatePersona(String id, Persona pModificada) {
        Persona pGuardada = servicio.findPersona(id);
        if(pGuardada != null && pModificada != null){
            //TODO
        }
        return null;
    }
}
