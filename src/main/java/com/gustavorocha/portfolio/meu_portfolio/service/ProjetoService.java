package com.gustavorocha.portfolio.meu_portfolio.service;
import com.gustavorocha.portfolio.meu_portfolio.model.Projeto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProjetoService {
    public List<Projeto> listarProjetos(){
        List<Projeto> projetos = new ArrayList<>();
        //Projetos
        Projeto projeto = new Projeto();
        projeto.setTitulo("Projeto de Portfolio");
        projeto.setDescricaoBreve("Iniciando estudo Spring com meu portfolio.");
        projeto.setImagemUrlCapa("/images/projeto.png");
        projeto.setUrlDetalhe("https://github.com/isgust/meuPortfolio");
        projetos.add(projeto);

        Projeto projeto2 = new Projeto();
        projeto2.setTitulo("Cotação Rápida de Produtos(Em desenvolvimento)");
        projeto2.setDescricaoBreve("Aplicativo mobile que escaneia códigos de barras e totaliza o valor dos produtos, ideal para compras.");
        projeto2.setImagemUrlCapa("/images/appCompra.png");
        projeto2.setUrlDetalhe("/images/appCompra");
        projetos.add(projeto2);

        return projetos;
    }
}
