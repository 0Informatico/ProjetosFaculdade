package Atividade_4;

public class CamaroteInferior extends Vip{

	private String localização;
	
	public CamaroteInferior(float a, int b, String c) {
		super(a, b);
		this.localização=c;
	}
	public String Local() {
		return this.localização;
	}
	public void VerTipo() {
		System.out.println("Camarote Inferior");
	}
	

}
