package LRU;

public class principal {

	public static void main(String[] args) {
		LRU lru = new LRU();
		int a[]= {0, 1, 7, 2, 3, 2, 7, 1, 0, 3};
		boolean b=true;
		for(int f=0;f<a.length;f++) {
			lru.adicionar(a[f]);
			if(b==true) {
				lru.ler();
			}
		}
		
		lru.page();
		

	}

}
