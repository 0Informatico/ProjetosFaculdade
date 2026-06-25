package atividade_1;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Livro L1 = new Livro();
		
		L1.nome= "kono subarashii sekai ni shukufuku wo vol.1";
		L1.paginas= 268;
		L1.genero = "comedia";
		
		System.out.println("nome: "+L1.nome+"\npaginas: "+L1.paginas+"\ngenero: "+L1.genero);
		sc.close();
	}

}
