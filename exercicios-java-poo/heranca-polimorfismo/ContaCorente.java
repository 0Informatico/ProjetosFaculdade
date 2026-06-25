package atividade_1;

public class ContaCorente {
	
		private float Saldo;
		
		public ContaCorente(float a) {
			this.Saldo = a;
		}
		
		public float saldo(){
			return this.Saldo;
		}
		public void deposito(float d) {
			this.Saldo=this.Saldo+d;
		}
		public void saque(float a) {
			this.Saldo=(float) (this.Saldo - a - ((this.Saldo/100)*0.5));
		}
		public void apagar() {
			for (int f=0;f<300;f++) {
				System.out.println();
			}
		}

}
