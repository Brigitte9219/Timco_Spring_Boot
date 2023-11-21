package com.example.demo.controller;

import com.example.demo.model.Asignacion;
import com.example.demo.model.Producto;
import com.example.demo.service.IAsignacionService;
import com.example.demo.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/asignacion")
public class AsignacionController {

    @Autowired
    private IAsignacionService asignacionService;

    @PostMapping
    public ResponseEntity<Asignacion> guardarAsignacion(@RequestBody Asignacion asignacion){
        Asignacion nuevoasignacion = asignacionService.guardarAsignacion(asignacion);
        return new ResponseEntity<>(nuevoasignacion, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Asignacion> obtenerAsignacion(){
        ArrayList<Asignacion> asignacions =  asignacionService.getAllAsignacion();
        return asignacions;
    }
}
