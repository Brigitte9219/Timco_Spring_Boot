package com.example.demo.service;

import com.example.demo.model.Solicitud;

import java.util.ArrayList;

public interface ISolicitudService {

    Solicitud guardarSolicitud (Solicitud solicitud);

    ArrayList<Solicitud> getAllSolicitudes();

    Solicitud actualizarSolicitud(Integer id, Solicitud nuevoSolicitud);
}
