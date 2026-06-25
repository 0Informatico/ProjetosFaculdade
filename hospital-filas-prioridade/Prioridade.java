package Hospital;

import java.util.Scanner;

public class Prioridade {
	
	Scanner sc1=new Scanner(System.in);
	String[] prioridade1,prioridade2,prioridade3;
	int quant1=0,quant2=0,quant3=0;
	int fim;
	int quant=0;

	public Prioridade(int a) {
		prioridade1=new String[a];
		prioridade2=new String[a];
		prioridade3=new String[a];
		fim=a;
	
	}
	
	public void inserir(int a, String b) {
		quant++;
		switch (a) {
			case 1:
				prioridade1[quant1]=b;
				quant1++;
				
				break;
			case 2:
				prioridade2[quant2]=b;
				quant2++;
				break;
			case 3:
				prioridade3[quant3]=b;
				quant3++;
				break;
		}
	}
	
	public void remove() {
		quant--;
		if(quant1>0) {
			System.out.println("O Paciente "+prioridade1[0]+" foi atendido e removido da fila");
			for(int f=0;f<=quant1;f++) {
				prioridade1[f]=prioridade1[f+1];
			}
			quant1--;
		}else if(quant2>0){
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
			System.out.println("O proximo Paciente é "+prioridade2[0]);
		}else {
			System.out.println("O proximo Paciente é "+prioridade3[0]);

		}
	}
	public boolean isFull(){
		if(quant==fim) {
			return true;
		}else {
			return false;
		}
	}
	
	public void isFull(boolean a){
		if(a) {
			System.out.println("está cheia");
		}else {
			System.out.println("não está cheia");
		}
	}
	public boolean isEmpty(){
		if(quant==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void isEmpty(boolean a){
		if(a) {
			System.out.println("está vazia");
		}else {
			System.out.println("não está vazia");
		}
	}
	
}
