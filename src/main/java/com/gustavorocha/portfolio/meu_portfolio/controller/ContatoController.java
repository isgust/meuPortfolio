package com.gustavorocha.portfolio.meu_portfolio.controller;

import com.gustavorocha.portfolio.meu_portfolio.model.Contato;
import com.gustavorocha.portfolio.meu_portfolio.service.ContatoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @GetMapping("/contato")
    public String contatoForm(Model model) {
        model.addAttribute("contato", new Contato()); // Cria um objeto Contato vazio para o formulário
        return "contato";
    }

    @PostMapping("/contato")
    public RedirectView enviarContato(@ModelAttribute Contato contato, Model model) {
        contatoService.enviarContato(contato);
        model.addAttribute("mensagemSucesso", "Sua mensagem foi enviada com sucesso!");
        return new RedirectView("/contato");
    }
}