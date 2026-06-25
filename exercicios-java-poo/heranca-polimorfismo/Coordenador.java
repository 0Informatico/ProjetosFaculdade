package Atividade_6;

public class Coordenador extends Funcionario{

	private String curso;

	public Coordenador(String nome, String cpf, String endereço, String codigo, double salario, String curso) {
		super(nome, cpf, endereço, codigo, salario);
		this.curso = curso;
	}

	public String cordenador() {
		return ("Coordenador\n\nNome:\t"+this.getNome()+"\nCPF:\t"+this.getCpf()+"\nEndereço:\t"+this.getEndereço()+"\nCodigo:\t"+this.getCodigo()+"\nSalario:\t"+this.getSalario()+"\nCurso:\t"+this.curso);
	}
	
	
	

}
