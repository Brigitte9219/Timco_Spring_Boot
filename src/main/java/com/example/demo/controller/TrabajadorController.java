package com.example.demo.controller;


import com.example.demo.model.Contacto;
import com.example.demo.model.Trabajador;
import com.example.demo.service.ITrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {

    @Autowired
    private ITrabajadorService trabajadorService;
    
    @PostMapping
    public ResponseEntity<Trabajador> guardarTrabajador(@RequestBody Trabajador trabajador){
        Trabajador nuevoTrabajador = trabajadorService.guardarTrabajador(trabajador);
        return new ResponseEntity<>(nuevoTrabajador, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Trabajador> obtenerTrabajadores(){
        ArrayList<Trabajador> trabajadores =  trabajadorService.getAllTrabajadores();
        return trabajadores;
    }

    @PutMapping("/{id}")
    public Trabajador actualizarTrabajador(@PathVariable Integer id, @RequestBody Trabajador nuevoTrabajador) {
        return trabajadorService.actualizarTrabajador(id, nuevoTrabajador);
    }

    @DeleteMapping(path = "{id}")
    public void eliminar(@PathVariable("id") Integer idtrabajador) {
        trabajadorService.borrarTrabajador(idtrabajador);
    }

}
