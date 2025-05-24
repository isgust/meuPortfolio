package com.gustavorocha.portfolio.meu_portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class SobreController {

    @GetMapping("/sobre") 
    public String sobre() {
        return "sobre"; // Retorna o nome do arquivo HTML
    }
}