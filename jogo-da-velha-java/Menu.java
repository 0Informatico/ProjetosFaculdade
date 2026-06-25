package atividade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

	private JPanel contentPane;
	public int oque=0;

	public int getOque() {
		return oque;
	}

	public void setOque(int oque) {
		this.oque = oque;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param t3 
	 */
	public Menu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 509);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOque(1);
				dispose();
			}
		});
		btnNewButton.setBounds(25, 124, 264, 78);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Multi-Jogador");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOque(1);
				dispose();
			}
		});
		btnNewButton_1.setBounds(25, 213, 264, 78);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lista de Jogadores");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOque(3);
				dispose();
			}
		});
		btnNewButton_2.setBounds(25, 302, 264, 78);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Sair");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOque(4);
				dispose();
			}
		});
		btnNewButton_3.setBounds(25, 391, 264, 68);
		contentPane.add(btnNewButton_3);
		
		JTextPane txtpnAlunosJonatanHerman = new JTextPane();
		txtpnAlunosJonatanHerman.setFont(new Font("Arial", Font.PLAIN, 16));
		txtpnAlunosJonatanHerman.setBackground(new Color(153, 102, 255));
		txtpnAlunosJonatanHerman.setForeground(new Color(0, 0, 0));
		txtpnAlunosJonatanHerman.setText("Aluno 1: Jonatan Herman\r\nAluno 2: Fabricio Mendes Siegel\r\nProfessor: Diego Teixeira Witt\r\nTurma: ECO-2\r\n              ");
		txtpnAlunosJonatanHerman.setBounds(554, 370, 245, 89);
		contentPane.add(txtpnAlunosJonatanHerman);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(501, 29, 245, 330);
		contentPane.add(lblNewLabel);
		
		JLabel lblJogaDaVelha = new JLabel("Jogo Da Velha");
		lblJogaDaVelha.setFont(new Font("Arial", Font.PLAIN, 52));
		lblJogaDaVelha.setBounds(25, 11, 426, 110);
		contentPane.add(lblJogaDaVelha);
	}
}

