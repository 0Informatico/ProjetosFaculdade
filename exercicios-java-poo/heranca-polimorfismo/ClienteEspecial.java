package atividade_1;

public class ClienteEspecial extends ContaCorente{
		
	public ClienteEspecial(float a){
		super(a);
	}
	
	public void saque(float a) {
		this.deposito((float) (-a -((this.saldo()/100)*0.10)));
	}

}
