package windowBuilder;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class calculadora {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		exibição cal=new exibição();
		
		frame = new JFrame("calculadora");
		frame.setBounds(100, 100, 872, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1,2));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel Linha1 = new JPanel();
		panel_1.add(Linha1);;
		Linha1.setLayout(null);
		
		JPanel limpar = new JPanel();
		limpar.setBounds(326, 11, 92, 60);
		limpar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		Linha1.add(limpar);
		limpar.setLayout(new GridLayout(1, 1, 40, 40));
		
		JButton btnNewButton_21 = new JButton("C");
		btnNewButton_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.resetC();
			}
		});
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_21.setBounds(0, 0, 300, 30);
		limpar.add(btnNewButton_21);
		
		JPanel linha2 = new JPanel();
		panel_1.add(linha2);
		linha2.setLayout(new GridLayout(1, 6, 0, 0));
		
		JPanel panel_12 = new JPanel();
		linha2.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_17 = new JButton("1/x");
		btnNewButton_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.x1();
				cal.exibir();
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_12.add(btnNewButton_17);
		
		JPanel panel_13 = new JPanel();
		linha2.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_18 = new JButton("x^y");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.elevado();
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_13.add(btnNewButton_18);
		
		JPanel panel_14 = new JPanel();
		linha2.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_19 = new JButton("x!");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.exp();
				cal.exibir();
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_14.add(btnNewButton_19);
		
		JPanel panel_15 = new JPanel();
		linha2.add(panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_20 = new JButton("/");
		btnNewButton_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.dividir();
			}
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_15.add(btnNewButton_20);
		
		JPanel linha3 = new JPanel();
		panel_1.add(linha3);
		linha3.setLayout(new GridLayout(1, 6, 0, 0));
		
		JPanel panel_3 = new JPanel();
		linha3.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_13 = new JButton("7");
		btnNewButton_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				cal.add("7");
			}
		});
		btnNewButton_13.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cal.add("7");
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_3.add(btnNewButton_13);
		
		JPanel panel_4 = new JPanel();
		linha3.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_14 = new JButton("8");
		btnNewButton_14.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cal.add("8");
			}
		});
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(btnNewButton_14);
		
		JPanel panel_5 = new JPanel();
		linha3.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_15 = new JButton("9");
		btnNewButton_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.add("9");
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_5.add(btnNewButton_15);
		
		JPanel panel_6 = new JPanel();
		linha3.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_16 = new JButton("x");
		btnNewButton_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.multiplicar();
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(btnNewButton_16);
		
		JPanel linha4 = new JPanel();
		panel_1.add(linha4);
		linha4.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_18 = new JPanel();
		linha4.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.add("4");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_18.add(btnNewButton_9);
		
		JPanel panel_19 = new JPanel();
		linha4.add(panel_19);
		panel_19.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_10 = new JButton("5");
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.add("5");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_19.add(btnNewButton_10);
		
		JPanel panel_21 = new JPanel();
		linha4.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_11 = new JButton("6");
		btnNewButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.add("6");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_21.add(btnNewButton_11);
		
		JPanel panel_2 = new JPanel();
		linha4.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.subtrair();
			}
		});
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnNewButton_12);
		
		JPanel panel_22 = new JPanel();
		panel_1.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 6, 0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_22.add(panel_23);
		panel_23.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.add("1");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_23.add(btnNewButton_5);
		
		JPanel panel_24 = new JPanel();
		panel_22.add(panel_24);
		panel_24.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.add("2");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_24.add(btnNewButton_6);
		
		JPanel panel_25 = new JPanel();
		panel_22.add(panel_25);
		panel_25.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_7 = new JButton("3");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.add("3");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_25.add(btnNewButton_7);
		
		JPanel panel_27 = new JPanel();
		panel_22.add(panel_27);
		panel_27.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.somar();
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_27.add(btnNewButton_8);
		
		JPanel panel_29 = new JPanel();
		panel_1.add(panel_29);
		panel_29.setLayout(new GridLayout(1, 6, 0, 0));
		
		JPanel panel_30 = new JPanel();
		panel_29.add(panel_30);
		panel_30.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("+ / -");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.negativo();
				cal.exibir();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_30.add(btnNewButton_1);
		
		JPanel panel_31 = new JPanel();
		panel_29.add(panel_31);
		panel_31.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.add("0");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_31.add(btnNewButton_2);
		
		JPanel panel_32 = new JPanel();
		panel_29.add(panel_32);
		panel_32.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_3 = new JButton(",");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.virgula();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_32.add(btnNewButton_3);
		
		JPanel panel_35 = new JPanel();
		panel_29.add(panel_35);
		panel_35.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_4 = new JButton("=");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.igual();
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_35.add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(10, 1, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		
		JButton btnNewButton = new JButton("Limpar Historico");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cal.resetH();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setMargin(new Insets(2, 30, 2, 30));
		panel_9.add(btnNewButton);
		
		cal.inicia(panel_8, Linha1);
	}
}
