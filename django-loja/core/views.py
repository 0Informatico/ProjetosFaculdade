from django.shortcuts import render, get_object_or_404, HttpResponse
from .models import Cliente
from django.template import loader 

def index(request):
    context = {'testes':'Jonatan Herman'}
    return render(request,'index.html',context)

def contatos(request):
    context = {'clientes':Cliente.objects.all()}
    return render(request,'contatos.html',context)

def cliente(request, pk):
    clie = get_object_or_404(Cliente, id=pk)
    context = {'clientes':clie}
    return render(request,'cliente.html',context)

def error404(request):
    template = loader.get_template('404.html')
    return HttpResponse(content=template.render(), contente_type='text/html; charset=utf8', status=400)