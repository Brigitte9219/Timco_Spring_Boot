package com.example.demo.controller;

import com.example.demo.model.Asignacion;
import com.example.demo.model.Producto;
import com.example.demo.service.IAsignacionService;
import com.example.demo.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/asignacion")
public class AsignacionController {

    @Autowired
    private IAsignacionService asignacionService;

    @GetMapping
    public Iterable<Asignacion> obtenerAsignacion(){
        ArrayList<Asignacion> asignacions =  asignacionService.getAllAsignacion();
        return asignacions;
    }
}
