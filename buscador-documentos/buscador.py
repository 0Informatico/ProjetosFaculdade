import re

docs = {
    "doc1": "A disciplina de robótica e controle são temas centrais do laboratório",
    "doc2": "O novo laboratório de redes neurais e sistemas distribuídos foi inaugurado",
    "doc3": "Um guia de introdução à robótica industrial e automação de processos",
    "doc4": "Redes de computadores, automação industrial e controle de qualidade são essenciais"
}

stopwords = ["a", "o", "e", "são", "de", "do", "da", "foi", "um", "à"]

def criar_indice(documentos):
    indice = {}
    for doc_id, texto in documentos.items():
        palavras = re.findall(r'\b\w+\b', texto.lower())
        for palavra in palavras:
            if palavra not in indice:
                indice[palavra] = []
            if doc_id not in indice[palavra]:
                indice[palavra].append(doc_id)
    return indice

def busca(termos, indice):
    if not termos:
        return []

    resultados = set(indice.get(termos[0], []))

    for i in range(1, len(termos)):
        if not resultados:
            break
        resultados = resultados.intersection(indice.get(termos[i], []))

    return sorted(list(resultados))

def criar_indice_refinado(documentos, stopwords):
    indice = {}
    for doc_id, texto in documentos.items():
        palavras = re.findall(r'\b\w+\b', texto.lower())
        for palavra in palavras:
            if stopwords.count(palavra):
                continue
            if palavra not in indice:
                indice[palavra] = []
            if doc_id not in indice[palavra]:
                indice[palavra].append(doc_id)
    return indice

def busca_booleana(consulta, indice):
    chaves = set(docs.keys())
    consulta = consulta.replace('(', ' ( ').replace(')', ' ) ')
    lista = re.findall(r'\bAND\b|\bOR\b|\bNOT\b|\(|\)|\b\w+\b', consulta.upper())
    lista = [x for x in lista if x.strip()]

    precedencia = {
        'NOT': 3,
        'AND': 2,
        'OR': 1
    }

    listaSaida = []
    operadores = []

    for x in lista:
        if x == '(':
            operadores.append(x)
        elif x == ')':
            while operadores and operadores[-1] != '(':
                listaSaida.append(operadores.pop())
            if operadores and operadores[-1] == '(':
                operadores.pop()
            else:
                raise ValueError("Parênteses desbalanceados na consulta")
        elif x in precedencia:
            while (operadores and operadores[-1] != '(' and
                   precedencia.get(operadores[-1], 0) >= precedencia[x]):
                listaSaida.append(operadores.pop())
            operadores.append(x)
        else:
            listaSaida.append(x)

    while operadores:
        if operadores[-1] == '(':
            raise ValueError("Parênteses desbalanceados na consulta")
        listaSaida.append(operadores.pop())

    resultados = []
    for x in listaSaida:
        if x not in precedencia:
            docs_termo = set(indice.get(x.lower(), []))
            resultados.append(docs_termo)
        else:
            if x == 'NOT':
                if not resultados:
                    raise ValueError("Expressão NOT mal formada: falta operando")
                operando = resultados.pop()
                if not resultados:
                    resultados.append(chaves.difference(operando))
                else:
                    operando1 = resultados.pop()
                    resultados.append(operando1.difference(operando))
            elif x == 'AND':
                if len(resultados) < 2:
                    raise ValueError("Expressão AND mal formada: faltam operandos")
                op2 = resultados.pop()
                op1 = resultados.pop()
                resultados.append(op1.intersection(op2))
            elif x == 'OR':
                if len(resultados) < 2:
                    raise ValueError("Expressão OR mal formada: faltam operandos")
                op2 = resultados.pop()
                op1 = resultados.pop()
                resultados.append(op1.union(op2))

    if len(resultados) != 1:
        raise ValueError("Expressão booleana mal formada ou não avaliada completamente")
    return sorted(list(resultados[0]))

indice = criar_indice(docs)
print('='*80)
print(indice)
print('='*80)
buscar = ["robótica", "laboratório"]
resposta = busca(buscar, indice)
print(f"{buscar}: {resposta}")
print('='*80)
indice = criar_indice_refinado(docs, stopwords)
print(indice)
print('='*80)
pergunta = "robótica AND (laboratório OR industrial)"
resposta = busca_booleana(pergunta, indice)
print(f"pergunta: '{pergunta}'\nResposta: {resposta}")