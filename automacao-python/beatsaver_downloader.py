from selenium.webdriver.chrome import webdriver
from selenium.webdriver.chrome import options
from selenium.webdriver.common.by import By
from time import sleep
import os 
import zipfile

opcao = options.Options()
print(os.getcwd())
# opcao.add_argument(f"download.default_directory={os.getcwd()}\\dowloads")
opcao.add_experimental_option("prefs", {
  "download.default_directory": rf"{os.getcwd()}\dowloads"
  })

webdriver  = webdriver.WebDriver(opcao)
# sleep(10)

webdriver.maximize_window()
webdriver.get(r"https://beatsaver.com/playlists/1103862")
sleep(3)

elementos = webdriver.find_elements(By.XPATH,"//*[@title='Download zip']")
# print(len(elementos))
sleep(3)
for x in elementos:
    x.click()
    sleep(1)
    # break

sleep(20)
print(os.listdir(r'.\dowloads'))
for x in os.listdir(r'.\dowloads'):
    try:
        local = rf'E:\games\beat saber\Beat Saber 1.35 (194 DLC)\Game\Beat Saber\Beat Saber_Data\CustomLevels\{x.split('.')[0]}'
        os.makedirs(local)
        with zipfile.ZipFile(fr'.\dowloads\{x}','r') as arquivo:
            arquivo.extractall(local)
        sleep(5)
        os.remove(rf'.\dowloads\{x}')
    except Exception:
        os.remove(rf'.\dowloads\{x}')
