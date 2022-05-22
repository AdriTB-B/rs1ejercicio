package com.adri.rs1ejercicio.controller.delete;

import com.adri.rs1ejercicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class DeleteController implements Delete{
    @Autowired
    Servicio servicio;
    @Override
    public String deleteById(Long id) {
        if(servicio.eliminar(id)) return "Persona con id: " + id + " borrada del registro";
        else return "No existe la  persona con id: " + id;
    }
}
