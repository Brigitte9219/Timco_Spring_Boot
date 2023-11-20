package com.example.demo.service;


import com.example.demo.model.Contacto;
import com.example.demo.model.Trabajador;

import java.util.ArrayList;
import java.util.Optional;


public interface IContactoService{

    ArrayList<Contacto> getAllContacto();

    Contacto guardarContacto(Contacto contacto);

    void borrarContacto(Integer idcontacto);

    Contacto actualizarContacto(Integer id, Contacto nuevoContacto);

}
