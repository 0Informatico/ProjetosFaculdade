import pyautogui
import keyboard
import time
import threading

continuar = True
travar = "teste.png"
def fim():
    global continuar
    global travar
    while 1:
        key = input()
        if key==None:
            continuar = False
            break
        else:
            travar = key

threading.Thread(target=fim).start()

while continuar:
    try:
        pyautogui.moveTo(pyautogui.locateOnScreen(travar, confidence=0.9))
        pyautogui.click()
        time.sleep(1)
    except pyautogui.ImageNotFoundException as e:
        print("sem imagem")
    except Exception as e:
        print(type(e))
        print(e)


