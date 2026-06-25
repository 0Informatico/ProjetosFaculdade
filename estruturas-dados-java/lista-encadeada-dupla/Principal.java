package encadeadaDupla;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Scanner palavra = new Scanner (System.in);
		ListaEncadeadaDupla lista = new ListaEncadeadaDupla();
		int a=0,b=0;
		while(a!=-456) {
			
			if(b==1) {
				System.out.println(lista.ShowList());
			}
			
			System.out.println("Selecione uma opção:\n"
					+ "1)Inserir no inicio\n"
					+ "2)Inserir no final\n"
					+ "3)Ver NoLDE de determinada posição\n"
					+ "4)Ver tamanho da lista\n"
					+ "5)Remover do inicio\n"
					+ "6)Remover do fim\n"
					+ "7)Verificar se objeto está presente na lista\n"
					+ "8)Mostra lista completa\n"
					+ "9)Sair\n");
			a=in.nextInt();
			switch (a) {
			case 1:
				System.out.println("Digite o objeto a ser inserido:");
				lista.Insere(palavra.nextLine());
				a=0;break;
			case 2:
				System.out.println("Digite o objeto a ser inserido:");
				lista.InsereF(palavra.nextLine());
				a=0;break;
			case 3:
				System.out.println("Digite o qual espaço deseja ver:");
				System.out.println(lista.MostraNodo(palavra.nextInt()));
				a=0;break;
			case 4:
				System.out.println("A lista tem "+lista.Tamanho()+" espaços");
				a=0;break;
			case 5:
				System.out.println("o elemento "+lista.Inicial()+" já foi removido");
				lista.Remove();
				a=0;break;
			case 6:
				System.out.println("o elemento "+lista.Final()+" já foi removido");
				lista.RemoveF();
				a=0;break;
			case 7:
				System.out.println("digite qual elemento procura:");
				if(lista.Verifica(palavra.nextLine())==true) {
					System.out.println("O elemento esta na lista");
				}else {
					System.out.println("O elemento não esta na lista");
				}
				a=0;break;
			case 8:
				System.out.println(lista.ShowList());
				a=0;break;
			case 9:
				a=-456;
				break;
			case 123:
				if(b==0) {
					b=1;
				}else {
					b=0;
				}
				a=0;
				break;
			default:
				a=0;
				break;
			}
		}
	}

}
