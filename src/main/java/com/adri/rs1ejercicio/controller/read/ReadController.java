package com.adri.rs1ejercicio.controller.read;

import com.adri.rs1ejercicio.Servicio;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class ReadController implements Read{
    @Autowired
    Servicio servicio;

    @Override
    public Persona getPersonaByNombre(String nombre) {
        return servicio.findPersona(nombre);
    }

    @Override
    public Persona getPersonaById(Long id) {
        return servicio.findPersona(id);
    }
}
