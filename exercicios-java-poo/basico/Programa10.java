package atividades;

import java.util.Scanner;

public class Programa10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1,S=0,s=0;
		while(a!=0) {
			System.out.println("digite um numero ou 0 para encerar o programa:");
			//System.out.printf("(S=%d\ts=%d\tst=%d)\n",S,s,S+s);
			a=sc.nextInt();
			if(a>0) {
				S=S+a;
			}else if (a<0) {
				s=s+a;
			}
		}
		System.out.printf("Soma dos positivos = %d\nSoma dos negativos = %d\nSoma Total = %d",S,s,S+s);
		sc.close();

		
		
	}
}
