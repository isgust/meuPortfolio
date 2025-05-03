package com.gustavorocha.portfolio.meu_portfolio.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.gustavorocha.portfolio.meu_portfolio.service.ProjetoService;
import com.gustavorocha.portfolio.meu_portfolio.model.Projeto;
import java.util.List;

@Controller
public class ProjetoController {
    private final ProjetoService projetoService;

    //Construtor para injeção de dependencia de ProjetoService
    public ProjetoController(ProjetoService projetoService){
        this.projetoService = projetoService;
    }

    @GetMapping("/projetos")
    public String listarProjetos(Model model){
        List<Projeto> projetos = projetoService.listarProjetos();
        model.addAttribute("listaProjetos", projetos);
        return "projetos"; //Nome do arquivo html
    }
}
