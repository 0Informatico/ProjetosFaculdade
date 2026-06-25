package Atividade_4;

public class Ingresso {
	private float preço;
	private int quantidade;
	
	public Ingresso(float a, int b) {
		this.preço=a;
		this.quantidade=b;
	}

	public void ImprimeValor() {
	System.out.printf("O valor do Ingresso é R$%.2f\n\n",this.preço);
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void venda() {
		this.quantidade--;
	}

}
