package com.example.demo.repository;


import com.example.demo.model.Trabajador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajadorRepository extends CrudRepository<Trabajador, Integer> {
}
