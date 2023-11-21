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

}
