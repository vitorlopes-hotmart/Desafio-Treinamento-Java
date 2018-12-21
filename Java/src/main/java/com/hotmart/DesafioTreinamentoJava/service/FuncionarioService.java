package com.hotmart.DesafioTreinamentoJava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotmart.DesafioTreinamentoJava.model.Funcionario;
import com.hotmart.DesafioTreinamentoJava.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public Iterable<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
