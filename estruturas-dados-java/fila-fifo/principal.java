package FIFO;

public class principal {

	public static void main(String[] args) {
		FIFO fifo = new FIFO();
		int a[]= {0, 1, 7, 2, 3, 2, 7, 1, 0, 3};
		boolean b=true;
		for(int f=0;f<a.length;f++) {
			fifo.adicionar(a[f]);
			if(b==true) {
				fifo.ler();
			}
		}
		
		fifo.page();
		

	}

}
