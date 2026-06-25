package FIFO;

public class FIFO {
	private Nod raiz=new Nod(null,0);
	private int numero = 0;
	private int remover = 0;
	private int page = 0;
	
	public void adicionar(Object e) {
		if(buscar(e)==false) {
			Nod novo = new Nod(e,this.numero);
			if (this.numero == 0) {
				this.raiz = novo;
				this.numero++;
			}else if(this.numero<4) {
				Nod D = raiz;
				for(int f=0;f<this.numero;f++) {
					if (f==this.numero-1) {
						D.setDireita(novo);
					}
					else{
						D=(Nod) D.getDireita();
					}
				}
				this.numero++;
			}else if(this.numero>3){
				Nod D = raiz;
				if(this.remover==0) {
					D.setElemento(e);
					
				}else {
					for(int f=0;f<=this.remover;f++) {
						if(f==this.remover) {
							D.setElemento(e);
						}else {
							D=(Nod) D.getDireita();
						}
					}
				}
				this.remover++;
				if(this.remover>3) {
				
					this.remover=0;
				}
			}
		this.page++;
		}
	}
	public void ler() {
		int a=4;
		Nod D=raiz;
		for(int f=0;f<this.numero;f++) {
			if(f==this.numero-1) {
				System.out.println(""+D.getElemento());
				a--;
			}else {
				System.out.println(""+D.getElemento());
				D= (Nod) D.getDireita();
				a--;
			}
		}
		for(int f1=0;f1<a;f1++) {
			System.out.println("null");
		}
		System.out.println();
	}
	public void page() {
		System.out.println("page faults:"+this.page+"\n");
	}
	
	public boolean buscar(Object e) {
		boolean a =false;
		Nod D=raiz;
		for(int f=0;f<this.numero;f++) {
			if(f==this.numero-1) {
				if(D.getElemento()==e) {
					a=true;
				}
			}else {
				if(D.getElemento()==e) {
					a=true;
				}else {
					D=(Nod) D.getDireita();
				}
			}
		}
		return a;
	}
}
	