package começo;

import java.util.Scanner;

public class Fila {
	Scanner sc=new Scanner(System.in);
	int inicio =0;
	int fim = 0;
	int quant=0;
	Prioridades P;
	int prio=0;
	String a;
	
	public Fila(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
		P = new Prioridades(20);
	}
	
	//inserir, remover, isEmpty, isFull, peek \
	
	public void inserir(){
		
		if(isFull()==false) {
			System.out.println("Qual o nivel de Prioridade do Paciente?\n"
					+ "1)gravicimo\n"
					+ "2)grave\n"
					+ "3)normal\n");
			prio=sc.nextInt();
			System.out.println("digete o nome do paciente");
			P.inserir(prio);
			quant++;
		}else {
			System.out.println("a fila está cheia");
		}
		sc.close();
	}
	public void remover(){
		if(isEmpty()==false) {
			P.remov();
			quant--;
		}else {
			System.out.println("a fila esta vazia;");
		}
		
	}
	public void peek(){
		if(isEmpty()==false) {
			P.peek();;
		}else {
			System.out.println("a fila esta vazia;");
		}
	
	}
	
	public boolean isEmpty(){
		if(quant==inicio) {
			return true;
		}else {
			return false;
		}
	
	}
	public boolean isFull(){
		if(quant==fim) {
			return true;
		}else {
			return false;
		}
	
	}
	public void isEmpty(boolean a){
		if(a==true) {
			System.out.println("A fila está vazia");
		}else {
			System.out.println("A fila não está vazia");
		}
	
	}
	public void isFull(boolean a){
		if(a==true) {
			System.out.println("A fila está cheia");
		}else {
			System.out.println("A fila não está cheia");
		}
	
	}
	
	

}
