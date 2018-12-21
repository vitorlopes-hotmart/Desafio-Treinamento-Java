package com.hotmart.DesafioTreinamentoJava.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotmart.DesafioTreinamentoJava.model.Departamento;

public interface DepartamentoRepository
        extends CrudRepository<Departamento, Long> {

}
