package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.model.Trabajador;
import com.example.demo.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto){
        Producto nuevoproducto = productoService.guardarProducto(producto);
        return new ResponseEntity<>(nuevoproducto, HttpStatus.CREATED);
    }
}
