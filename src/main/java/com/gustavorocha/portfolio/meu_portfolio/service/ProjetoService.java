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
        projeto.setTitulo("Projeto Incrível 1");
        projeto.setDescricaoBreve("Um projeto web inovador.");
        projeto.setImagemUrlCapa("https://placehold.co/1200x800/8a2be2/ffffff=Projeto+1+Capa");
        projeto.setUrlDetalhe("/projetos/projeto-incrivel-1");
        projetos.add(projeto);

        Projeto projeto2 = new Projeto();
        projeto2.setTitulo("Aplicação Mobile Fantástica");
        projeto2.setDescricaoBreve("Um app para revolucionar o mundo.");
        projeto2.setImagemUrlCapa("https://placehold.co/1200x800/4682b4/ffffff=Projeto+2+Capa");
        projeto2.setUrlDetalhe("/projetos/app-fantastico");
        projetos.add(projeto2);

        return projetos;
    }
}
