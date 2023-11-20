package com.example.demo.service;


import com.example.demo.model.Contacto;

import java.util.Optional;


public interface IContactoService{

    Contacto guardarContacto(Contacto contacto);

    void borrarContacto(Integer idcontacto);

    Contacto actualizarContacto(Integer id, Contacto nuevoContacto);

}
