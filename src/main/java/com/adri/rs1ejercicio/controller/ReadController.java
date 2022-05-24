package com.adri.rs1ejercicio.controller;

import com.adri.rs1ejercicio.IPersonaService;
import com.adri.rs1ejercicio.PersonaServiceImpl;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class ReadController{
    @Autowired
    IPersonaService servicio;

    @GetMapping("/nombre/{nombre}")
    public Persona getPersonaByNombre(@PathVariable("nombre") String nombre) {
        return servicio.findPersona(nombre);
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable("id") Long id) {
        return servicio.findPersona(id);
    }
}
