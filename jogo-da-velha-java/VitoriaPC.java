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

public class VitoriaPC extends JFrame {

	private JPanel contentPane;
	public Resultado r1;
	private String nome = null;
	public int a=0;
	private int b=0;
	private JTextField textNome;
	
	public JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

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
					VitoriaPC frame = new VitoriaPC();
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
	public VitoriaPC() {
		JButton btnConfirmar = new JButton("Avan\u00E7ar");
		textNome = new JTextField();
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNome(textNome.getText());
				dispose();
			}
		});
		JLabel lblNewLabel = new JLabel("Digite seu Nome:");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(54, 116, 803, 102);
		contentPane.add(lblNewLabel);
		
		btnConfirmar.setBounds(548, 402, 309, 80);
		contentPane.add(btnConfirmar);
		
		
		textNome.setBounds(174, 229, 583, 80);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblVocVenceu = new JLabel("Voc\u00EA Venceu");
		lblVocVenceu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblVocVenceu.setHorizontalAlignment(SwingConstants.CENTER);
		lblVocVenceu.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblVocVenceu.setBounds(54, 24, 803, 102);
		contentPane.add(lblVocVenceu);
	}
}
