package com.hotmart.DesafioTreinamentoJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotmart.DesafioTreinamentoJava.service.ProjetoService;

@Controller
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @RequestMapping("projetos")
    public String index() {
        return "projetos";
    }
}
