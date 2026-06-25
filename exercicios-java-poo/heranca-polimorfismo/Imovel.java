package Atividade_5;

public class Imovel {
	private String Endereço;
	private float preço;
	
	public Imovel(String endereço, float preço) {
		this.Endereço = endereço;
		this.preço = preço;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}
	

}
