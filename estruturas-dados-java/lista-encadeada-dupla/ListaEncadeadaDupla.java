package encadeadaDupla;

public class ListaEncadeadaDupla {
	
	private NoLDE primeira = null;
	private NoLDE ultima = null;
	private int contador=0;
	
	public void Insere(Object elemento) {
		NoLDE novo = new NoLDE(elemento, this.primeira);
		if(this.contador!=0) {
			this.primeira.setAnterior(novo);
		}
		this.primeira = novo;
		if (this.contador == 0) {
			this.ultima = this.primeira;
		}  
		this.contador = this.contador + 1;
	}
	
	public void InsereF(Object elemento) {
		if(this.contador == 0) {
			this.Insere(elemento);
		}else {
			NoLDE novo = new NoLDE(elemento,null);
			this.ultima.setProximo(novo);
			novo.setAnterior(this.ultima);
			this.ultima = novo;
			this.contador = this.contador+1;
		}
	}
	
	public Object MostraNodo(int posicao) {
		NoLDE atual = this.primeira;
		if(posicao<=this.contador) {
			for(int i=0;i < posicao-1;i++) {
				atual = atual.getProximo();
				
			}
			return atual.getElemento();
		}else {
			return "Essa posição não exixte";
		}
		
	}
	public int Tamanho() {
		return this.contador;
	}
	
	public void Remove() {
		if(this.contador == 0) {
			throw new IllegalArgumentException("Lista Vazia.");
		}
		this.primeira=this.primeira.getProximo(); 
		this.contador=contador-1;
		if(this.contador == 0) {
			this.ultima = null;
		}else {
			this.primeira.setAnterior(null);
		}
	}
	public void RemoveF() {
		if(this.contador == 0) {
			throw new IllegalArgumentException("Lista Vazia.");
		}
		this.ultima=this.ultima.getAnterior(); 
		this.contador=contador-1;
		if(this.contador == 0) {
			this.primeira = null;
		}else {
			this.ultima.setProximo(null);
		}
	}
	public boolean Verifica(Object obj) {
		NoLDE teste = this.primeira;
		if(this.contador == 0) {
			throw new IllegalArgumentException("Lista Vazia.");
		}else {
			for (int f=0;f<this.contador;f++) {
				if(teste.getElemento().equals(obj)) {
					return true;
				}else {
					teste=teste.getProximo();
				}
			}
		}
		return false;
	}
	public String ShowList() {
		if (contador ==0) {
			return "[ ]";
		}
		NoLDE atual = this.primeira;
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i < contador;i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
	public String Inicial(){
		String a;
		a=""+this.primeira.getElemento();
		return a;
	}
	public String Final(){
		String a;
		a=""+this.ultima.getElemento();
		return a;
	}

}
