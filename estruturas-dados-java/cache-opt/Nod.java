package OPT;

public class Nod {
	
	private Object elemento;
	private Object esquerda;
	private Object direita;

	
	public Nod(Object elemento,int n) {
		this.elemento = elemento;
		this.esquerda = null;
		this.esquerda = null;
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
	public boolean testar(Object e) {
		if(e==this.elemento) {
			return true;
		}else {
			return false;
		}
	}

	
	
	
	
	
	
	

}
