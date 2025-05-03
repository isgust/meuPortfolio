package com.gustavorocha.portfolio.meu_portfolio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index"; // Retorna o nome do arquivo HTML (sem a extensão .html)
    }
}
