package com.example.demo.service.impl;

import com.example.demo.model.Contacto;
import com.example.demo.model.Pqrsf;
import com.example.demo.repository.PqrsfRepository;
import com.example.demo.service.IPqrsf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PqrsfImpl implements IPqrsf {

    @Autowired
    private PqrsfRepository pqrsfRepository;

    @Override
    public ArrayList<Pqrsf> getAllPqrsf(){
        ArrayList<Pqrsf> pqrsfs=(ArrayList<Pqrsf>) pqrsfRepository.findAll();
        return pqrsfs;
    }

    @Override
    public Pqrsf guardarPqrsf(Pqrsf pqrsf) {
        return pqrsfRepository.save(pqrsf);
    }

    @Override
    public Pqrsf actualizarPqrsf(Integer id, Pqrsf nuevoPqrsf) {
        Pqrsf pqrsfExistente = pqrsfRepository.findById(id).orElse(null);

        if (pqrsfExistente != null) {

            pqrsfExistente.setNombre(nuevoPqrsf.getNombre());
            pqrsfExistente.setEmpresa(nuevoPqrsf.getEmpresa());
            pqrsfExistente.setCargo(nuevoPqrsf.getCargo());
            pqrsfExistente.setCiudad(nuevoPqrsf.getCiudad());
            pqrsfExistente.setCelular(nuevoPqrsf.getCelular());
            pqrsfExistente.setCorreo(nuevoPqrsf.getCorreo());
            pqrsfExistente.setTramite(nuevoPqrsf.getTramite());
            pqrsfExistente.setMensaje(nuevoPqrsf.getMensaje());

            return pqrsfRepository.save(pqrsfExistente);
        } else {

            return null;
        }
    }

}
