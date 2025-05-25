document.addEventListener('DOMContentLoaded', function() {
    const aside = document.querySelector('aside');
    const breakpoint = 1094; //

    function toggleAsideVisibility() {
        if (window.innerWidth <= breakpoint) {
            aside.style.display = 'none';
        } else {
            aside.style.display = 'flex'; 
        }
    }

    // Chama a função uma vez no carregamento da página
    toggleAsideVisibility();

    // Adiciona um listener para quando a janela for redimensionada
    window.addEventListener('resize', toggleAsideVisibility);
});