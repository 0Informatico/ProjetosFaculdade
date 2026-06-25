package Atividade_3;

public class Rica extends Pessoa {
	private double dinheiro;
	
	public Rica (String a,int b,double c) {
		super (a,b);
		this.dinheiro=c;
	}
	
	public void fazCompras() {
		System.out.println("Fazendo compras");
	}
	public String pessoa() {
		return ("nome:\t"+this.getNome()+"\nidade:\t"+this.getIdade()+"\nDinheiro:\t"+this.dinheiro);
	}

}
