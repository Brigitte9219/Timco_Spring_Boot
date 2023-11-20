package com.example.demo.service;

import com.example.demo.model.Pqrsf;

import java.util.ArrayList;

public interface IPqrsf {

    ArrayList<Pqrsf> getAllPqrsf();

    Pqrsf guardarPqrsf(Pqrsf pqrsf);
}
