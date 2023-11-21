package com.example.demo.service.impl;

import com.example.demo.model.Asignacion;
import com.example.demo.model.Producto;
import com.example.demo.model.Solicitud;
import com.example.demo.repository.AsignacionRepository;
import com.example.demo.service.IAsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AsignacionServiceImpl implements IAsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;

    @Override
    public Asignacion guardarAsignacion (Asignacion asignacion){
        return asignacionRepository.save(asignacion);
    }

    @Override
    public ArrayList<Asignacion> getAllAsignacion() {
        ArrayList<Asignacion> asignacions = (ArrayList<Asignacion>) asignacionRepository.findAll();
        return asignacions;
    }

    @Override
    public Asignacion actualizarAsignacion(Integer id, Asignacion nuevoAsignacion) {
        Asignacion asignacionExistente = asignacionRepository.findById(id).orElse(null);

        if (asignacionExistente != null) {

            asignacionExistente.setFechaAsignacion(nuevoAsignacion.getFechaAsignacion());
            asignacionExistente.setNombreTrabajador(nuevoAsignacion.getNombreTrabajador());
            asignacionExistente.setNombreProducto(nuevoAsignacion.getNombreProducto());
            asignacionExistente.setCantidad(nuevoAsignacion.getCantidad());
            asignacionExistente.setTalla(nuevoAsignacion.getTalla());
            asignacionExistente.setProyecto(nuevoAsignacion.getProyecto());
            asignacionExistente.setArea(nuevoAsignacion.getArea());
            asignacionExistente.setObservaciones(nuevoAsignacion.getObservaciones());

            return asignacionRepository.save(asignacionExistente);
        } else {

            return null;
        }
    }

    @Override
    public void borrarAsignacion(Integer idasignacion) {
        asignacionRepository.deleteById(idasignacion);
    }



}
