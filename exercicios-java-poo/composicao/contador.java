package atividade_8;

public class contador {
	
	private int envento; 
	
	public void zerar () {
		this.envento=0;
	}
	public void  incrementar () {
		this.envento++;
	}
	public void imprimir () {
		System.out.println(this.envento+" carros vermelhos passaram na rua");
	}

}
