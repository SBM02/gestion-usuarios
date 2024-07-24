package com.gestionse.controller;

import com.gestionse.model.GestionModel;
import com.gestionse.service.GestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/middleware")
public class GestionseController {

    @Autowired
    private GestionService servicio;

    @PostMapping("/usuarios")
    public ResponseEntity<Object> registrar(@RequestBody(required = false) GestionModel peticion) {

        return servicio.registrar(peticion);

    }
    
    
    @DeleteMapping("/usuarios/{identificador}")
    public ResponseEntity<Object> eliminar(@PathVariable Integer identificador) {

        return servicio.eliminar(identificador);

    }
    
     @GetMapping("/usuarios")
     public ResponseEntity<Object> usuarios() {

        return servicio.usuarios();

    }

}
