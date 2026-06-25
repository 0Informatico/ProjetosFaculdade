package arvores;

public class principal {

	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.adicionar("1");
		arvore.adicionar("2");
		arvore.adicionar("3");
		arvore.adicionar("4");
		arvore.adicionar("5");
		arvore.adicionar("6");
		arvore.adicionar("7");
		arvore.adicionar("8");
		arvore.adicionar("9");
		arvore.adicionar("10");
		arvore.adicionar("11");

		arvore.ler();
		
		arvore.Buscar("10");
		arvore.Buscar("12");
		
		arvore.Remover("1");
		
		arvore.adicionar("12");
		
		arvore.ler();

	}

}
