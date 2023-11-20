package com.example.demo.service;


import com.example.demo.model.Trabajador;

import java.util.ArrayList;

public interface ITrabajadorService {

    Trabajador guardarTrabajador(Trabajador trabajador);

    ArrayList<Trabajador> getAllTrabajadores();
}
