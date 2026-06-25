package windowBuilder;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Component;
import javax.swing.DropMode;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exibição extends metodos {
	
	private JTextField em_exib = new JTextField();
	private JTextField Escrev=new JTextField();
	private JTextField Escrev2=new JTextField();
	private JTextField Escrev7=new JTextField();
	private JTextField Escrev6=new JTextField();
	private JTextField Escrev5=new JTextField();
	private JTextField Escrev4=new JTextField();
	private JTextField Escrev3=new JTextField();
	private JTextField Escrev8=new JTextField();
	private JTextField Escrev9=new JTextField();
	private JTextField Escrev10=new JTextField();
	
	public void inicia() {
		em_exib.setBounds(10, 11, 306, 60);
		em_exib.setFont(new Font("Tahoma", Font.PLAIN, 18));
		em_exib.setEditable(false);
		em_exib.setColumns(20);
		
		Escrev = new JTextField();
		Escrev.setBorder(null);
		Escrev.setToolTipText("");
		Escrev.setBackground(SystemColor.text);
		Escrev.setEditable(false);
		Escrev.setColumns(10);
		
		Escrev2 = new JTextField();
		Escrev2.setBorder(null);
		Escrev2.setSelectionColor(Color.WHITE);
		Escrev2.setEditable(false);
		Escrev2.setColumns(10);
		
		Escrev3 = new JTextField();
		Escrev3.setSelectionColor(Color.WHITE);
		Escrev3.setEditable(false);
		Escrev3.setColumns(10);
		Escrev3.setBorder(null);
		
		Escrev4 = new JTextField();
		Escrev4.setSelectionColor(Color.WHITE);
		Escrev4.setEditable(false);
		Escrev4.setColumns(10);
		Escrev4.setBorder(null);
		
		Escrev5 = new JTextField();
		Escrev5.setSelectionColor(Color.WHITE);
		Escrev5.setEditable(false);
		Escrev5.setColumns(10);
		Escrev5.setBorder(null);
		
		Escrev6 = new JTextField();
		Escrev6.setSelectionColor(Color.WHITE);
		Escrev6.setEditable(false);
		Escrev6.setColumns(10);
		Escrev6.setBorder(null);
		
		Escrev7 = new JTextField();
		Escrev7.setSelectionColor(Color.WHITE);
		Escrev7.setEditable(false);
		Escrev7.setColumns(10);
		Escrev7.setBorder(null);
		
		Escrev8 = new JTextField();
		Escrev8.setSelectionColor(Color.WHITE);
		Escrev8.setEditable(false);
		Escrev8.setColumns(10);
		Escrev8.setBorder(null);
		
		Escrev9 = new JTextField();
		Escrev9.setSelectionColor(Color.WHITE);
		Escrev9.setEditable(false);
		Escrev9.setColumns(10);
		Escrev9.setBorder(null);
		
		Escrev10 = new JTextField();
		Escrev10.setSelectionColor(Color.WHITE);
		Escrev10.setEditable(false);
		Escrev10.setColumns(10);
		Escrev10.setBorder(null);
	}
	
	public void inicia(JPanel panel_8, JPanel Linha1) {
		panel_8.add(Escrev);
		panel_8.add(Escrev2);
		panel_8.add(Escrev3);
		panel_8.add(Escrev4);
		panel_8.add(Escrev5);
		panel_8.add(Escrev6);
		panel_8.add(Escrev7);
		panel_8.add(Escrev8);
		panel_8.add(Escrev9);
		panel_8.add(Escrev10);
		Linha1.add(em_exib);
	}

	public exibição() {
		inicia();
	}
	
	public void exibir() {
		edit=conta.split(" ");
		System.out.println(edit.length);
		if (negativo==true) {
			if(negativo2==true) {
				if(edit.length==3) {
					em_exib.setText("-"+edit[0]+" "+edit[1]+" -"+edit[2]);
				}else {
					em_exib.setText("-"+edit[0]+" "+edit[1]+" -");
				}
				
			}else {
				em_exib.setText("-"+conta);
			}
		}else {
			if(negativo2==true) {
				if(edit.length==3) {
					em_exib.setText(edit[0]+" "+edit[1]+" -"+edit[2]);
				}else {
					em_exib.setText(edit[0]+" "+edit[1]+" -");
				}
			}else {
				em_exib.setText(conta);
			}
		}
	}
	
	public void add(String a) {
		conta+=a;
		exibir();
	}
	
	public void elevado() {
		if(conta.equals("")) {
			conta+=hist;
		}
		if (funcao==false) {
			add(" ^ ");
			funcao=true;
			virgula=false;
		}
	}
	
	public void dividir() {
		if(conta.equals("")) {
			conta+=hist;
		}
		
		if (funcao==false) {
			add(" / ");
			funcao=true;
			virgula=false;
		}
	}
	
	public void multiplicar() {
		if(conta.equals("")) {
			conta+=hist;
		}
		if (funcao==false) {
			add(" X ");
			funcao=true;
			virgula=false;
		}
	}
	
	public void subtrair() {
		if(conta.equals("")) {
			conta+=hist;
		}
		if (funcao==false) {
			add(" - ");
			funcao=true;
			virgula=false;
		}
	}
	
	public void somar() {
		if(conta.equals("")) {
			conta+=hist;
		}
		if (funcao==false) {
			add(" + ");
			funcao=true;
			virgula=false;
		}
	}
	
	public void virgula() {
		edit=conta.split(" ");
		if(edit.length==1) {
			conta+="0";
		}else if(edit.length==2) {
			conta+="0";
		}
		if(virgula==false) {
			add(",");
			virgula=true;
		}
	}
	
	public void escreve(float result) {
		if(Escrev.getText().equals("")) {
			Escrev.setText(a+sinal+b+" = "+result);
		}else if(Escrev2.getText().equals("")) {
			Escrev2.setText(a+sinal+b+" = "+result);
		}else if(Escrev3.getText().equals("")) {
			Escrev3.setText(a+sinal+b+" = "+result);
		}else if(Escrev4.getText().equals("")) {
			Escrev4.setText(a+sinal+b+" = "+result);
		}else if(Escrev5.getText().equals("")) {
			Escrev5.setText(a+sinal+b+" = "+result);
		}else if(Escrev6.getText().equals("")) {
			Escrev6.setText(a+sinal+b+" = "+result);
		}else if(Escrev7.getText().equals("")) {
			Escrev7.setText(a+sinal+b+" = "+result);
		}else if(Escrev8.getText().equals("")) {
			Escrev8.setText(a+sinal+b+" = "+result);
		}else if(Escrev9.getText().equals("")) {
			Escrev9.setText(a+sinal+b+" = "+result);
		}else if(Escrev10.getText().equals("")) {
			Escrev10.setText(a+sinal+b+" = "+result);
		}else {
			Escrev.setText(Escrev2.getText());
			Escrev2.setText(Escrev3.getText());
			Escrev3.setText(Escrev4.getText());
			Escrev4.setText(Escrev5.getText());
			Escrev5.setText(Escrev6.getText());
			Escrev6.setText(Escrev7.getText());
			Escrev7.setText(Escrev8.getText());
			Escrev8.setText(Escrev9.getText());
			Escrev9.setText(Escrev10.getText());
			Escrev10.setText("");
			escreve(result);
		}
		
	}
	
	public void resetH() {
		Escrev.setText("");
		Escrev2.setText("");
		Escrev3.setText("");
		Escrev4.setText("");
		Escrev5.setText("");
		Escrev6.setText("");
		Escrev7.setText("");
		Escrev8.setText("");
		Escrev9.setText("");
		Escrev10.setText("");
	}
	
	public void resetC() {
		conta="";
		negativo=false;
		negativo2=false;
		virgula=false;
		funcao=false;
		exibir();
	}
	
	public void exibResp(float a) {
		em_exib.setText(""+a);
	}
	
	public void igual() {
		float resp = calcula();
		hist=""+resp;
		escreve(resp);
		resetC();
		exibResp(resp);
	}
	
}
