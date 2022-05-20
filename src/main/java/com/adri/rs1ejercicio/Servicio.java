package com.adri.rs1ejercicio;

import com.adri.rs1ejercicio.model.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Servicio {
    private List<Persona> personas;

    Servicio(){
        this.personas = new ArrayList<>();
    }
    public void addPersona(Persona persona) {
        personas.add(persona);
        System.out.println(personas);
    }

    public Persona findPersona(String id) {
            return personas.stream()
                    .filter(p-> p.getId().equals(id))
                    .findFirst()
                    .orElse(null);
    }
}
