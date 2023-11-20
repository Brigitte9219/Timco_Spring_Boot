package com.example.demo.controller;

import com.example.demo.model.Contacto;
import com.example.demo.model.Pqrsf;
import com.example.demo.service.IContactoService;
import com.example.demo.service.IPqrsf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pqrsf")
public class PqrsfController {

    @Autowired
    private IPqrsf pqrsfservice;


    @PostMapping
    public ResponseEntity<Pqrsf> guardarUsuario(@RequestBody Pqrsf pqrsf) {
        Pqrsf nuevoPqrsf = pqrsfservice.guardarPqrsf(pqrsf);
        return new ResponseEntity<>(nuevoPqrsf, HttpStatus.CREATED);
    }
}
