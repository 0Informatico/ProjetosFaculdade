package encadeadaDupla;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Scanner palavra = new Scanner (System.in);
		ListaCircular lista = new ListaCircular();
		int a=0,b=0;
		while(a!=-456) {
			
			if(b==1) {
				System.out.println(lista.MostraTudo());
			}
			if (lista.Tamanho()>0) {
				System.out.println("Selecione uma opção:\n"
						+ "1)Inserir no inicio\n"
						+ "2)Ver NoLDE de determinada posição\n"
						+ "3)Ver tamanho da lista\n"
						+ "4)Remover o ultimo adicionado\n"
						+ "5)Verificar se objeto está presente na lista\n"
						+ "6)Mostra lista completa\n"
						+ "7)Sair\n");
				a=in.nextInt();
				switch (a) {
				case 1:
					System.out.println("Digite o objeto a ser inserido:");
					lista.Insere(palavra.nextLine());
					a=0;break;
				case 2:
					System.out.println("Digite o qual espaço deseja ver:");
					System.out.println(lista.MostraNodo(palavra.nextInt()));
					a=0;break;
				case 3:
					System.out.println("A lista tem "+lista.Tamanho()+" espaços");
					a=0;break;
				case 4:
					if (lista.Tamanho()>0) {
						System.out.println("o elemento "+lista.Remove()+" já foi removido");
					}else {
						System.out.println("a lista está vazia");
					}
					a=0;break;
				case 5:
					System.out.println("digite qual elemento procura:");
					if(lista.Verifica(palavra.nextLine())==true) {
						System.out.println("O elemento esta na lista");
					}else {
						System.out.println("O elemento não esta na lista");
					}
					a=0;break;
				case 6:
					System.out.println(lista.ShowList());
					a=0;break;
				case 7:
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
			else {
				System.out.println("Selecione uma opção:\n"
						+ "1)Inserir\n"
						+ "2)Sair\n");
				a=in.nextInt();
				switch (a) {
				case 1:
					System.out.println("Digite o objeto a ser inserido:");
					lista.Insere(palavra.nextLine());
					a=0;break;
				case 2:
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
}
