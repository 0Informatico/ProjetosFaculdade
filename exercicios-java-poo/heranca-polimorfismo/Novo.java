package Atividade_5;

public class Novo extends Imovel{

	public Novo(String endereço, float preço) {
		super(endereço, preço+((preço/100)*10));
	}
	

}
