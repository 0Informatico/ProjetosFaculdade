package atividades;

import java.util.Scanner;

public class Programa4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int a =sc.nextInt(), b=2;
		while(b<=10) {
			System.out.printf("%dX%d = %d\n",a,b,b*a);
			b++;
		}
		
		sc.close();
	}

}
