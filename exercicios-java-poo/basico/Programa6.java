package atividades;

public class Programa6 {
	public static void main(String[] args) {
		int a=1,b=0;
		while(a<=15) {
			b=b+a;
			a++;
		}
		System.out.printf("a soma de 1 a 15 utilizando o comando \"while\" é igual a %d",b);
		b=0;
		a=1;
		do {
			b=b+a;
			a++;
		}while(a<=15);
		System.out.printf("\na soma de 1 a 15 utilizando o comando \"do\" é igual a %d",b);
		b=0;
		for(a=0;a<=15;a++) {
			b=b+a;
		}System.out.printf("\na soma de 1 a 15 utilizando o comando \"for\" é igual a %d",b);

	}

}
