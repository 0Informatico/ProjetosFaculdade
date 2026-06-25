package Hospital;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("digite o numero de espaços da fila de um hospital: ");
		Scanner sc= new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Prioridade M = new Prioridade(sc.nextInt());
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
			
			a=sc.nextInt();
				
			
			switch (a) {
				case 1:
					if(M.isFull()==false) {
						System.out.println("Qual o nivel de Prioridade do Paciente?\n"
								+ "1)gravicimo\n"
								+ "2)grave\n"
								+ "3)normal\n");
						int p=sc.nextInt();
						System.out.println("digite o nome do paciente: ");
						String b=sc1.nextLine();
						M.inserir(p,b);
					}else {
						System.out.println("a fila está cheia");
					}
					break;
				case 2:
					if(M.isEmpty()==false) {
						M.remove();
					}
					else{
						System.out.println("a fila está vazia");
					}
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
				default:
					a=0;
					break;
			}
		}

	}

}
