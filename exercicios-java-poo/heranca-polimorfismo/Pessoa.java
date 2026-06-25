package Atividade_6;

abstract class Pessoa {
	
	private String Nome;
	private String cpf;
	private String Endereço;
	public Pessoa(String nome, String cpf, String endereço) {
		Nome = nome;
		this.cpf = cpf;
		Endereço = endereço;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	
	
		

}
