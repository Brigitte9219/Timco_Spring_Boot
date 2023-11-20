package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.model.Trabajador;
import com.example.demo.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    @GetMapping
    public Iterable<Producto> obtenerProductos(){
        ArrayList<Producto> productos =  productoService.getAllProductos();
        return productos;
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Integer id, @RequestBody Producto nuevoProducto) {
        return productoService.actualizarProducto(id, nuevoProducto);
    }

    @DeleteMapping(path = "{id}")
    public void eliminar(@PathVariable("id") Integer idproducto) {productoService.borrarProducto(idproducto);
    }

}
