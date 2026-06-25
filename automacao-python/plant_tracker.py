
class Planta:

    __nome = None
    __outono = None
    __inverno = None
    __primavera = None
    __verao = None
    __formula = None
    __compost = None
    __manure = None

    def __init__(self,nome,outono,inverno,primavera,verao,formula,compost,manure):
        self.__nome = nome
        self.__outono = outono
        self.__inverno = inverno
        self.__primavera = primavera
        self.__verao = verao
        self.__formula = formula
        self.__compost = compost
        self.__manure = manure
    
    def getdict(self):
        """
        <h1>Retorna os valores:</h1>
        <ul>
        <li>Nome</li>
        <li>outono</li>
        <li>inverno</li>
        <li>primavera</li>
        <li>verao</li>
        <li>formula</li>
        <li>compost</li>
        <li>manure</li>
        </ul>
        """
        return {  
            'nome':self.__nome,
            'outono':self.__outono,
            'inverno':self.__inverno,
            'primavera':self.__primavera,
            'verao':self.__verao,
            'formula':self.__formula,
            'compost':self.__compost,
            'manure':self.__manure,
        }

listaPlantas = []
estações = ['outono','inverno', 'primavera', 'verao']
testo = open('tabela.csv','+r',encoding="UTF-8").read().split('\n')
for linha in testo:
    coluna = linha.split(",")
    listaPlantas.append(Planta(coluna[0],bool(coluna[1]),bool(coluna[2]),bool(coluna[3]),bool(coluna[4]),int(coluna[5]),int(coluna[6]),int(coluna[7])))

for estacao in estações:
    print("="*80+"\n"+estacao.upper()+"\n"+"="*80)
    plantasEstacao = [x for x in listaPlantas if x.getdict()[estacao]]
    listadas = []
    for x in plantasEstacao:
        x:Planta
        planta1 = x.getdict()
        for y in [planta for planta in plantasEstacao if planta!=x]:
            y:Planta
            planta2 = y.getdict()
            for z in [planta for planta in plantasEstacao if planta!=x and planta!=y]:
                z:Planta
                planta3 = z.getdict()
                
                if planta1["formula"]+planta2["formula"]+planta3["formula"]>=0:
                    if planta1["compost"]+planta2["compost"]+planta3["compost"]>=0:
                        if planta1["manure"]+planta2["manure"]+planta3["manure"]>=0:
                            if len([x1 for x1 in listadas if x1.count(planta1["nome"]) and x1.count(planta2["nome"]) and x1.count(planta3["nome"])]) > 0:
                                continue
                            else:
                                listadas.append(f"[1:1:1] - {planta1["nome"]} + {planta2["nome"]} + {planta3["nome"]}")
                                print(f"[1:1:1] - {planta1["nome"]} + {planta2["nome"]} + {planta3["nome"]}")