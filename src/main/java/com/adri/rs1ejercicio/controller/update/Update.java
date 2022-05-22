package com.adri.rs1ejercicio.controller.update;

import com.adri.rs1ejercicio.model.Persona;
import org.springframework.web.bind.annotation.*;

public interface Update {
    @PutMapping("/{id}")
    Persona updatePersona(@PathVariable("id") Long id, @RequestBody Persona personaMod);
}
