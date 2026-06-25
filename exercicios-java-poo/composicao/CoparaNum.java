package atividade_4;

public class CoparaNum {
	
	public void a(int a, int b) {
		if(a==b) {
			System.out.print("os numeros são iguais");
		}else {
			if(a%2==0) {
				System.out.print("Os numeros são diferentes e "+a+" é par");
				if(b%2==0) {
					System.out.println(" e "+b+" é par");
				}else {
					System.out.print(" e "+b+" é impar");
				}
			}else {
				System.out.println("Os numeros são diferentes e "+a+" é impar");
				if(b%2==0) {
					System.out.print(" e "+b+" é par");
				}else {
					System.out.print(" e "+b+" é impar");
				}
			}
		}
	}

}
