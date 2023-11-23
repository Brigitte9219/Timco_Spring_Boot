package com.example.demo.service.impl;

import com.example.demo.model.Producto;
import com.example.demo.model.Usuarios;
import com.example.demo.repository.UsuariosRepository;
import com.example.demo.service.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuariosServiceImpl implements IUsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios guardarUsuarios (Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }

    @Override
    public ArrayList<Usuarios> getAllUsuarios() {
        ArrayList<Usuarios> usuarios = (ArrayList<Usuarios>) usuariosRepository.findAll();
        return usuarios;
    }

    @Override
    public Usuarios actualizarUsuarios(Integer id, Usuarios nuevoUsuarios) {
        Usuarios usuariosExistente = usuariosRepository.findById(id).orElse(null);

        if (usuariosExistente != null) {

            usuariosExistente.setNombreCompleto(nuevoUsuarios.getNombreCompleto());
            usuariosExistente.setNumeroId(nuevoUsuarios.getNumeroId());
            usuariosExistente.setUsuario(nuevoUsuarios.getUsuario());
            usuariosExistente.setContraseña(nuevoUsuarios.getContraseña());
            usuariosExistente.setConfirmarContraseña(nuevoUsuarios.getConfirmarContraseña());
            usuariosExistente.setProyecto(nuevoUsuarios.getProyecto());
            usuariosExistente.setGenero(nuevoUsuarios.getGenero());
            usuariosExistente.setFechaNacimiento(nuevoUsuarios.getFechaNacimiento());
            usuariosExistente.setCorreoElectronico(nuevoUsuarios.getCorreoElectronico());
            usuariosExistente.setTelefonoMovil(nuevoUsuarios.getTelefonoMovil());

            return usuariosRepository.save(usuariosExistente);
        } else {

            return null;
        }
    }

    @Override
    public void borrarUsuarios(Integer idusuarios) {
        usuariosRepository.deleteById(idusuarios);
    }

}
