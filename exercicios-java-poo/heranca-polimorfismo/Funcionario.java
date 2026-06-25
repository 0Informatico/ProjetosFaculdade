package Atividade_6;

public class Funcionario extends Pessoa{

	private String codigo;
	private double salario;
	public Funcionario(String nome, String cpf, String endereço, String codigo, double salario) {
		super(nome, cpf, endereço);
		this.codigo = codigo;
		this.salario = salario;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getSalario() {
		return salario;
	}
	
	

}
