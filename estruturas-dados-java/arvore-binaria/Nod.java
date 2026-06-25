package arvores;

public class Nod {
	
	private Object elemento;
	private Object esquerda;
	private Object direita;
	private int numero=0;

	
	public Nod(Object elemento,int n) {
		this.elemento = elemento;
		this.esquerda = null;
		this.esquerda = null;
		this.numero = n;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Object getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Object esquerda) {
		this.esquerda = esquerda;
	}

	public Object getDireita() {
		return direita;
	}

	public void setDireita(Object direita) {
		this.direita = direita;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	
	
	
	
	

}
