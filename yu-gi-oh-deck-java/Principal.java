package tent1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a=0,b=0;;
		
		Scanner sc = new Scanner(System.in);
		Scanner let = new Scanner(System.in);
		
		System.out.println("digite o numero de cartas");
		Deck de=new Deck(sc.nextInt());
		
		while(a!=-4) {
			if(b==1){
				for (int f=0;f<de.vetor.length;f++) {
				if(f==de.vetor.length-1) {
					System.out.print(de.vetor[f]+".\n");
				}else {
					System.out.print(de.vetor[f]+",");
				}
					
				}
			}
			System.out.println("Digite qual opção você deseja:\n"
					+ "1)Inserir uma carta no inicio\n"
					+ "2)Inserir uma carta no fim\n"
					+ "3)Remover primeira carta\n"
					+ "4)Remover ultima carta\n"
					+ "5)Examinar primeira carta\n"
					+ "6)Examinar ultima carta\n"
					+ "7)Ver se o baralho está vazio\n"
					+ "8)Ver se o baralho está cheio\n"
					+ "1)Sair\n");	
			a=sc.nextInt();
			switch (a) {
			
			case 1:
				if (de.full()==false) {
					System.out.println("digite a carta a ser inserida: ");
					de.insertFront(let.nextLine());
					a=0;
					break;
				}else {
					System.out.println("esta cheia");
				}
				a=0;
				break;
				
			case 2:
				if (de.full()==false) {
					System.out.println("digite a carta a ser inserida: ");
					de.insertBack(let.nextLine());
					a=0;
					break;
				}else {
					System.out.println("esta cheia");
				}
				a=0;
				break;
			
			case 3:
				de.removeFirst();
				a=0;
				break;
			case 4:
				de.removeLast();
				a=0;
				break;
			case 5:
				de.exameneFirst();
				a=0;
				break;
			case 6:
				de.exameneLast();
				a=0;
				break;
			case 8:
				de.full(de.full());
				a=0;
				break;
			case 7:
				de.empty(de.empty());
				a=0;
				break;
			case 123:
				if(b==1) {
					b=0;
				}else {
					b=1;
				}
				break;
			default:
				a=0;
				break;
			}
			
		}

	}

}
