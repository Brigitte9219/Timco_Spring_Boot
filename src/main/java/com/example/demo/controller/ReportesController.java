package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.model.Reportes;
import com.example.demo.service.IReportesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/reportes")
public class ReportesController {

    @Autowired
    private IReportesService reportesService;


    @PostMapping
    public ResponseEntity<Reportes> guardarReportes(@RequestBody Reportes reportes){
        Reportes nuevoreportes = reportesService.guardarReportes(reportes);
        return new ResponseEntity<>(nuevoreportes, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Reportes> obtenerReportes(){
        ArrayList<Reportes> reportes =  reportesService.getAllReportes();
        return reportes;
    }

    @PutMapping("/{id}")
    public Reportes actualizarReportes(@PathVariable Integer id, @RequestBody Reportes nuevoReportes) {
        return reportesService.actualizarReportes(id, nuevoReportes);
    }

    @DeleteMapping(path = "{id}")
    public void eliminar(@PathVariable("id") Integer idreportes) {reportesService.borrarReportes(idreportes);
    }
}
