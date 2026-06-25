package tent1;

public class Deck {
	
	String vetor[];
	int ini;
	int fim;
	
	//para saber onde estou e para onde vou.
	int prox=0,ante=0,quant=0,total;
	
	public Deck(int fim) {
		vetor = new String[fim] ;
		this.ini = 0;
		this.fim = fim;
		this.total = fim;
	}
	
	void insertFront(String a) {
		if(full()==false) {
			
			if(prox==ante) {
				prox++;
				if(prox>fim) {
					prox=ini;
				}
			}else{
			}
			if(ante<ini) {
				ante=fim-1;
				vetor[ante]=a;
				ante--;
				quant++;
				
			}else {
				vetor[ante]=a;
				ante--;
				quant++;
				}
			
		}
	}
	void insertBack(String a) {
		
		if(quant==0) {
			ante--;
			if(ante<ini) {
				ante=fim-1;
			}
			}else{
			}
		
		if(full()==false) {
				if(prox==fim-1) {
					vetor[prox]=a;
					prox=ini;
					quant++;
				}else {
					vetor[prox]=a;
					prox++;
					quant++;
					
				}
			}
	}
	void removeFirst() {
		if (empty()==false) {
			ante++;
			if(ante>fim-1) {
				ante=ini;
			}
			if(vetor[ante]!=null) {
				System.out.println("A carta "+vetor[ante]+" já foi removida");
				vetor[ante]=null;
				quant--;
			}else {
				removeFirst();
			}
			
			
			quant--;
		}
		
	}
	void removeLast() {
		if (empty()==false) {
			prox--;
			if(prox<ini) {
				prox=fim-1;
			}else {
				
			}
			if(vetor[prox]!=null) {
				System.out.println("A carta "+vetor[prox]+" já foi removida");
				vetor[prox]=null;
				quant--;
			}else {
				removeLast();
			}
			
		}
	}
	void exameneFirst() {
		
		System.out.print("A primeira carta é "+vetor[ante+1]);
		
		
	}
	void exameneLast() {
		
		System.out.print("A ultima carta é "+vetor[prox-1]);
		
	}
	boolean empty() {
		if(quant==ini) {
			return true;
		}else {
			return false;
		}
	}
	boolean full() {
		if(quant==fim) {
			return true;
		}else {
			return false;
		}
		
	}
	void empty(boolean a) {
		if(a) {
			System.out.println("O baralho está vazio.");
		}else {
			System.out.println("O baralho não está vazio.");
		}
	}
	void full(boolean a) {
		if(a) {
			System.out.println("O baralho está cheio.");
		}else {
			System.out.println("O baralho não está cheio.");
		}	
	}
	
	
	
	
}
