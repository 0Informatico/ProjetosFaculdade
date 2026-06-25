package Atividade_4;

public class CamaroteSuperior extends Vip{

	private String localização;
	
	public CamaroteSuperior(float a, int b, String c) {
		super(a+((a/100)*10), b);
		this.localização=c;
	}
	public String Local() {
		return this.localização;
	}
	public void VerTipo() {
		System.out.println("Camarote Superior");
	}
	

}
