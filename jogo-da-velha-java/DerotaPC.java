package atividade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DerotaPC extends JFrame {

	private JPanel contentPane;
	public Resultado r1;
	private String nome = null;
	public int a=0;
	private int b=0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DerotaPC frame = new DerotaPC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param b 
	 * @param a 
	 */
	public DerotaPC() {
		JButton btnConfirmar = new JButton("Avan\u00E7ar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNome("perdeu");
				dispose();
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnConfirmar.setBounds(548, 402, 309, 80);
		contentPane.add(btnConfirmar);
		
		JLabel lblVocVenceu = new JLabel("Voc\u00EA Perdeu");
		lblVocVenceu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblVocVenceu.setHorizontalAlignment(SwingConstants.CENTER);
		lblVocVenceu.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblVocVenceu.setBounds(54, 24, 803, 102);
		contentPane.add(lblVocVenceu);
	}
}
