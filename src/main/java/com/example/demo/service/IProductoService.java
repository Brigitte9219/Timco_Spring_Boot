package com.example.demo.service;

import com.example.demo.model.Producto;

import java.util.ArrayList;

public interface IProductoService {

    Producto guardarProducto (Producto producto);

    ArrayList<Producto> getAllProductos();

    Producto actualizarProducto(Integer id, Producto nuevoProducto);

    void borrarProducto(Integer idproducto);
}
