import time
from datetime import datetime
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
import dotenv
import os

relatorios = {
  '(Reembolso) Relatório de Despesas':
    "Número da Solicitação;Solicitante;Viajante;Data/Hora da Solicitação;Descrição da Despesa;"+
    "Empresa Viajante;Centro de Custo;Cargo do Viajante;Aprovador(es);Valor Unitário;Valor Total;"+
    "Quantidade de Pessoas Presentes;Data da Ultima Atualizacao do Relatorio\n",
  '(Reembolso) Reembolso - Eder':
    "Número da Solicitação;Número Solicitação Origem;Solicitante;Antecedência de Viagem;Viajante;"+
    "Autorização Cartão;Data/Hora da Solicitação;Motivo de Viagem;Matrícula;Forma de Pagamento;Categoria de Despesa;"+
    "Data de Lançamento;Comprovado;Descrição Forma Pagamento;Data/Hora de Pagamento do  Reembolso ou Devolução;Empresa;"+
    "E-mail do Solicitante;Status da Solicitação;Quantidade da Despesa;Cartão;Projeto;Código do(s) Projeto(s);Nac/Int;"+
    "Descritivo;Forma de Pagamento da Solicitação;Matricula do Solicitante;Política;Descrição da Despesa;"+
    "Centro Custo de Débito;Código da Conta Contábil;Descrição da Conta Contábil;Empresa Viajante;Departamento do Viajante;"+
    "E-mail do Viajante;Centro de Custo;Telefone do Viajante;Nível do Viajante;Cargo do Viajante;Fax do Viajante;Terceiro;"+
    "CPF;Aprovador de Mérito;Status da Aprovação de Mérito;Data da Aprovação de Mérito;Aprovador de Custo;"+
    "Status da Aprovação de Custo;Data da Aprovação de Custo;Aprovador da Conferência;Status da Aprovação de Conferência;"+
    "Data da Aprovação de Conferência;Aprovador de Reembolso;Status da Aprovação de Prestação;"+
    "Data da Aprovação de Reembolso;Aprovador(es);Status da(s) Aprovação(ões);Data da Aprovação de Prestação;Moeda;"+
    "Prestação de Contas;Valor de Devolução;Valor de Reembolso;Valor Unitário;Porcentagem IVA;Valor IVA;Valor Total;"+
    "Reembolsável;Data da Ultima Atualizacao do Relatorio\n",
  '(Hospedagem) Hotel':
    "Nro Solic;Data Inclusao;Solicitante;Viajante;Motivo de Viagem;Aprovador de Autorizacao;Aprovador(es);Empresa Viajante;"+
    "Centro de Custo Viajante;Cargo do Viajante;Cidade/Estado/País;Hotel;Qtd Diaria;Valor Diária;Valor Total;"+
    "Data da Ultima Atualizacao do Relatorio\n",
  '(Passagem Aérea) Viagem':
    "Nro Solic;Data Inclusao;Data Inicial;Data Final;Solicitante;Viajante;Motivo de Viagem;Projeto;Aprovador(es);"+
    "Empresa Viajante;Centro de Custo Viajante;Cargo do Viajante;Partida;Chegada;Valor Bilhete;Valor Taxa;Valor Bilhete Mais;"+
    "Valor Bilhete Menos;Valor Total;Valor médio;Valor menor;Valor maior;Data da Ultima Atualizacao do Relatorio\n"
}


# ======================================================
# Limpa arquivos antigos
# ======================================================
while 1:  
  try:
    for arquivos in [x for x in os.listdir() if x.count(".csv") or x.count(".txt")]:
      os.remove(arquivos)


    # ======================================================
    # Configuração de navegador
    # ======================================================
    login = dotenv.dotenv_values()

    preferencia={
      'download.default_directory':os.getcwd()
    }

    options = Options()
    # options.set_preference('download.default_directory',os.getcwd())
    options.add_experimental_option("prefs",preferencia)

    navegador = webdriver.Chrome(options=options)
    navegador.get('https://www.argoit.com.br/condor/nx/default.aspx#!/home')
    navegador.maximize_window()

    # ======================================================
    # Login 
    # ======================================================
    elemento = navegador.find_element('id',"userNameInput")
    elemento.send_keys(login['email'])

    elemento = navegador.find_element('id',"passwordInput")
    elemento.send_keys(login['senha'])

    elemento = navegador.find_element('id',"submitButton")
    elemento.click()

    # ======================================================
    # Relatorios
    # ======================================================
    esperar = WebDriverWait(navegador, 1000).until(
      EC.presence_of_element_located((By.XPATH,"/html/body/div[3]/div[3]/div[1]/div[1]/div/div[9]/a[1]"))
    )
    elemento = navegador.find_element(By.XPATH,"/html/body/div[3]/div[3]/div[1]/div[1]/div/div[9]/a[1]")
    elemento.click()
    
    break
  
  except Exception as e:
    print(e)
    navegador.quit()
    time.sleep(5)

