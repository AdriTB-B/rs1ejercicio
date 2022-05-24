package com.adri.rs1ejercicio.controller;

import com.adri.rs1ejercicio.IPersonaService;
import com.adri.rs1ejercicio.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class DeleteController{
    @Autowired
    IPersonaService servicio;

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        if(servicio.eliminar(id)) return "Persona con id: " + id + " borrada del registro";
        else return "No existe la  persona con id: " + id;
    }
}
