package com.adri.rs1ejercicio.controller.create;

import com.adri.rs1ejercicio.model.Persona;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface Create {
    @RequestMapping("/persona")
    Persona postPersona(@RequestBody Persona persona);
}
