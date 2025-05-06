package com.gustavorocha.portfolio.meu_portfolio.controller;

import com.gustavorocha.portfolio.meu_portfolio.model.Contato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContatoController {

    @GetMapping("/contato")
    public String contatoForm(Model model){
        model.addAttribute("contato", new Contato());
        return "contato";
    }

    @GetMapping(value = "/contato", params = "sucesso")
    public String contatoFormComSucesso(Model model){
        model.addAttribute("contato", new Contato());
        model.addAttribute("mensagemSucesso", "Sua mensagem foi enviada com sucesso!");
        return "contato";
    }

}

