from django.db import models

# Create your models here.
class Projeto(models.Model):
    nomeProjeto = models.TextField(max_length = 100)
    imagem = models.ImageField(upload_to='', null=True, blank=True)
    descricao = models.TextField()
    link = models.URLField()


def __str__(self):
    return self.nomeProjeto

