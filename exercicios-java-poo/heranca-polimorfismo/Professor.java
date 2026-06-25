package Atividade_6;

public class Professor extends Funcionario{

	private String Departamento;

	public Professor(String nome, String cpf, String endereço, String codigo, double salario, String curso) {
		super(nome, cpf, endereço, codigo, salario);
		this.Departamento = curso;
	}

	public String professor() {
		return ("Professor\n\nNome:\t"+this.getNome()+"\nCPF:\t"+this.getCpf()+"\nEndereço:\t"+this.getEndereço()+"\nCodigo:\t"+this.getCodigo()+"\nSalario:\t"+this.getSalario()+"\nDepartamento:\t"+this.Departamento);
	}
	
	
	

}
