import encadeadaDupla.NoLDE;

public class ListaEncadeadaSimples {
	
	private NoLDE primeira = null;
	private NoLDE ultima = null;
	private int contador=0;
	
	public void Insere(Object elemento) {
		NoLDE novo = new NoLDE(elemento, this.primeira);
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
			this.ultima = novo;
			this.contador = this.contador+1;
		}
	}
	
	public Object MostraNodo(int posicao) {
		//use getElemento()
		NoLDE atual = this.primeira;
		for(int i=0;i < posicao;i++) {
			atual = atual.getProximo();
			
		}
		return atual.getElemento();
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
		}
	} 	
	
	public void RemoveF() {
		if(this.contador == 0) {
			throw new IllegalArgumentException("Lista Vazia.");
		}
			}
	
	public boolean Verifica(Object obj) {
		if(this.contador == 0) {
			throw new IllegalArgumentException("Lista Vazia.");
		}
		return false;
	}
	
	public String ShowList() {
		if (contador ==0) {
			return "[ ]";
		}
		NoLDE atual = primeira;
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i < contador;i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}

}
