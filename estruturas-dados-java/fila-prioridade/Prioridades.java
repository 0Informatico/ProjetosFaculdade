package começo;

import java.util.Scanner;

public class Prioridades {
	Scanner sc1=new Scanner(System.in);
	String[] prioridade1,prioridade2,prioridade3;
	int quant1=0,quant2=0,quant3=0;

	public Prioridades(int a) {
		prioridade1=new String[a];
		prioridade2=new String[a];
		prioridade3=new String[a];
	
	}
	
	public void inserir(int a) {
		switch (a) {
			case 1:
				System.out.println("digite o nome do paciente: ");
				quant1++;
				prioridade1[quant1]="jonatan";
				
				break;
			case 2:
				System.out.println("digite o nome do paciente: ");
				quant2++;
				prioridade2[quant2]="jontan";
				sc1.close();
				break;
			case 3:
				System.out.println("digite o nome do paciente: ");
				quant3++;
				prioridade3[quant3]="jonatan";
				sc1.close();
				break;
		}
	}
	
	public void remov() {
		if(quant1>=0) {
			System.out.println("O Paciente "+prioridade1[0]+" foi atendido e removido da fila");
			for(int f=0;f<=quant1;f++) {
				prioridade1[f]=prioridade1[f+1];
			}
			quant1--;
		}else if(quant2>=0){
			System.out.println("O Paciente "+prioridade2[0]+" foi atendido e removido da fila");
			for(int f=0;f<=quant2;f++) {
				prioridade2[f]=prioridade2[f+1];
			}
			quant2--;
		}else {
			System.out.println("O Paciente "+prioridade3[0]+" foi atendido e removido da fila");
			for(int f=0;f<=quant3;f++) {
				prioridade3[f]=prioridade3[f+1];
			}
			quant3--;
		}
	}
	
	public void peek() {
		if(quant1>=0) {
			System.out.println("O proximo Paciente é "+prioridade1[0]);
		}else if(quant2>=0){
			System.out.println("O proximo Paciente é"+prioridade2[0]);
		}else {
			System.out.println("O proximo Paciente é"+prioridade3[0]);

		}
	}
}
