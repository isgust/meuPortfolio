# Meu Portfólio Pessoal

Este é o meu primeiro projeto web desenvolvido utilizando o framework Spring Boot. Ele foi concebido com o objetivo principal de me familiarizar com a estrutura e os conceitos fundamentais do Spring, servindo como uma base estática para apresentar meus dados e projetos.

---

## 🚀 Sobre o Projeto

Este portfólio é um projeto web estático e demonstra as minhas habilidades iniciais no desenvolvimento backend com Java e Spring Boot. Através dele, pude explorar:

* A estrutura de um projeto Spring Boot.
* O uso de Controllers para mapeamento de rotas.
* A renderização de templates com Thymeleaf.
* A organização de arquivos estáticos (CSS, imagens).

---

## 💻 Páginas Atuais

O portfólio é composto pelas seguintes páginas principais:

* **Página Inicial (`/` ou `index.html`):** Uma introdução sobre mim e minha área de atuação.
* **Sobre Mim (`/sobre` ou `sobre.html`):** Detalhes sobre minha jornada, localização e paixão pela programação.
* **Projetos (`/projetos` ou `projetos.html`):** Uma lista dos meus projetos, com dados gerenciados diretamente na `ProjetoService`.
* **Contato (`/contato` ou `contato.html`):** Um formulário simples para contato, integrado com Formspree.io para envio de e-mails sem a necessidade de um backend dedicado para o formulário.

---

## 🛠️ Tecnologias Utilizadas

As principais tecnologias e ferramentas empregadas neste projeto incluem:

* **Backend:**
    * [Java](https://www.java.com/pt-br/)
    * [Spring Boot](https://spring.io/projects/spring-boot)
    * [Thymeleaf](https://www.thymeleaf.org/) (Motor de template)
* **Frontend:**
    * [HTML5](https://developer.mozilla.org/pt-BR/docs/Web/HTML)
    * [CSS](https://developer.mozilla.org/pt-BR/docs/Web/CSS)
    * [Tailwind CSS](https://tailwindcss.com/) (Framework CSS utilitário)
    * [Font Awesome](https://fontawesome.com/) (Ícones)
* **Formulários:**
    * [Formspree.io](https://formspree.io/) (Serviço de backend para formulários)

---

## ⚙️ Como Rodar o Projeto

Para executar este projeto em sua máquina local, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/gustavo/meu-portfolio.git](https://github.com/gustavo/meu-portfolio.git)
    cd meu-portfolio
    ```
    *(Substitua `https://github.com/gustavo/meu-portfolio.git` pelo URL real do seu repositório)*

2.  **Configure o Java:**
    Certifique-se de ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 17 ou superior, recomendada para Spring Boot 3.x) configurado em seu ambiente.

3.  **Execute a aplicação:**
    Você pode rodar o projeto a partir da sua IDE (IntelliJ IDEA, VS Code com extensões Java) ou via linha de comando Maven/Gradle:

    * **Via IDE:** Abra o projeto em sua IDE e execute o arquivo `MeuPortfolioApplication.java` (o método `main`).
    * **Via Linha de Comando (Maven):**
        ```bash
        ./mvnw spring-boot:run
        ```
        (No Windows, pode ser `mvnw spring-boot:run`)

4.  **Acesse o Portfólio:**
    Após a inicialização do Spring Boot, abra seu navegador e acesse:
    ```
    http://localhost:8080/
