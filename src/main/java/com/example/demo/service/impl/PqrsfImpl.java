package com.example.demo.service.impl;

import com.example.demo.model.Pqrsf;
import com.example.demo.repository.PqrsfRepository;
import com.example.demo.service.IPqrsf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PqrsfImpl implements IPqrsf {

    @Autowired
    private PqrsfRepository pqrsfRepository;

    @Override
    public Pqrsf guardarPqrsf(Pqrsf pqrsf) {
        return pqrsfRepository.save(pqrsf);
    }
}
