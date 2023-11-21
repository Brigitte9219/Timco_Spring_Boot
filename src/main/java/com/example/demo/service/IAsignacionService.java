package com.example.demo.service;

import com.example.demo.model.Asignacion;

import java.util.ArrayList;

public interface IAsignacionService {

    Asignacion guardarAsignacion (Asignacion asignacion);
    ArrayList<Asignacion> getAllAsignacion();

    Asignacion actualizarAsignacion(Integer id, Asignacion nuevoAsignacion);

    void borrarAsignacion(Integer idasignacion);
}
