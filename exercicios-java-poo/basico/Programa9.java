package atividades;

public class Programa9 {
	public static void main(String[] args) {
		float c=0;
		double f=0;
		for(int a=0;a<=40;a++) {
			if (c<10) {
				f=c/(0.55555)+32.0;
				System.out.printf("0%d graus Centígrados\t%.2f graus Farenheit\n",a,f);
				c=c+1;
			}else {
				f=c/(0.55555)+32.0;
				System.out.printf("%d graus Centígrados\t%.2f graus Farenheit\n",a,f);
				c=c+1;
			}
		}
	}
}
