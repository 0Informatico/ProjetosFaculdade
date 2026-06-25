package atividade;

import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.*;
import java.util.Random;
import java.awt.Font;
import java.awt.Color;


public class PvsP extends JFrame {

	/**
	 * Launch the application.
	 */
	public int a[]=new int[10];
	public int QJ=1;
	public int Quant=0;
	public int QV=0;
	public int getQV() {
		return QV;
	}

	public void setQV(int qV) {
		QV = qV;
	}

	public int random;

	
	public int verefica() {
		int v=0;
		System.out.println("foi");
		for (int f=1;f<=2;f++) {
			if (a[0]==f && a[1]==f && a[2]==f) {
				QV=f;
				return f;
			}if (a[3]==f && a[4]==f && a[5]==f) {
				QV=f;
				return f;
			}if (a[6]==f && a[7]==f && a[8]==f) {
				QV=f;
				return f;
				
			}if (a[0]==f && a[3]==f && a[6]==f) {
				QV=f;
				return f;
			}if (a[1]==f && a[4]==f && a[7]==f) {
				QV=f;
				return f;
			}if (a[2]==f && a[5]==f && a[8]==f) {
				QV=f;
				return f;
			}
			
			if (a[0]==f && a[4]==f && a[8]==f) {
				QV=f;
				return f;
			}if (a[2]==f && a[4]==f && a[6]==f) {
				QV=f;
				return f;
			}
		}for (int f=0;f<9;f++) {
			if(a[f]==0) {
				v++;
				break;
			}
		}if(v==1) {
			return 0;
		}else {
			QV=3;
			return 3;
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PvsP frame = new PvsP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PvsP() {
		for (int f=0;f<9;f++) {
			a[f]=4;
		}
		Random RN = new Random();
		setUndecorated(true);
		getContentPane().setMaximumSize(new Dimension(1920, 1080));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBounds(100, 100, 1600, 800);
		
		JButton btn_sair = new JButton("Sair");
		btn_sair.setBounds(1243, 637, 223, 100);
		btn_sair.setToolTipText("");
		btn_sair.setActionCommand("sair");
		btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btn_sair);
		JLabel lblQuemJoga = new JLabel("Preparados?");
		JButton btnBotaoJogo = new JButton("");
		JButton btnBotaoJogo_1 = new JButton("");
		JButton btnBotaoJogo_2 = new JButton("");
		JButton btnBotaoJogo_3 = new JButton("");
		JButton btnBotaoJogo_4 = new JButton("");
		JButton btnBotaoJogo_5 = new JButton("");
		JButton btnBotaoJogo_6 = new JButton("");
		JButton btnBotaoJogo_7 = new JButton("");
		JButton btnBotaoJogo_8 = new JButton("");
		
		
		
		btnBotaoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[0]==0 && QJ==1) {
				a[0]=1;
				btnBotaoJogo.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
				
			}else if(a[0]==0) {
				a[0]=2;
				btnBotaoJogo.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}
			}
		});
		btnBotaoJogo.setBounds(90, 120, 167, 165);
		getContentPane().add(btnBotaoJogo);
		
		
		btnBotaoJogo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[1]==0 && QJ==1) {
				a[1]=1;
				btnBotaoJogo_1.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}else if(a[1]==0) {
				a[1]=2;
				btnBotaoJogo_1.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}
			}
		});
		btnBotaoJogo_1.setBounds(267, 120, 167, 165);
		getContentPane().add(btnBotaoJogo_1);
		
		
		btnBotaoJogo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[2]==0 && QJ==1) {
				a[2]=1;
				btnBotaoJogo_2.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
				
			}else if(a[2]==0) {
				a[2]=2;
				btnBotaoJogo_2.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
				
			}
			}
		});
		btnBotaoJogo_2.setBounds(444, 120, 167, 165);
		getContentPane().add(btnBotaoJogo_2);
		
		
		btnBotaoJogo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[5]==0 && QJ==1) {
				a[5]=1;
				btnBotaoJogo_5.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}else if(a[5]==0) {
				a[5]=2;
				btnBotaoJogo_5.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}
			}
		});
		btnBotaoJogo_5.setBounds(444, 296, 167, 165);
		getContentPane().add(btnBotaoJogo_5);
		
		
		btnBotaoJogo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[4]==0 && QJ==1) {
				a[4]=1;
				btnBotaoJogo_4.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}else if(a[4]==0) {
				a[4]=2;
				btnBotaoJogo_4.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}
			}
		});
		btnBotaoJogo_4.setBounds(267, 296, 167, 165);
		getContentPane().add(btnBotaoJogo_4);
		
		
		btnBotaoJogo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[3]==0 && QJ==1) {
				a[3]=1;
				btnBotaoJogo_3.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}else if(a[3]==0) {
				a[3]=2;
				btnBotaoJogo_3.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}
			}
		});
		btnBotaoJogo_3.setBounds(90, 296, 167, 165);
		getContentPane().add(btnBotaoJogo_3);
		
		
		btnBotaoJogo_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[7]==0 && QJ==1) {
				a[7]=1;
				btnBotaoJogo_7.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}else if(a[7]==0) {
				a[7]=2;
				btnBotaoJogo_7.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}
			}
		});
		btnBotaoJogo_7.setBounds(267, 472, 167, 165);
		getContentPane().add(btnBotaoJogo_7);
		
		
		btnBotaoJogo_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(a[6]==0 && QJ==1) {
				a[6]=1;
				btnBotaoJogo_6.setText("X");VdQ();
				lblQuemJoga.setText("Jogador 2");
				lblQuemJoga.setForeground(Color.BLUE);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}else if(a[6]==0) {
				a[6]=2;
				btnBotaoJogo_6.setText("O");VdQ();
				lblQuemJoga.setText("Jogador 1");
				lblQuemJoga.setForeground(Color.RED);
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					setVisible(false);
					dispose();
				}
			}
			}
		});
		btnBotaoJogo_6.setBounds(90, 472, 167, 165);
		getContentPane().add(btnBotaoJogo_6);
		
		
		btnBotaoJogo_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[8]==0 && QJ==1) {
					a[8]=1;
					btnBotaoJogo_8.setText("X");VdQ();
					lblQuemJoga.setText("Jogador 2");
					lblQuemJoga.setForeground(Color.BLUE);
					if(verefica()==1 || verefica()==2 || verefica()==3) {
						setVisible(false);
						dispose();
					}
				}else if(a[8]==0) {
					a[8]=2;
					btnBotaoJogo_8.setText("O");VdQ();
					lblQuemJoga.setText("Jogador 1");
					lblQuemJoga.setForeground(Color.RED);
					if(verefica()==1 || verefica()==2 || verefica()==3) {
						setVisible(false);
						dispose();
					}
				}
			}
		});
		btnBotaoJogo_8.setBounds(444, 472, 167, 165);
		getContentPane().add(btnBotaoJogo_8);
		
		
		lblQuemJoga.setForeground(Color.BLACK);
		JButton btnreset = new JButton("Come\u00E7ar");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					for (int f= 0; f<9;f++) {
						a[f]=0;
					}
					
					btnreset.setVisible(false);
					QJ=RN.nextInt(2)+1;
					if(QJ==1) {
						lblQuemJoga.setText("Jogador 1");
						lblQuemJoga.setForeground(Color.RED);
					}else {
						lblQuemJoga.setText("Jogador 2");
						lblQuemJoga.setForeground(Color.BLUE);
					}
				
			}
		});
		btnreset.setBounds(958, 428, 298, 54);
		getContentPane().add(btnreset);
		
		
		lblQuemJoga.setFont(new Font("Tahoma", Font.PLAIN, 90));
		lblQuemJoga.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuemJoga.setBounds(716, 191, 788, 211);
		getContentPane().add(lblQuemJoga);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(91, 120, 520, 517);
		getContentPane().add(panel);
		
		

	}
	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public int getQJ() {
		return QJ;
	}

	public void setQJ(int qJ) {
		QJ = qJ;
	}

	public int getQuant() {
		return Quant;
	}

	public void setQuant(int quant) {
		Quant = quant;
	}

	public void VdQ() {
		if (QJ==1) {
			QJ=2;
			Quant++;
			
		}else {
			QJ=1;
		}
	}
}
