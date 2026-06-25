package atividades;

import java.util.Scanner;

public class Programa14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		while (a!=5) {
			System.out.println(" 1 – 10 Primeiro números primos. \r\n"
					+ " 2 – 10 Primeiros números pares. \r\n"
					+ " 3 – 10 primeiros números impares. \r\n"
					+ " 4 – 10 primeiros números de Fibonacci. \r\n"
					+ " 5 – Sair. \n\n");
			a=sc.nextInt();
			switch (a) {
			case 1:
				for(int f=2;f<30;f++) {
					b=0;
					for(int f1=2;f1<f;f1++) {
					if(f!=f1) {
						if(f%f1==0) {
							b++;
						}
					}
					}
					if(b==0) {
						System.out.printf("%d\t",f);
					}
				}
				System.out.printf("\n\n");
				break;
			case 2:
				for(int f=1;f<=20;f++) {
					if (f%2==0) {
						System.out.printf("%d\t",f);
					}
				}
				System.out.printf("\n\n");
				break;
			case 3:
				for(int f=1;f<=20;f++) {
					if (f%2!=0) {
						System.out.printf("%d\t",f);
					}
				}
				System.out.printf("\n\n");
				break;
			case 4:
				b=0;
				c=1;
				System.out.printf("0\t1\t");
				for(int f=0;f<8;f++) {
					d=b+c;
					b=c;
					c=d;
					System.out.printf("%d\t",d);
				}
				System.out.printf("\n\n");
				break;
			case 5:
				System.out.println("Até a Proxima");
				break;
			default:
				System.out.printf("opção invalida\n\n");
				break;
			}
			
		}

		sc.close();

	}
}

