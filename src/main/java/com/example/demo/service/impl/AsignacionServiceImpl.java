package com.example.demo.service.impl;

import com.example.demo.model.Asignacion;
import com.example.demo.model.Producto;
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



}
