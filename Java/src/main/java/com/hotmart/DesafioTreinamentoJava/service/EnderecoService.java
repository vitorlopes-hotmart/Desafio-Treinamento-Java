package com.hotmart.DesafioTreinamentoJava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotmart.DesafioTreinamentoJava.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;
}
