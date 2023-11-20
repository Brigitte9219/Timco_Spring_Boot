package com.example.demo.repository;

import com.example.demo.model.Pqrsf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PqrsfRepository extends CrudRepository<Pqrsf, Integer> {
}
