package com.example.demo.service.impl;


import com.example.demo.model.Trabajador;
import com.example.demo.repository.TrabajadorRepository;
import com.example.demo.service.ITrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TrabajadorServiceImpl implements ITrabajadorService {

    @Autowired
    private TrabajadorRepository trabajadorRepository;


    @Override
    public Trabajador guardarTrabajador(Trabajador trabajador){

        return trabajadorRepository.save(trabajador);

    }

    @Override
    public ArrayList<Trabajador> getAllTrabajadores() {

        ArrayList<Trabajador> trabajadores = (ArrayList<Trabajador>) trabajadorRepository.findAll();
        return trabajadores;
    }
}