package OPT;

public class principal {

	public static void main(String[] args) {
		OPT opt = new OPT();
		int a[]= {0, 1, 7, 2, 3, 2, 7, 1, 0, 3};
		boolean b=true;
		for(int f=0;f<a.length;f++) {
			opt.adicionar(a[f]);
			if(b==true) {
				opt.ler();
			}
		}
		
		opt.page();
		

	}

}
