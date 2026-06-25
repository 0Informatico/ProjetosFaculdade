#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Aplicação SIG para Mapeamento de Pontos de Coleta de Resíduos
em São Bento do Sul, Santa Catarina

Autor: Trabalho Final de SIG
Data: 17 de Novembro de 2025
Professor: Prof. Luiz Cláudio Dalmolin

Descrição: Script que gera um mapa interativo em HTML com a localização
de pontos de coleta de lixo reciclável e eletrônico, além de pontos verdes
relevantes (parques, áreas de lazer) em São Bento do Sul/SC.
"""

import folium
from folium import plugins
import json

# Definir dados dos pontos de coleta de resíduos
pontos_coleta = [
    # ECOPONTOS SAMAE - Lixo Eletrônico
    {
        "nome": "SBS Reciclagem Eletrônica - Sede",
        "endereco": "Rua Carlos Urban, 690, Schramm",
        "lat": -26.2589038,
        "lon": -49.3639537,
        "tipo": "Eletrônico",
        "cor": "blue",
        "icone": "laptop",
        "descricao": "Ponto de coleta de lixo eletrônico - SBS Reciclagem"
    },
    {
        "nome": "Ecoponto Brasília (EcoParque SAMAE)",
        "endereco": "Avenida dos Imigrantes, 1046, Brasília",
        "lat": -26.2405,
        "lon": -49.3578,
        "tipo": "Recicláveis + Eletrônico",
        "cor": "green",
        "icone": "recycle",
        "descricao": "Local de Entrega Voluntária (LEV) - Próximo ao 23º Batalhão da PM"
    },
    
    # ECOPONTOS ADICIONAIS (baseado no mapa da SBS Reciclagem)
    {
        "nome": "Ecoponto Progresso",
        "endereco": "Região de Progresso",
        "lat": -26.2450,
        "lon": -49.3750,
        "tipo": "Recicláveis",
        "cor": "green",
        "icone": "recycle",
        "descricao": "Ecoponto para coleta de materiais recicláveis"
    },
    {
        "nome": "Ecoponto Rio Negro",
        "endereco": "Região de Rio Negro",
        "lat": -26.2550,
        "lon": -49.3850,
        "tipo": "Recicláveis",
        "cor": "green",
        "icone": "recycle",
        "descricao": "Ecoponto para coleta de materiais recicláveis"
    },
    {
        "nome": "Ecoponto Loteamento",
        "endereco": "Região de Loteamento",
        "lat": -26.2350,
        "lon": -49.3650,
        "tipo": "Recicláveis",
        "cor": "green",
        "icone": "recycle",
        "descricao": "Ecoponto para coleta de materiais recicláveis"
    },
    {
        "nome": "Ecoponto Schramm",
        "endereco": "Região de Schramm",
        "lat": -26.2650,
        "lon": -49.3550,
        "tipo": "Eletrônico",
        "cor": "blue",
        "icone": "laptop",
        "descricao": "Ecoponto para coleta de lixo eletrônico"
    },
    {
        "nome": "Ecoponto Serra Alta",
        "endereco": "Região de Serra Alta",
        "lat": -26.2300,
        "lon": -49.3800,
        "tipo": "Recicláveis",
        "cor": "green",
        "icone": "recycle",
        "descricao": "Ecoponto para coleta de materiais recicláveis"
    },
    
    # PONTOS VERDES - Parques e Áreas de Lazer
    {
        "nome": "Parque da Água",
        "endereco": "Centro de São Bento do Sul",
        "lat": -26.2450,
        "lon": -49.3600,
        "tipo": "Parque",
        "cor": "darkgreen",
        "icone": "leaf",
        "descricao": "Área verde - Parque municipal"
    },
    {
        "nome": "Praça CEU das Artes",
        "endereco": "Centro",
        "lat": -26.2480,
        "lon": -49.3620,
        "tipo": "Praça",
        "cor": "darkgreen",
        "icone": "leaf",
        "descricao": "Espaço público para lazer e eventos"
    },
    {
        "nome": "Parque Estadual Serra Geral",
        "endereco": "Região de Progresso",
        "lat": -26.2500,
        "lon": -49.3900,
        "tipo": "Parque",
        "cor": "darkgreen",
        "icone": "leaf",
        "descricao": "Área de preservação ambiental"
    },
    {
        "nome": "Complexo Esportivo Municipal",
        "endereco": "Brasília",
        "lat": -26.2420,
        "lon": -49.3560,
        "tipo": "Espaço Público",
        "cor": "darkgreen",
        "icone": "leaf",
        "descricao": "Área de lazer e prática de esportes"
    }
]

# Coordenadas centrais de São Bento do Sul
centro_sbs = [-26.25028, -49.37861]

# Criar mapa base com Folium
mapa = folium.Map(
    location=centro_sbs,
    zoom_start=13,
    tiles='OpenStreetMap'
)

# Adicionar camada de satélite como alternativa
folium.TileLayer('https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}',
                 attr='Tiles &copy; Esri',
                 name='Satélite',
                 overlay=False,
                 control=True).add_to(mapa)

# Adicionar marcadores para cada ponto de coleta
for ponto in pontos_coleta:
    # Definir popup com informações detalhadas
    popup_text = f"""
    <b>{ponto['nome']}</b><br>
    Tipo: {ponto['tipo']}<br>
    Endereço: {ponto['endereco']}<br>
    Coordenadas: {ponto['lat']:.4f}, {ponto['lon']:.4f}
    """
    
    # Criar ícone customizado
    if ponto['tipo'] == 'Eletrônico':
        icon_color = 'blue'
        icon_prefix = 'fa'
        icon_name = 'laptop'
    elif ponto['tipo'] == 'Recicláveis' or ponto['tipo'] == 'Recicláveis + Eletrônico':
        icon_color = 'green'
        icon_prefix = 'fa'
        icon_name = 'recycle'
    elif ponto['tipo'] in ['Parque', 'Praça', 'Espaço Público']:
        icon_color = 'darkgreen'
        icon_prefix = 'fa'
        icon_name = 'leaf'
    else:
        icon_color = ponto['cor']
        icon_prefix = 'fa'
        icon_name = 'info'
    
    # Adicionar marcador ao mapa
    folium.Marker(
        location=[ponto['lat'], ponto['lon']],
        popup=folium.Popup(popup_text, max_width=300),
        tooltip=ponto['nome'],
        icon=folium.Icon(
            color=icon_color,
            icon=icon_name,
            prefix=icon_prefix
        )
    ).add_to(mapa)

# Adicionar controle de camadas
folium.LayerControl().add_to(mapa)

# Adicionar minimap (mapa em miniatura)
minimap = plugins.MiniMap(toggle_display=True)
mapa.add_child(minimap)

# Adicionar search/busca (opcional)
plugins.Fullscreen(position='topright').add_to(mapa)

# Salvar mapa em arquivo HTML
output_file = './mapa_pontos_coleta_sbs.html'
mapa.save(output_file)

print(f"✓ Mapa gerado com sucesso!")
print(f"✓ Arquivo salvo em: {output_file}")
print(f"✓ Total de pontos mapeados: {len(pontos_coleta)}")
print(f"\nDetalhes dos pontos:")
print(f"  - Pontos de coleta eletrônica: 2")
print(f"  - Pontos de coleta recicláveis: 5")
print(f"  - Pontos verdes (parques/praças): 4")
print(f"\nAbra o arquivo HTML em seu navegador para visualizar o mapa interativo.")
