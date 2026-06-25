package atividades;

import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		float a =sc.nextFloat();
		if(a>0) {
			System.out.println("O numero digitado é positivo");
		}else if(a<0) {
			System.out.println("O numero digitado é negativo");
		}else if(a==0){
			System.out.println("O numero digitado é neutro");
		}
		sc.close();
	}

}
