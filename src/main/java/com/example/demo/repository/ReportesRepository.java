package com.example.demo.repository;

import com.example.demo.model.Reportes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportesRepository extends CrudRepository<Reportes, Integer> {
}
