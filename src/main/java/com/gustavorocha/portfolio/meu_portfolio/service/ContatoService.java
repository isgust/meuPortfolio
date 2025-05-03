package com.gustavorocha.portfolio.meu_portfolio.service;
import com.gustavorocha.portfolio.meu_portfolio.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class ContatoService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${GMAIL_USERNAME}")
    private String destinatarioEmail;

    public void enviarContato(Contato contato){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(destinatarioEmail);
        message.setSubject("Nova mensagem de contato do seu portfolio");
        message.setText(String.format("Nome: " + contato.getNome() + " Email: " + contato.getEmail() + " Mensagem: " + contato.getMensagem()));

        mailSender.send(message);
    }

}
