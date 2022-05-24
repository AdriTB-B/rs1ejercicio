package com.adri.rs1ejercicio.controller;

import com.adri.rs1ejercicio.IPersonaService;
import com.adri.rs1ejercicio.PersonaServiceImpl;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class CreateController{
    @Autowired
    IPersonaService servicio;

    @PostMapping
    public Persona postPersona(@RequestBody Persona persona) {
        System.out.println(persona);
        servicio.addPersona(persona);
        return persona;
    }
}
