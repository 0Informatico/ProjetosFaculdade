package Atividade_4;

public class Vip extends Ingresso{
	public Vip(float a, int b) {
		super (a+((a/100)*40), b);
	}
	public void VerTipo() {
		System.out.println("Ingresso Vip");
	}

}
