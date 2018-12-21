package com.hotmart.DesafioTreinamentoJava.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotmart.DesafioTreinamentoJava.model.Funcionario;

public interface FuncionarioRepository
        extends CrudRepository<Funcionario, Long> {

}
