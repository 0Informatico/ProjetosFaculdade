package Atividade_4;
import java.util.Scanner;
public class Guiche {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float preço=45;
		Normal a= new Normal(preço,500);
		Vip b= new Vip(preço,200);
		CamaroteInferior c = new CamaroteInferior(preço,10,"No terrio nas laterais do palco");
		CamaroteSuperior d = new CamaroteSuperior(preço,10,"No primeiro andar");
		
		a.VerTipo();
		a.ImprimeValor();
		b.VerTipo();
		b.ImprimeValor();
		c.VerTipo();
		System.out.println(d.Local());
		c.ImprimeValor();
		d.VerTipo();
		System.out.println(d.Local());
		d.ImprimeValor();
		
		//venda
		
		a.venda();
		a.VerTipo();
		System.out.println("Temos ainda: "+a.getQuantidade()+" Ingressos ");
		a.ImprimeValor();
		c.venda();
		c.VerTipo();
		System.out.println(d.Local());
		System.out.println("Temos ainda: "+c.getQuantidade()+" Ingressos ");
		c.ImprimeValor();
		c.venda();
		c.VerTipo();
		System.out.println(d.Local());
		System.out.println("Temos ainda: "+c.getQuantidade()+" Ingressos ");
		c.ImprimeValor();
		
		sc.close();

	}

}
