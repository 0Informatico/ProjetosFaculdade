package Atividade_6;

public class Aluno extends Pessoa{
	private String matricula;

	public Aluno(String nome, String cpf, String endereço, String matricula) {
		super(nome, cpf, endereço);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return ("Aluno\n\nNome:\t"+this.getNome()+"\nCPF:\t"+this.getCpf()+"\nEndereço:\t"+this.getEndereço()+"\nMatricula:\t"+this.matricula);

	}	

}
