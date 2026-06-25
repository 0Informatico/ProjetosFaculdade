package Atividade_6;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Aluno a = new Aluno("Jonatan Herman","xxx.xxxx.xxx-xx","São Bento do Sul","12345");
		Professor b = new Professor("Bruce Baner","001.658.987-55","Torre dos Vigadore","O Vingador mais Forte",7900,"radiação aplicada");
		Coordenador c = new Coordenador("thor","548.566.854-12","asgard","Playboysinho",7900,"educação fisica");

		System.out.println(a.getMatricula());
		System.out.println();
		System.out.println(b.professor());
		System.out.println();
		System.out.println(c.cordenador());
		sc.close();
		sc1.close();

	}

}
