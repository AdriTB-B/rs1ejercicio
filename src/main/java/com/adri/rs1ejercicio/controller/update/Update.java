package com.adri.rs1ejercicio.controller.update;

import com.adri.rs1ejercicio.model.Persona;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface Update {
    @RequestMapping("/persona/{id}")
    Persona updatePersona(@PathVariable("id") String id, @RequestBody Persona personaMod);
}
