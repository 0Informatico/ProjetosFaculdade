package Atividade_5;

public class Velho extends Imovel{

	public Velho(String endereço, float preço) {
		super(endereço, preço-((preço/100)*10));
	}
	

}
