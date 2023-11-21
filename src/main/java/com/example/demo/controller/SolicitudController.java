package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.model.Solicitud;
import com.example.demo.service.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {

    @Autowired
    private ISolicitudService solicitudService;


    @PostMapping
    public ResponseEntity<Solicitud> guardarSolicitud(@RequestBody Solicitud solicitud){
        Solicitud nuevosolicitud = solicitudService.guardarSolicitud(solicitud);
        return new ResponseEntity<>(nuevosolicitud, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Solicitud> obtenerSolicitudes(){
        ArrayList<Solicitud> solicituds =  solicitudService.getAllSolicitudes();
        return solicituds;
    }

    @PutMapping("/{id}")
    public Solicitud actualizarSolicitud(@PathVariable Integer id, @RequestBody Solicitud nuevoSolicitud) {
        return solicitudService.actualizarSolicitud(id, nuevoSolicitud);
    }

    @DeleteMapping(path = "{id}")
    public void eliminar(@PathVariable("id") Integer idsolicitud) {solicitudService.borrarSolicitud(idsolicitud);
    }

}
