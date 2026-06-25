
from keyboard import wait, write, press
from threading import Thread

links = []
continuar = True

def continuar():
    input()
    global continuar
    continuar = False

with open("links.txt","+r") as testo:
    links = testo.read().split('\n')

Thread(target=continuar).start()

for x in range(len(links)):
    if links[x].count("ok - "):
        continue
    if not continuar:
        break
    wait(" ")
    press("backspace")
    write(links[x]+"\n")
    links[x] = 'ok - ' + links[x]

with open("links.txt","+w") as testo:
    for x in range(len(links)):
        testo.write(links[x]+"\n")
