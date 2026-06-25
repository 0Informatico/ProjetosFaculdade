package atividades;

import java.util.Scanner;

public class Programa12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int quant=0, p=0, np=0;
		String nome = "";
		int m=0;
		System.out.println("digite a quantidade de colaboradores:");
		quant=sc.nextInt();
		for (int f=0;f<quant;f++) {
			System.out.printf("\ndigite o nome do %dº colaborador\n",f+1);
			nome= sc1.nextLine();
			System.out.println("digite o tempo de serviço em meses do(a) "+nome);
			m= sc.nextInt();
			if (m>12) {
				p++;
				System.out.printf("%s tem direito a férias\n",nome);
			}else {
				np++;
				System.out.printf("%s não tem direito a férias\n",nome);
			}
		}
		System.out.printf("\nNo total %d tem direito a ferias e %d não tem direito a ferias",p,np);
		sc.close();
		sc1.close();
		
	}
}
