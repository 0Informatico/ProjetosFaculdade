from clipboard import copy, paste
from keyboard import wait

while 1:
    wait('1')
    testo = paste()
    escreve = ''
    # print(testo.split('\n'))
    for x in testo.split('\n'):
        x = x.replace('\r','')
        if len(x) == 0:
            continue
        if x.count('\n'):
            print("oi?")
        if x[-1]==' ':
            print("deu?")
            escreve+=x
        else:
            escreve+=f"{x}\n"
    print(escreve)
    copy(escreve)