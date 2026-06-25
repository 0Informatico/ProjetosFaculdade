package atividades;

import java.util.Scanner;

public class Programa5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int x =sc.nextInt();
		System.out.println("Digite mais um numero: ");
		int y =sc.nextInt();
		int X=x;
		for(int f=1;f<y;f++) {
			x=x*X;
		}
		System.out.printf("%d elevado a %d é igual a %d",X,y,x);
		
		sc.close();
	}

}
