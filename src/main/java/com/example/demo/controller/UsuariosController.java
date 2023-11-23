package com.example.demo.controller;

import com.example.demo.model.Trabajador;
import com.example.demo.model.Usuarios;
import com.example.demo.service.ITrabajadorService;
import com.example.demo.service.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private IUsuariosService usuariosService;

    @PostMapping
    public ResponseEntity<Usuarios> guardarUsuarios(@RequestBody Usuarios usuarios){
        Usuarios nuevoUsuarios = usuariosService.guardarUsuarios(usuarios);
        return new ResponseEntity<>(nuevoUsuarios, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Usuarios> obtenerUsuarios(){
        ArrayList<Usuarios> usuarios =  usuariosService.getAllUsuarios();
        return usuarios;
    }

    @PutMapping("/{id}")
    public Usuarios actualizarUsuarios(@PathVariable Integer id, @RequestBody Usuarios nuevoUsuarios) {
        return usuariosService.actualizarUsuarios(id, nuevoUsuarios);
    }

    @DeleteMapping(path = "{id}")
    public void eliminar(@PathVariable("id") Integer idusuarios) {
        usuariosService.borrarUsuarios(idusuarios);
    }


}
