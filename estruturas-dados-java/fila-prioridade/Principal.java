package começo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("digite o numero de espaços da fila de um hospital: ");
		Scanner sc= new Scanner(System.in);
		Fila M = new Fila(0, sc.nextInt());
		int a=0;
		while(a!=-4) {
			System.out.println("Qual opção você deseja:\n"
					+ "1)Cadastrar um Paciente\n"
					+ "2)Remover um Paciente\n"
					+ "3)Ver o proximo paciente\n"
					+ "4)Ver se a fila esta vazia\n"
					+ "5)Ver se ela está cheia\n"
					//+ "8)Alterar o tamanho da fila\n"
					+ "6)Sair\n");
			a=1;
				
			
			switch (a) {
				case 1:
					M.inserir();
					a=0;
					break;
				case 2:
					M.remover();
					break;
				case 3:
					M.peek();
					break;
				case 4:
					M.isEmpty(M.isEmpty());
					break;
				case 5:
					M.isFull(M.isFull());
					break;
				case 8:
					main(args);
					break;
				case 6:
					a=-4;
					break;
			}
		}

	}

}
