package com.example.demo.service.impl;

import com.example.demo.model.Producto;
import com.example.demo.model.Trabajador;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto guardarProducto (Producto producto){
        return productoRepository.save(producto);
    }

    @Override
    public ArrayList<Producto> getAllProductos() {
        ArrayList<Producto> productos = (ArrayList<Producto>) productoRepository.findAll();
        return productos;
    }



}
