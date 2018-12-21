package com.hotmart.DesafioTreinamentoJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DesafioTreinamentoJavaController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