data = time.gmtime()
data = f"{data.tm_mday-1:0>2}/{data.tm_mon:0>2}/{data.tm_year}"

for relatorio in list(relatorios.keys()):
  while 1:
    try:
      # ======================================================
      # Selecionar o Relatório de Despesas
      # ======================================================
      esperar = WebDriverWait(navegador, 1000).until(
        EC.presence_of_element_located((By.ID,'iframePaginas'))
      )
      elemento = navegador.find_element(By.ID,'iframePaginas')
      navegador.switch_to.frame(elemento)

      elemento = navegador.find_element(By.XPATH,'//*[@id="ctl00_cphContent_ddlRelatorio"]')
      elemento.send_keys(relatorio)

      # ======================================================
      # Selecionar a data
      # ======================================================
      time.sleep(5)
      elemento = navegador.find_element(By.XPATH,'//*[@id="ctl00_cphContent_txtDataIni"]')
      elemento.click()
      navegador.execute_script("arguments[0].text = arguments[1];", elemento, data)
      navegador.execute_script("arguments[0].value = arguments[1];", elemento, data)

      # ======================================================
      # Selecionar o tipo de arquivo
      # ======================================================
      time.sleep(1)
      elemento = navegador.find_element(By.ID,'ctl00_cphContent_rblSaidaRelatorio_2')
      navegador.execute_script("arguments[0].scrollIntoView({block: 'center'})",elemento)
      elemento.click()

      # ======================================================
      # baixa o arquivo e refresh
      # ======================================================
      time.sleep(1)
      elemento = navegador.find_element(By.ID,'ctl00_cphContent_btnGeraRelatorio')
      elemento.click()

      navegador.refresh()
      os.rename([x for x in os.listdir() if x.count(".txt")][0],f"{relatorio}.csv")
      
      testo = open(f"{relatorio}.csv","+r",encoding='UTF-8').read()
      arquivo = open(f"{relatorio}.csv","+w",encoding='UTF-8')
      arquivo.write(relatorios[relatorio])
      arquivo.write(testo)
      arquivo.close()
        
      break

    except Exception as e:
      for arquivos in [x for x in os.listdir() if x.count(".txt")]:
        os.remove(arquivos)
      
      if str(e) == 'list index out of range':
        break

      navegador.refresh()
      time.sleep(20)
      continue


try:
  testo = open('(Reembolso) Reembolso - Eder.csv','+r', encoding='UTF-8').read().split('\n')
  try:
    testo.remove('')
  except Exception as e:
    print(e)

  while 1:
    try:
      for x in range(len(testo)):
        if (len(testo[x].split(";"))+len(testo[x+1].split(";")))<=68:
          testo[x] = testo[x]+" - "+testo[x+1]
          testo.remove(testo[x+1])
          break
      
    except Exception as e:
      print(e)
      break

  with open('(Reembolso) Reembolso - Eder.csv','+w', encoding="UTF-8") as txt:
    for x in testo:
      txt.write(x+"\n")

except Exception:
  print(e)

# arquivosAntigos = [x for x in os.listdir(r'\\condor.net\data\Arquivos DW\Argo') if x.count('.txt')]
# for x in arquivosAntigos:
#     nome = x.split(".")[0]+" "+data.replace('/','-')+".txt"
#     os.rename(fr"\\condor.net\data\Arquivos DW\Argo\{x}",fr"\\condor.net\data\Arquivos DW\Argo\{nome}")
#     os.replace(fr"\\condor.net\data\Arquivos DW\Argo\{nome}",
#         fr"\\condor.net\data\Arquivos DW\Argo\HISTORICO\{nome}")

# for x in [y for y in os.listdir() if y.count(".csv")]:
#   nome = x.replace("csv","txt")
#   os.rename(x,nome)
#   testo = open(nome,'+r', encoding='utf-8').read()
#   arquivo = open(fr"\\condor.net\data\Arquivos DW\Argo\{nome}",'+w',encoding='utf-8')
#   arquivo.write(testo)
#   arquivo.close()

navegador.quit()

print(f"Executado {datetime.now()}")