package com.example.demo.service;

import com.example.demo.model.Usuarios;

import java.util.ArrayList;

public interface IUsuariosService {

    Usuarios guardarUsuarios (Usuarios usuarios);

    ArrayList<Usuarios> getAllUsuarios();

    Usuarios actualizarUsuarios(Integer id, Usuarios nuevoUsuarios);

    void borrarUsuarios(Integer idusuarios);
}
