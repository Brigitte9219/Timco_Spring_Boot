package com.example.demo.controller;

import com.example.demo.model.Contacto;
import com.example.demo.model.Pqrsf;
import com.example.demo.service.IContactoService;
import com.example.demo.service.IPqrsf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    @GetMapping
    public Iterable<Pqrsf> obtenerPqrsf(){
        ArrayList<Pqrsf> pqrsfs =  pqrsfservice.getAllPqrsf();
        return pqrsfs;
    }
}
