import random
from tela import create_ui

bonusNecromante = 4
bonusArma = 4

def AtaqueEsqueleto(entry_widget,tipo):
    """<h1>Gera o ataque dos Esqueletos</h1>
    <p> entry_widget =  campo da tela
    <p> tipo = 'arqueiro', 'espada'"""

    if tipo == 'espada':
        print(f"{' atq. Espada ':=^20}")
    elif tipo == 'arqueiro':
        print(f"{' atq. Arco ':=^20}")
    
    for x in range(int(entry_widget.get())):
        print(random.randint(1,20)+bonusArma)

def danoEsqueleto(entry_widget,tipo):
    """<h1>Gera o dano do ataque dos Esqueletos</h1>
    <p> entry_widget =  campo da tela
    <p> tipo = 'arqueiro', 'espada'"""

    if tipo == 'espada':
        print(f"{' Dan. Espada ':=^20}")
    elif tipo == 'arqueiro':
        print(f"{' Dan. Arco ':=^20}")
    
    for x in range(int(entry_widget.get())):
        print(random.randint(1,6)+bonusNecromante+2)

if __name__ == "__main__":
    create_ui(AtaqueEsqueleto,danoEsqueleto)