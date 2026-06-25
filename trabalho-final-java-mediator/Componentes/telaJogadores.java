package Componentes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Mediador.Mediator;

public class telaJogadores implements Component{
	
	private Mediator med;
	private JPanel tJogadores;
	private JTextArea textArea;
	private JScrollPane scroll;
	private JTextField txtDfcio;
	private JTextField txtNormal;
	private JTextArea textArea_1;
	
	public telaJogadores(Mediator mediator){
		setMediator(mediator);
		tJogadores = new JPanel();
		tJogadores.setBounds(10, 11, 442, 602);
		tJogadores.setLayout(null);
		
		JTextField tituloInicial = new JTextField();
		tituloInicial.setBounds(10, 11, 422, 85);
		tJogadores.add(tituloInicial);
		tituloInicial.setFont(new Font("Tahoma", Font.PLAIN, 60));
		tituloInicial.setText("Jogadores");
		tituloInicial.setBorder(null);
		tituloInicial.setHorizontalAlignment(SwingConstants.CENTER);
		tituloInicial.setEditable(false);
		tituloInicial.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setEditable(!false);
		textArea.setBounds(20, 107, 398, 179);
		
		scroll = new JScrollPane(textArea);
		scroll.setBounds(20, 150, 398, 138);
		tJogadores.add(scroll);
		
		txtDfcio = new JTextField();
		txtDfcio.setText("Dif\u00EDcio");
		txtDfcio.setHorizontalAlignment(SwingConstants.CENTER);
		txtDfcio.setFont(new Font("Tahoma", Font.PLAIN, 32));
		txtDfcio.setEditable(false);
		txtDfcio.setColumns(10);
		txtDfcio.setBorder(null);
		txtDfcio.setBounds(55, 107, 323, 41);
		tJogadores.add(txtDfcio);
		
		textArea_1 = new JTextArea();
		textArea_1.setEditable(!false);
		textArea_1.setBounds(0, 0, 396, 136);
		
		JScrollPane scroll_1 = new JScrollPane(textArea_1);
		scroll_1.setBounds(20, 343, 398, 138);
		tJogadores.add(scroll_1);
		
		
		
		txtNormal = new JTextField();
		txtNormal.setText("Normal");
		txtNormal.setHorizontalAlignment(SwingConstants.CENTER);
		txtNormal.setFont(new Font("Tahoma", Font.PLAIN, 32));
		txtNormal.setEditable(false);
		txtNormal.setColumns(10);
		txtNormal.setBorder(null);
		txtNormal.setBounds(55, 299, 323, 41);
		tJogadores.add(txtNormal);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				med.repassar(2, textArea.getText());
				med.repassar(1, textArea_1.getText());
				removTelJogador();
				med.addMenu();
			}
		});
		btnNewButton.setBounds(89, 520, 267, 59);
		tJogadores.add(btnNewButton);
		
		textArea.setText(med.ler(1));
		textArea_1.setText(med.ler(2));
		
	}
	
	public void addTelJogador() {
		textArea.setText(med.ler(1));
		textArea_1.setText(med.ler(2));
		med.getContentPane().add(tJogadores);
		med.getContentPane().setVisible(false);
		med.getContentPane().setVisible(true);
	}
	
	public void removTelJogador() {
		med.getContentPane().remove(tJogadores);
		med.getContentPane().setVisible(false);
		med.getContentPane().setVisible(true);
	}
	
	public String Dificio() {
		return textArea.getText();
	}
	
	public String Facio() {
		return textArea_1.getText();
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		med = mediator;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
