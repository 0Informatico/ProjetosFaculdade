package arvores;

public class ArvoreBinaria {
	private Nod raiz=new Nod(null,0);
	private int numero = 0;
	
	public void adicionar(Object e) {
		this.numero++;
		Nod novo = new Nod(e,this.numero);
		if (this.numero == 1) {
			this.raiz = novo;
		}else {
			int a[]=new int[numero];
			int b=this.numero;
			boolean c=false;
			for (int f=0;f<this.numero;f++) {
				if(b/2>=1 || c ==false) {
					
						a[f]=b/2;
						b=b/2;
					
					if(b==1) {
						c=true;
					}
				}else {
					a[f]=-1;
				}
			}
			Nod D = raiz;
			for(int f=this.numero;f>0;f--) {
				if (a[f-1]!=-1) {
					
					D=verifica(a[f-1],D);
				}
				if(f==1){
					if(this.numero%2==0) {
						D.setEsquerda(novo);
					}else {
						D.setDireita(novo);
					}
				}
			}
		}
	}
	public Nod verifica(int a,Nod b){
		Nod Esquerda = new Nod(null,0);
		Nod Direita = new Nod(null,0);
		if(b.getEsquerda()==null) {
			return b;
		}else if(b.getDireita()==null) {
			return b;
		}else {
			Direita=(Nod)b.getDireita();
			Esquerda=(Nod)b.getEsquerda();
		}
		if(Esquerda.getNumero()==a) {
			return Esquerda;
		}else if(Direita.getNumero()==a) {
			return Direita;
		}else {
			return b;
		}
	}
	
	public void ler() {
		for(int g=1;g<=this.numero;g++) {
			if (g==1) {
				Nod F1=new Nod(null,0);
				Nod F2=new Nod(null,0);
				if(raiz.getDireita()!=null) {
					F2=(Nod)raiz.getDireita();
				}
				if(raiz.getEsquerda()!=null) {
					F1=(Nod)raiz.getEsquerda();							
				}
				System.out.print("\n"+raiz.getElemento()+"\nesquerda:"+F1.getElemento()+"\nDireita:"+F2.getElemento()+"\n");
			}else {
			int a[]=new int[g];
			int b=g;
			boolean c=false;
			for (int f=0;f<g;f++) {
				if(b/2>=1 || c ==false) {
					
						a[f]=b/2;
						b=b/2;
					
					if(b==1) {
						c=true;
					}
				}else {
					a[f]=-1;
				}
			}
			Nod D = raiz;
			
			for(int f=g;f>0;f--) {
				if (a[f-1]!=-1) {
					D=verifica(a[f-1],D);
				}
				if(f==1){
					if(g%2==0) {
						D=(Nod)D.getEsquerda();
						Nod F1=new Nod(null,0);
						Nod F2=new Nod(null,0);
						if(D.getDireita()!=null) {
							F2=(Nod)D.getDireita();
						}
						if(D.getEsquerda()!=null) {
							F1=(Nod)D.getEsquerda();							
						}
						System.out.print("\n"+D.getElemento()+"\nesquerda:"+F1.getElemento()+"\nDireita:"+F2.getElemento()+"\n");
					}else {
						D=(Nod)D.getDireita();
						Nod F1=new Nod(null,0);
						Nod F2=new Nod(null,0);
						if(D.getDireita()!=null) {
							F2=(Nod)D.getDireita();
						}
						if(D.getEsquerda()!=null) {
							F1=(Nod)D.getEsquerda();							
						}
						System.out.print("\n"+D.getElemento()+"\nesquerda:"+F1.getElemento()+"\nDireita:"+F2.getElemento()+"\n");
					}
				}
				
			}
			
		}		
		}
		
	}
	
	public void Buscar(Object alvo) {
		Nod Vet[]=new Nod[this.numero];
		for(int g=1;g<=this.numero;g++) {
			if (g==1) {
				Vet[g-1]=raiz;
			}else {
			int a[]=new int[g];
			int b=g;
			boolean c=false;
			for (int f=0;f<g;f++) {
				if(b/2>=1 || c ==false) {
					
						a[f]=b/2;
						b=b/2;
					
					if(b==1) {
						c=true;
					}
				}else {
					a[f]=-1;
				}
			}
			Nod D = raiz;
			
			for(int f=g;f>0;f--) {
				if (a[f-1]!=-1) {
					D=verifica(a[f-1],D);
				}
				if(f==1){
					if(g%2==0) {
						D=(Nod)D.getEsquerda();
						Vet[g-1]=D;
					}else {
						D=(Nod)D.getDireita();	
						Vet[g-1]=D;
					}
				}	
			}	
		}		
	}
		for(int f=0;f<this.numero;f++) {
			if(Vet[f].getElemento()==alvo) {
				System.out.println(alvo+" pertence a arvore");
				break;
			}else if(f==this.numero-1) {
				System.out.println(alvo+" não pertence a arvore");
				break;
			}
		}
		
	}
	
	public Object ultimoNod() {
		Nod Vet[]=new Nod[this.numero];
		for(int g=1;g<=this.numero;g++) {
			if (g==1) {
				Vet[g-1]=raiz;
			}else {
			int a[]=new int[g];
			int b=g;
			boolean c=false;
			for (int f=0;f<g;f++) {
				if(b/2>=1 || c ==false) {
					
						a[f]=b/2;
						b=b/2;
					
					if(b==1) {
						c=true;
					}
				}else {
					a[f]=-1;
				}
			}
			Nod D = raiz;
			
			for(int f=g;f>0;f--) {
				if (a[f-1]!=-1) {
					D=verifica(a[f-1],D);
				}
				if(f==1){
					if(g%2==0) {
						D=(Nod)D.getEsquerda();
						Vet[g-1]=D;
					}else {
						D=(Nod)D.getDireita();	
						Vet[g-1]=D;
					}
				}	
			}	
		}		
	}
		return Vet[this.numero-1];
		
	}
	public void Remover(Object alvo) {
		Nod Vet[]=new Nod[this.numero];
		for(int g=1;g<=this.numero;g++) {
			if (g==1) {
				Vet[g-1]=raiz;
			}else {
			int a[]=new int[g];
			int b=g;
			boolean c=false;
			for (int f=0;f<g;f++) {
				if(b/2>=1 || c ==false) {
					
						a[f]=b/2;
						b=b/2;
					
					if(b==1) {
						c=true;
					}
				}else {
					a[f]=-1;
				}
			}
			Nod D = raiz;
			
			for(int f=g;f>0;f--) {
				if (a[f-1]!=-1) {
					D=verifica(a[f-1],D);
				}
				if(f==1){
					if(g%2==0) {
						D=(Nod)D.getEsquerda();
						Vet[g-1]=D;
					}else {
						D=(Nod)D.getDireita();	
						Vet[g-1]=D;
					}
				}	
			}	
		}		
	}
		for(int f=0;f<this.numero;f++) {
			if(Vet[f].getElemento()==alvo) {
				Nod D=(Nod)ultimoNod();
				Vet[f].setElemento(D.getElemento());
				this.numero--;
				break;
			}else if(f==this.numero-1) {
				System.out.println(alvo+" não pertence a arvore");
				break;
			}
		}
		
	}
}
