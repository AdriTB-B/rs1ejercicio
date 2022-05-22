package com.adri.rs1ejercicio;

import com.adri.rs1ejercicio.model.Persona;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Servicio {
    private List<Persona> personas;

    Servicio(){
        this.personas = new ArrayList<>();
    }
    public void addPersona(Persona persona) {
        persona.setId(Integer.toUnsignedLong(personas.size()));
        personas.add(persona);
        System.out.println(personas);
    }
    public Persona findPersona(Long id) {
        return personas.stream()
                .filter(p->p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public Persona findPersona(String nombre) {
        return personas.stream()
                .filter(p->p.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminar(Long id) {
        Persona persona = findPersona(id);
        return personas.remove(persona);
    }
}
