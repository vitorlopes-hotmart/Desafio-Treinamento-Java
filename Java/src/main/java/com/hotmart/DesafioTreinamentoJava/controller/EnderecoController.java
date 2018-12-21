package com.hotmart.DesafioTreinamentoJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hotmart.DesafioTreinamentoJava.service.EnderecoService;

@Controller
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;
}
