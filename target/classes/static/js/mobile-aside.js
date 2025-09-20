// src/main/resources/static/js/mobile-aside.js 

document.addEventListener('DOMContentLoaded', function() { 
    const aside = document.querySelector('aside'); 
    const hamburgerButton = document.getElementById('hamburger-button'); 
    const ilustracaoContainer = document.querySelector('.ilustracao-container'); 
    const mainContent = document.querySelector('main'); 
    const overlay = document.getElementById('overlay'); 

    const breakpointAside = 936; 
    const breakpointLayout = 720; 

    // Função para fechar o aside e mostrar o main/overlay
    function closeAside() {
        aside.style.display = 'none';
        aside.classList.remove('aside-open');
        if (mainContent) {
            mainContent.style.display = 'flex'; // Mostra o main
        }
        if (overlay) {
            overlay.classList.remove('is-visible');
            overlay.style.display = 'none'; // Esconde a overlay
        }
    }

    // Função para abrir o aside e esconder o main/overlay
    function openAside() {
        aside.style.display = 'flex';
        aside.classList.add('aside-open');
        if (mainContent) {
            mainContent.style.display = 'none'; // Esconde o main
        }
        if (overlay) {
            overlay.style.display = 'block'; // Mostra a overlay
            setTimeout(() => overlay.classList.add('is-visible'), 10); // Pequeno delay para transição de opacidade
        }
    }

    function setActiveNavLink() {
        const currentPath = window.location.pathname; 
        const navLinks = document.querySelectorAll('nav a'); 
        navLinks.forEach(link => {
            link.classList.remove('active-link'); 
            const linkHref = link.getAttribute('href'); 
            
            if (linkHref) { 
                const normalizedLinkPath = linkHref.replace(/\/$/, ''); 
                const normalizedCurrentPath = currentPath.replace(/\/$/, '');

                if (normalizedLinkPath === normalizedCurrentPath || 
                    (normalizedLinkPath === '/' && normalizedCurrentPath === '')) {
                    link.classList.add('active-link'); 
                }
            }
        });
    }

    function handleResponsiveness() { 
        if (window.innerWidth <= breakpointAside) { // Se a tela é mobile
            if (!aside.classList.contains('aside-open')) { 
                // Se o aside não tem a classe 'aside-open' (está fechado)
                closeAside(); // Garante que esteja fechado e main visível
            } else { 
                // Se o aside tem a classe 'aside-open' (está aberto)
                openAside(); // Garante que esteja aberto e main escondido
            } 
            
            if (hamburgerButton) { 
                hamburgerButton.style.display = 'block'; // Mostra o botão do hambúrguer
            } 

            if (window.innerWidth <= breakpointLayout && ilustracaoContainer) { 
                ilustracaoContainer.style.justifyContent = 'center'; 
                ilustracaoContainer.style.display = 'flex'; 
            } else if (ilustracaoContainer) { 
                ilustracaoContainer.style.justifyContent = ''; 
                ilustracaoContainer.style.display = ''; 
            } 

        } else { // Se a tela é desktop
            aside.style.display = 'flex'; // aside sempre visível em desktop
            aside.classList.remove('aside-open'); // Remove qualquer classe de mobile
            if (hamburgerButton) { 
                hamburgerButton.style.display = 'none'; // Esconde o hambúrguer
            } 
            if (mainContent) { 
                mainContent.style.display = 'flex'; // main sempre visível em desktop
            } 
            if (ilustracaoContainer) { 
                ilustracaoContainer.style.justifyContent = ''; 
                ilustracaoContainer.style.display = ''; 
            } 
            if (overlay) { // Garante que a overlay esteja escondida em desktop
                overlay.classList.remove('is-visible');
                overlay.style.display = 'none';
            }
        } 
    } 

    if (hamburgerButton) { 
        hamburgerButton.addEventListener('click', function() { 
            if (aside.style.display === 'none') { 
                openAside(); // Abre o aside
            } else { 
                closeAside(); // Fecha o aside
            } 
        }); 
    } 

    // Fechar o menu ao clicar na overlay
    if (overlay) {
        overlay.addEventListener('click', function() {
            if (window.innerWidth <= breakpointAside && aside.classList.contains('aside-open')) {
                closeAside();
            }
        });
    }

    // Fechar o menu ao clicar em um link do aside
    const asideLinks = aside.querySelectorAll('nav a');
    asideLinks.forEach(link => {
        link.addEventListener('click', function() {
            if (window.innerWidth <= breakpointAside && aside.classList.contains('aside-open')) {
                closeAside();
            }
        });
    });
    // Chamadas iniciais e event listeners globais:
    setActiveNavLink(); 
    handleResponsiveness(); 
    window.addEventListener('resize', handleResponsiveness); 
});