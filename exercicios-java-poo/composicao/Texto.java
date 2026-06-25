package atividade_3;

public class Texto {
	
	public String frase;
	public void a(String a) {
		char b[]=new char [a.length()];
		for (int f=0;f<a.length();f++) {
			b[f]=a.charAt(f);
		}
		System.out.println("\n");
		for (int f= a.length()-1; f>=0;f--) {
			System.out.print(b[f]);
		}
	}
	public void b(String a) {
		int es=0;
		for(int f=0;f<a.length();f++) {
			if(a.charAt(f)==' ') {
				es++;
			}
		}
		String[] b= a.split(" ");
		for(int f=es;f>=0;f--) {
			System.out.print(b[f]+" ");
		}
	}
	public void c(String a) {
		int es=0,v=0;
		for (int f=0;f<a.length();f++) {
			if (a.charAt(f)==' ') {
				es++;
			}
		}
		a=a.toLowerCase();
		String[] frase = a.split(" ");
		a=frase[0];
		for (int f2=1;f2<=es;f2++) {
			a=a+frase[f2];
		}
		
			for(int f=0;f<a.length();f++) {
				if(a.charAt(f)!=a.charAt(a.length()-1-f)) {
				v++;	
				}
			}
			if(v==0) {
				System.out.println("A palavra é palídroma");
			}else if (v!=0){
				System.out.println("A palavra não é palídroma");
			}
		

	}
	public void d(String a, String b) {
		int es=0,v=0;
		for (int f=0;f<a.length();f++) {
			if (a.charAt(f)==' ') {
				es++;
			}
		}
		a=a.toLowerCase();
		b=b.toLowerCase();
		String[] c = a.split(" ");
		for(int f=0;f<=es;f++) {
			if(c[f].equals(b)) {
				System.out.println("exixte essa palavra no texto");
				f=es;
				v++;
			}
		}if(v==0) {
			System.out.println("não existe no testo");
		}
		
		
		
	}

}
