package windowBuilder;

public class metodos {
	
	protected String conta="";
	protected String hist="0";
	protected String[] edit = new String[3];
	protected float a=0,b=0;
	protected boolean negativo=false,funcao=false,virgula=false,negativo2=false;
	public String sinal="";
	
	//===================== 	metodos 	============================
	public void x1() {
		if(conta.equals("")) {
			conta=hist;
		}
		edit=conta.split(" ");
		if(edit.length==1) {
			edit[0]=edit[0].replace(',','.');
			a= Float.parseFloat(edit[0]);
			conta=""+1/a;
		}else if(edit.length==2) {
		}else {
			edit[2]=edit[2].replace(',','.');
			a= Float.parseFloat(edit[2]);
			conta=""+edit[0]+" "+edit[1]+" "+1/a;
		}
	}
	
	public void exp() {
		if(conta.equals("")) {
			conta=hist;
		}
		edit=conta.split(" ");
		if(edit.length==1) {
			edit[0]=edit[0].replace(',','.');
			a= Float.parseFloat(edit[0]);
			int S=0;
			for(int f=1;f<=a;f++) {
				S+=f;
			}
			conta=""+S;
		}else if(edit.length==2) {
		}else {
			edit[2]=edit[2].replace(',','.');
			a= Float.parseFloat(edit[2]);
			int S=0;
			for(int f=1;f<=a;f++) {
				S+=f;
			}
			conta=""+edit[0]+" "+edit[1]+" "+S;
		}
	}
	
	public void negativo() {
		if(conta.equals("")) {
			conta=hist;
		}
		if(funcao==true) {
			if(negativo2==true) {
				negativo2=false;
			}else {
				negativo2=true;
			}
		}else if (negativo==true) {
			negativo=false;
		}else {
			negativo=true;
		}
	}
	
	public float calcula() {
		edit=conta.split(" ");
		edit[0]=edit[0].replace(',','.');
		a= Float.parseFloat(edit[0]);
		b= 0;
		if(edit.length==3) {
			edit[2]=edit[2].replace(',','.');
			b= Float.parseFloat(edit[2]);
			System.out.println(b);
		}else {
			conta+="0";
		}
		
		if(negativo==true) {
			a*=-1;
		}
		if(negativo2==true) {
			b*=-1;
		}if(edit.length==1) {
			return (a);
		}else {
			switch (edit[1].charAt(0)) {
			case '+':
				sinal=" + ";
				return (a+b);
			case '-':
				sinal=" - ";
				return (a-b);
			case 'X':
				sinal=" X ";
				return (a*b);
			case '/':
				sinal=" / ";
				return (a/b);
			case '^':
				sinal=" ^ ";
				float S=1;
				for(int f=0;f<b;f++) {
					S*=a;
				}
				return (S);
			default:
				return 0;
		}
		}
	}
}
