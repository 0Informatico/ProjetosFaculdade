package atividades;

import java.util.Scanner;

public class Programa11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a=0,b=0;
		int o=0;
		System.out.println("digite o primeiro numero:");
		a=sc.nextFloat();
		System.out.println("digite o segundo numero:");
		b=sc.nextFloat();
		System.out.println("1) Somar os números;\n2) Subtrair os números;\n3) Multiplicar os números;\n4) Dividir os números.");
		o=sc.nextInt();
		switch(o) {
		    case 1:
		    	System.out.printf("a soma dos dois numeros é: %.0f", a+b);
		      	break;
		    case 2:
		    	System.out.printf("a subtração do primeiro menos o segundo é: %.0f", a-b);
		    	break;
		    case 3:
		    	System.out.printf("a multiplicação dos dois numeros é: %.0f", a*b);
		    	break;
		    case 4:
		    	System.out.printf("a divisão do primeiro pelo o segundo é: %.f", a/b);
		    	break;
		    default:
		    	System.out.printf("Opção inválida");
		    	break;
		}
		sc.close();

		
		
	}
}
