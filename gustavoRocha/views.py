from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request, 'index.html')

def projetos(request):
    return render(request, 'projetos.html', {'projetos': projetos})

def contato(request):
    return render(request, 'contato.html')
