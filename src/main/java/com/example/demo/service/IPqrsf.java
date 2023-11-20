package com.example.demo.service;

import com.example.demo.model.Contacto;
import com.example.demo.model.Pqrsf;

import java.util.ArrayList;

public interface IPqrsf {

    Pqrsf guardarPqrsf(Pqrsf pqrsf);

    ArrayList<Pqrsf> getAllPqrsf();

    Pqrsf actualizarPqrsf(Integer id, Pqrsf nuevoPqrsf);
}
