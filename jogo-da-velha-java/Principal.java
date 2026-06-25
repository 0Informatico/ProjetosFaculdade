package atividade;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Dimension;

public class Principal {
	
	
	public static void main(String[] args) {
		resultados R = new resultados();
		Resultado r1= new Resultado(0,0,0,null);
		DeuVeia t10= new DeuVeia();
		Menu t1 = new Menu();
		while(t1.getOque()!=4) {
		t1.setVisible(true);
		while(t1.getOque()==0) {
			System.out.println(t1.getOque());
		}
		switch (t1.getOque()) {
			case 1:
				DerotaPC t7= new DerotaPC();
				VitoriaPC t6 = new VitoriaPC();
				//PvsP t5 = new PvsP();
				PcF2 t4 = new PcF2();
				PcF1 t3 = new PcF1();
				VsPc t2 = new VsPc();
				t2.setVisible(true);
				while(t2.getDificuldade()==0) {
					System.out.println(t2.getDificuldade());
				}
				switch (t2.getDificuldade()) {
				case 1:
					t3.setVisible(true);
					while(t3.getQuemvenceu()==0) {
						System.out.println(t3.getQuemvenceu());
					}
					r1.setDificuldade(1);
					r1.setQuantasJogada(t3.getQuant());
					r1.setQuemvenceu(t3.quemvenceu);
					break;
				case 2:
					t4.setVisible(true);
					while(t4.getQuemvenceu()==0) {
					}
					r1.setDificuldade(2);
					r1.setQuantasJogada(t4.getQuant());
					r1.setQuemvenceu(t4.quemvenceu);
					break;
				}
				if(r1.getQuemvenceu()==1) {
						t6.setVisible(true);
						while(r1.getNome()==null) {
							r1.setNome(t6.getNome());}
					R.setRank(r1);	
				}else if(r1.getQuemvenceu()==2){
					t7.setVisible(true);
					while (t7.getNome()==null) {
						
					}
				}else {
					t10.setVisible(true);
					while (t10.getNome()==null) {
					}
					t10.setNome(null);
					
				}
				r1.setDificuldade(0);
				r1.setQuemvenceu(0);
				r1.setNome(null);
				r1.setQuantasJogada(0);
				t1.setOque(0);
				break;
			
			case 2:
				PvsP t5 = new PvsP();
				VitoriaJogador1 t8 = new VitoriaJogador1();
				VitoriaJogador2 t9 = new VitoriaJogador2();
				t5.setVisible(true);
				while(t5.getQV()==0) {	
				}
				if (t5.getQV()==1) {
					t8.setVisible(true);
					while(t8.getNome()==null) {
					}
				}else if (t5.getQV()==2){
					t9.setVisible(true);
					while(t9.getNome()==null) {
					}
				}else{
					t10.setVisible(true);
					while(t10.getNome()==null) {
					}
					t10.setNome(null);
				}
				t1.setOque(0);
				break;
			case 3:
				Rank Ran =new Rank(R.getRankN(0),R.getRankN(0),R.getRankN(0),R.getRankN(0),R.getRankN(0),R.getRankN(0),R.getRankN(0),R.getRankN(0),R.getRankN(0),R.getRankN(0),
						R.getRankD(0),R.getRankD(0),R.getRankD(0),R.getRankD(0),R.getRankD(0),R.getRankD(0),R.getRankD(0),R.getRankD(0),R.getRankD(0),R.getRankD(0),
						R.getRankQ(0),R.getRankQ(0),R.getRankQ(0),R.getRankQ(0),R.getRankQ(0),R.getRankQ(0),R.getRankQ(0),R.getRankQ(0),R.getRankQ(0),R.getRankQ(0));
				Ran.setVisible(true);
				while (Ran.getOk()==0) {	
				}
				t1.setOque(0);
				break;
		}
		}
	}
}
