package atividades;

import java.util.Scanner;

public class Programa8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite seu sexo sendo:\n0 para masculino\n1 para feminino");
		int a=sc.nextInt();
		switch(a){
			case 0:
				System.out.println("Seja bem-vindo, Senhor!");
				break;
			case 1:
				System.out.println("Seja bem-vinda, Senhora!");
				break;
			default:
				System.out.println("eu vim em paz!(Spock)");
				break;
		}
		sc.close();
	}

}
