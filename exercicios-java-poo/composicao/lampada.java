package atividade_6;

public class lampada {
	
	private boolean estado; 
	
	public void a (String a) {
		a=a.toLowerCase();
		if(a.equals("acessa")) {
			this.estado=true;
		}else {
			this.estado=false;
		}
	}
	public String b () {
		String a;
		if (this.estado == true) {
			a="a lampada esta acesa";
		}else {
			a="a lampada esta apagada";
		}
		return a;
	}

}
