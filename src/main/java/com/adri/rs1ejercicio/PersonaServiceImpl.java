package com.adri.rs1ejercicio;

import com.adri.rs1ejercicio.model.Persona;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonaServiceImpl implements IPersonaService{
    private List<Persona> personas;

    PersonaServiceImpl(){
        this.personas = new ArrayList<>();
    }
    @Override
    public void addPersona(Persona persona) {
        persona.setId(Integer.toUnsignedLong(personas.size()));
        personas.add(persona);
        System.out.println(personas);
    }
    @Override
    public Persona findPersona(Long id) {
        return personas.stream()
                .filter(p->p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    @Override
    public Persona findPersona(String nombre) {
        return personas.stream()
                .filter(p->p.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }
    @Override
    public boolean eliminar(Long id) {
        Persona persona = findPersona(id);
        return personas.remove(persona);
    }
}
