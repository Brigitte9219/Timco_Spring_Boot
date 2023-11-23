package com.example.demo.repository;

import com.example.demo.model.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<Usuarios, Integer> {
}
