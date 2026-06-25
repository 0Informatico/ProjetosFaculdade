package atividades;

public class Programa1 {
	public static void main(String[] args) {
		int c=0;
		for(int a=2;a<100;a++) {
			c=0;
			for(int b=2;b<a;b++) {
			if(a!=b) {
				if(a%b==0) {
					c++;
				}
			}
			}
			if(c==0) {
				System.out.printf("%d\t",a);
			}
		}
	}
}
