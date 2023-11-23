package com.example.demo.service;

import com.example.demo.model.Reportes;

import java.util.ArrayList;

public interface IReportesService {


    Reportes guardarReportes (Reportes reportes);

    ArrayList<Reportes> getAllReportes();

    Reportes actualizarReportes(Integer id, Reportes nuevoReportes);

    void borrarReportes(Integer idreportes);

}
