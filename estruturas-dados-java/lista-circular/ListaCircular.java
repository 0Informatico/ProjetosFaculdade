package encadeadaDupla;

public class ListaCircular {
	
	private NoDC cursor = null;
	private int contador=0;
	
	public void Insere(Object elemento) {
		NoDC novo = new NoDC(elemento, this.cursor);
		if (contador == 0) {
			this.cursor = novo;
			this.cursor.setAnterior(cursor);
			this.cursor.setProximo(cursor);
		}else if (contador == 1) {
			NoDC anterior = cursor.getAnterior();
			anterior.setProximo(novo);
			novo.setAnterior(anterior);
			this.cursor.setAnterior(novo);
			this.cursor.setProximo(novo);
		}else {
			NoDC anterior = cursor.getAnterior();
			anterior.setProximo(novo);
			novo.setAnterior(anterior);
			this.cursor.setAnterior(novo);
		}
		contador++;
	}
	
	public Object MostraNodo(int posicao) {
		NoDC atual = this.cursor;
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
	
	public String Remove() {
		String a;
		NoDC Removido = cursor.getAnterior();
		NoDC Anterior = Removido.getAnterior();
		a= ""+Removido.getElemento();
		Anterior.setProximo(cursor);
		this.cursor.setAnterior(Anterior);
		this.contador=contador-1;
		return a;
	}
	
	public boolean Verifica(Object obj) {
		NoDC teste = this.cursor;
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
		NoDC atual = this.cursor;
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i < contador;i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
	public String MostraTudo() {
		NoDC atual = this.cursor;
		StringBuilder builder = new StringBuilder("");
		for(int i=0;i < contador;i++) {
			builder.append("\n\n"+atual.getElemento()+":");
			NoDC anterior = atual.getAnterior();
			NoDC proximo = atual.getProximo();
			builder.append("\nProximo: "+proximo.getElemento());
			builder.append("\nAnterior: "+anterior.getElemento());
			atual = atual.getProximo();
		}
		builder.append("\n");
		return builder.toString();
	}
}
