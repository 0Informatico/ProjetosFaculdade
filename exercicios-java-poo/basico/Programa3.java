package atividades;

import java.util.Scanner;

public class Programa3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero par: ");
		int a =sc.nextInt(), b=0;
		if(a%2==0) {
			while (b<20) {
				a++;
				b++;
				if(a%2==0) {
					System.out.printf("%d\t",a);
				}
			}
		}else{
			System.out.println("O numero digitado não era par");
		}
		sc.close();
	}

}
