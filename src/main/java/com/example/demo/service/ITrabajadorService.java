package com.example.demo.service;


import com.example.demo.model.Contacto;
import com.example.demo.model.Trabajador;

import java.util.ArrayList;

public interface ITrabajadorService {

    Trabajador guardarTrabajador(Trabajador trabajador);

    ArrayList<Trabajador> getAllTrabajadores();

    Trabajador actualizarTrabajador(Integer id, Trabajador nuevoTrabajador);
}
