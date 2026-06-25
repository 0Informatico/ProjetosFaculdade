package cero;
import java.util.Scanner;

public class fala {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a="oi";
		while(a!="exit") {
			System.out.println("frase:");
			a=sc.nextLine();
			if(a!="exit") {
				char b[]=new char[a.length()];
				for(int f=0;f<a.length();f++) {
					b[a.length()-f-1]=a.charAt(f);
				}
				System.out.print("Tradução:");
				for(int f=0;f<a.length();f++) {
					System.out.print(b[f]);
				}
				System.out.print("\n\n");
			}
		}
	}

}
