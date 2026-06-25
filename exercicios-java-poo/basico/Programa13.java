package atividades;

import java.util.Scanner;

public class Programa13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String tipo = "";
		int quant=0,gatos=0,dogs=0;
		System.out.println("digite a quantidade de aniamais que há na loja");
		quant=sc.nextInt();
		for(int f=1;f<=quant;f++) {
			System.out.printf("\nQual é o tipo do %dº animal:",f);
			tipo=sc1.nextLine();
			if(tipo.equals("cachorro")) {
				dogs++;
			}else if(tipo.equals("gato")) {
				gatos++;
			}else {
				System.out.println("opção invalida digite de novo\n");
				f--;
			}
		}
		System.out.printf("\nna loja há %d cachorros e %d gatos",dogs, gatos);
		sc.close();
		sc1.close();
	}
}
