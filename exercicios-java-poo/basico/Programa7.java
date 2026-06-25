package atividades;

import java.util.Scanner;

public class Programa7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1,b=0,Mn=0,mn=0;
		while(a!=0) {
			System.out.println("digite um numero o 0 para encerar o programa:");
			a=sc.nextInt();
			if(a>0) {
				b=b+a;
				if(Mn==0 && mn==0) {
					Mn=a;
					mn=a;
				}else if(a>Mn) {
					Mn=a;
				}else if(a<mn) {
					mn=a;
				}
			}else if(a<0){
				System.out.println("numeros negativos não são permitidos.\n");
			}
		}
		System.out.printf("a soma dos numeros do conjuto é %d\no maior numero do conjunto é %d\no menor numero do comjunto é %d",b,Mn,mn);
		
		
		sc.close();
	}

}
