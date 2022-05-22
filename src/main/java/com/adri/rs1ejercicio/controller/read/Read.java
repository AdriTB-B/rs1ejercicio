package com.adri.rs1ejercicio.controller.read;

import com.adri.rs1ejercicio.Servicio;
import com.adri.rs1ejercicio.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface Read {
    @GetMapping("/nombre/{nombre}")
    public Persona getPersonaByNombre(@PathVariable("nombre") String nombre);
    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable("id") Long id);
}
