package com.example.demo.service.impl;

import com.example.demo.model.Producto;
import com.example.demo.model.Solicitud;
import com.example.demo.repository.SolicitudRepository;
import com.example.demo.service.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SolicitudServiceImpl implements ISolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;


    @Override
    public Solicitud guardarSolicitud (Solicitud solicitud){
        return solicitudRepository.save(solicitud);
    }

    @Override
    public ArrayList<Solicitud> getAllSolicitudes() {
        ArrayList<Solicitud> solicituds = (ArrayList<Solicitud>) solicitudRepository.findAll();
        return solicituds;
    }

    @Override
    public Solicitud actualizarSolicitud(Integer id, Solicitud nuevoSolicitud) {
        Solicitud solicitudExistente = solicitudRepository.findById(id).orElse(null);

        if (solicitudExistente != null) {

            solicitudExistente.setFechaSolicitud(nuevoSolicitud.getFechaSolicitud());
            solicitudExistente.setNombreTrabajador(nuevoSolicitud.getNombreTrabajador());
            solicitudExistente.setNombreProducto(nuevoSolicitud.getNombreProducto());
            solicitudExistente.setCantidad(nuevoSolicitud.getCantidad());
            solicitudExistente.setTalla(nuevoSolicitud.getTalla());
            solicitudExistente.setProyecto(nuevoSolicitud.getProyecto());
            solicitudExistente.setArea(nuevoSolicitud.getArea());
            solicitudExistente.setObservaciones(nuevoSolicitud.getObservaciones());

            return solicitudRepository.save(solicitudExistente);
        } else {

            return null;
        }
    }

    @Override
    public void borrarSolicitud(Integer idsolicitud) {
        solicitudRepository.deleteById(idsolicitud);
    }

}
