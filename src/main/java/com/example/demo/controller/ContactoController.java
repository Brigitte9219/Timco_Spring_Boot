package com.example.demo.controller;

import com.example.demo.model.Contacto;
import com.example.demo.model.Trabajador;
import com.example.demo.service.IContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
    @Autowired
    private IContactoService contactoService;

    @GetMapping
    public Iterable<Contacto> obtenerContactos(){
        ArrayList<Contacto> contactos =  contactoService.getAllContacto();
        return contactos;
    }

    @PostMapping
    public ResponseEntity<Contacto> guardarUsuario(@RequestBody Contacto contacto) {
        Contacto nuevoContacto = contactoService.guardarContacto(contacto);
        return new ResponseEntity<>(nuevoContacto, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "{id}")
    public void eliminar(@PathVariable("id") Integer idcontacto) {
         contactoService.borrarContacto(idcontacto);
    }

    @PutMapping("/{id}")
    public Contacto actualizarContacto(@PathVariable Integer id, @RequestBody Contacto nuevoContacto) {
        return contactoService.actualizarContacto(id, nuevoContacto);
    }



}
