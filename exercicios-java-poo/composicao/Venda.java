package atividade_5;

public class Venda {
	
	public float a (float a) {
		float b=0;
		if(a<10) {
			b=a+(a/100)*70;
		}else if(a>= 10 && a<30) {
			b=a+(a/100)*50;
		}else if(a>= 30 && a<50) {
			b=a+(a/100)*40;
		}else {
			b=a+(a/100)*30;
		}
		return b;
	}

}
