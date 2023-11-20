package com.example.demo.service.impl;

import com.example.demo.model.Contacto;
import com.example.demo.repository.ContactoRepository;
import com.example.demo.service.IContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactoServiceImpl implements IContactoService {

    @Autowired
    ContactoRepository contactoRepository;


    @Override
    public Contacto guardarContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    @Override
    public void borrarContacto(Integer idcontacto) {
        contactoRepository.deleteById(idcontacto);
    }

    @Override
    public Contacto actualizarContacto(Integer id, Contacto nuevoContacto) {
        Contacto contactoExistente = contactoRepository.findById(id).orElse(null);

        if (contactoExistente != null) {

            contactoExistente.setMensaje(nuevoContacto.getMensaje());
            contactoExistente.setCorreo(nuevoContacto.getCorreo());
            contactoExistente.setAsunto(nuevoContacto.getAsunto());
            contactoExistente.setNombre(nuevoContacto.getNombre());

            return contactoRepository.save(contactoExistente);
        } else {

            return null;
        }
    }



}
