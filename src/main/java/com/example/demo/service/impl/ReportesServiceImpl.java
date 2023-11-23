package com.example.demo.service.impl;

import com.example.demo.model.Producto;
import com.example.demo.model.Reportes;
import com.example.demo.repository.ReportesRepository;
import com.example.demo.service.IReportesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReportesServiceImpl implements IReportesService {

    @Autowired
    private ReportesRepository reportesRepository;

    @Override
    public Reportes guardarReportes (Reportes reportes){
        return reportesRepository.save(reportes);
    }

    @Override
    public ArrayList<Reportes> getAllReportes() {
        ArrayList<Reportes> reportes = (ArrayList<Reportes>) reportesRepository.findAll();
        return reportes;
    }

    @Override
    public Reportes actualizarReportes(Integer id, Reportes nuevoReportes) {
        Reportes reportesExistente = reportesRepository.findById(id).orElse(null);

        if (reportesExistente != null) {

            reportesExistente.setNombreTrabajador(nuevoReportes.getNombreTrabajador());
            reportesExistente.setNumeroId(nuevoReportes.getNumeroId());
            reportesExistente.setNombreProducto(nuevoReportes.getNombreProducto());
            reportesExistente.setFechaInicio(nuevoReportes.getFechaInicio());
            reportesExistente.setFechaFinal(nuevoReportes.getFechaFinal());
            reportesExistente.setProyecto(nuevoReportes.getProyecto());
            reportesExistente.setArea(nuevoReportes.getArea());

            return reportesRepository.save(reportesExistente);
        } else {

            return null;
        }
    }

    @Override
    public void borrarReportes(Integer idreportes) {
        reportesRepository.deleteById(idreportes);
    }


}
