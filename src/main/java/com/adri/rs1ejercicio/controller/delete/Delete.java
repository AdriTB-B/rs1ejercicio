package com.adri.rs1ejercicio.controller.delete;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface Delete {
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id);
}
