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

    @Override
    public Producto actualizarProducto(Integer id, Producto nuevoProducto) {
        Producto productoExistente = productoRepository.findById(id).orElse(null);

        if (productoExistente != null) {

            productoExistente.setNombre(nuevoProducto.getNombre());
            productoExistente.setCodigoInterno(nuevoProducto.getCodigoInterno());
            productoExistente.setMarca(nuevoProducto.getMarca());
            productoExistente.setSerie(nuevoProducto.getSerie());
            productoExistente.setFechaFabricacion(nuevoProducto.getFechaFabricacion());
            productoExistente.setReferencia(nuevoProducto.getReferencia());
            productoExistente.setLote(nuevoProducto.getLote());
            productoExistente.setNormaTecnica(nuevoProducto.getNormaTecnica());
            productoExistente.setCantidad(nuevoProducto.getCantidad());
            productoExistente.setProveedor(nuevoProducto.getProveedor());

            return productoRepository.save(productoExistente);
        } else {

            return null;
        }
    }

    @Override
    public void borrarProducto(Integer idproducto) {
        productoRepository.deleteById(idproducto);
    }



}



