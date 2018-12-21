package com.hotmart.DesafioTreinamentoJava.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotmart.DesafioTreinamentoJava.model.Funcionario;
import com.hotmart.DesafioTreinamentoJava.service.FuncionarioService;

@Controller
public class FuncionarioController {

    private static final String FUNCIONARIOS = "funcionarios";

    @Autowired
    FuncionarioService funcionarioService;

    @RequestMapping(FUNCIONARIOS)
    public String index() {
        return FUNCIONARIOS;
    }

    @RequestMapping(value = "salvarFuncionario", method = RequestMethod.POST)
    public String salvarDepartamento(@RequestParam("nome") String nome,
            @RequestParam("cpf") String cpf,
            @RequestParam("dataNascimento") String dataNascimento,
            @RequestParam("sexo") String sexo, Model model) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dataNascimentoParsed = null;
        Funcionario funcionario;
        if (dataNascimento != null) {
            try {
                dataNascimentoParsed = simpleDateFormat.parse(dataNascimento);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (dataNascimentoParsed != null) {
                funcionario = new Funcionario(nome, cpf, dataNascimentoParsed,
                        sexo);
            } else {
                funcionario = new Funcionario(nome, cpf, sexo);
            }
        } else {
            funcionario = new Funcionario(nome, cpf, sexo);
        }

        funcionarioService.save(funcionario);

        Iterable<Funcionario> funcionarios = funcionarioService.findAll();
        model.addAttribute(FUNCIONARIOS, funcionarios);

        return FUNCIONARIOS;
    }
}
