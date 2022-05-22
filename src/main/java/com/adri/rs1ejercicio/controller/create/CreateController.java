package com.adri.rs1ejercicio.controller.create;

import com.adri.rs1ejercicio.Servicio;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class CreateController implements Create{
    @Autowired
    Servicio servicio;

    @Override
    public Persona postPersona(Persona persona) {
        servicio.addPersona(persona);
        return persona;
    }
}
