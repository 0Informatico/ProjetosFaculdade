package atividade_9;

public class DataT {
	
	private int ano1;
	private int ano2;
	private int mes1;
	private int mes2;
	private int dia1;
	private int dia2;
	
	public void ano1(int a){
		this.ano1=a;
	}
	public void ano2(int a){
		this.ano2=a;
	}
	public void mes1(int a){
		this.mes1=a;
	}
	public void mes2(int a){
		this.mes2=a;
	}
	public void dia1(int a){
		this.dia1=a;
	}
	public void dia2(int a){
		this.dia2=a;
	}
	public String vemAntes () {
		String a;
		if (this.ano1<this.ano2) {
			a="true";
			return a;
		}else if(this.ano1>this.ano2) {
			a="false";
			return a;
		}else {
			if(this.mes1<this.mes2) {
				a="true";
				return a;
			}else if(this.mes1>this.mes2) {
				a="false";
				return a;
			}else {
				if(this.dia1<this.dia2) {
					a="true";
					return a;
				}else if(this.dia1>this.dia2) {
					a="false";
					return a;
				}else {
					return "Datas iguais" ;
					
				}
			}
		}
	}

}
