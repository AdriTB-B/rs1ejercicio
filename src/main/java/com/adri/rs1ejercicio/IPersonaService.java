package com.adri.rs1ejercicio;

import com.adri.rs1ejercicio.model.Persona;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface IPersonaService {
    void addPersona(Persona persona);
    Persona findPersona(Long id);
    boolean eliminar(Long id);
    Persona findPersona(String nombre);

}
