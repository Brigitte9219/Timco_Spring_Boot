package com.example.demo.service.impl;


import com.example.demo.model.Contacto;
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
    public Trabajador guardarTrabajador(Trabajador trabajador) {

        return trabajadorRepository.save(trabajador);

    }

    @Override
    public ArrayList<Trabajador> getAllTrabajadores() {

        ArrayList<Trabajador> trabajadores = (ArrayList<Trabajador>) trabajadorRepository.findAll();
        return trabajadores;
    }

    @Override
    public Trabajador actualizarTrabajador(Integer id, Trabajador nuevoTrabajador) {
        Trabajador trabajadorExistente = trabajadorRepository.findById(id).orElse(null);

        if (trabajadorExistente != null) {

            trabajadorExistente.setNombre(nuevoTrabajador.getNombre());
            trabajadorExistente.setCorreo(nuevoTrabajador.getCorreo());
            trabajadorExistente.setTipoId(nuevoTrabajador.getTipoId());
            trabajadorExistente.setNumeroId(nuevoTrabajador.getNumeroId());
            trabajadorExistente.setFechaExpedicion(nuevoTrabajador.getFechaExpedicion());
            trabajadorExistente.setCiudadExpedicion(nuevoTrabajador.getCiudadExpedicion());
            trabajadorExistente.setFechaNacimiento(nuevoTrabajador.getFechaNacimiento());
            trabajadorExistente.setLugarNacimiento(nuevoTrabajador.getLugarNacimiento());
            trabajadorExistente.setEdad(nuevoTrabajador.getEdad());
            trabajadorExistente.setEstatura(nuevoTrabajador.getEstatura());
            trabajadorExistente.setGenero(nuevoTrabajador.getGenero());
            trabajadorExistente.setEstadoCivil(nuevoTrabajador.getEstadoCivil());
            trabajadorExistente.setRh(nuevoTrabajador.getRh());
            trabajadorExistente.setGrupoSanguineo(nuevoTrabajador.getGrupoSanguineo());
            trabajadorExistente.setLocalidad(nuevoTrabajador.getLocalidad());
            trabajadorExistente.setCiudadResidencia(nuevoTrabajador.getCiudadResidencia());
            trabajadorExistente.setBarrio(nuevoTrabajador.getBarrio());
            trabajadorExistente.setDireccion(nuevoTrabajador.getDireccion());
            trabajadorExistente.setTelefonoMovil(nuevoTrabajador.getTelefonoMovil());
            trabajadorExistente.setTelefonoFijo(nuevoTrabajador.getTelefonoFijo());
            trabajadorExistente.setEps(nuevoTrabajador.getEps());
            trabajadorExistente.setAfp(nuevoTrabajador.getAfp());
            trabajadorExistente.setEscolaridad(nuevoTrabajador.getEscolaridad());
            trabajadorExistente.setProfesion(nuevoTrabajador.getProfesion());
            trabajadorExistente.setTallaCamisa(nuevoTrabajador.getTallaCamisa());
            trabajadorExistente.setTallaPantalon(nuevoTrabajador.getTallaPantalon());
            trabajadorExistente.setTallaChaqueta(nuevoTrabajador.getTallaChaqueta());
            trabajadorExistente.setTallaCalzado(nuevoTrabajador.getTallaCalzado());

            return trabajadorRepository.save(trabajadorExistente);
        } else {

            return null;
        }
    }
}