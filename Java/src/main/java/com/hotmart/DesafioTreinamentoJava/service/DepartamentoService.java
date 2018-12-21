package com.hotmart.DesafioTreinamentoJava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotmart.DesafioTreinamentoJava.model.Departamento;
import com.hotmart.DesafioTreinamentoJava.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public Iterable<Departamento> findAll() {
        return departamentoRepository.findAll();
    }

    public Departamento save(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

}
