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

public class PcF1 extends JFrame {

	/**
	 * Launch the application.
	 */
	public int a[]=new int[10];
	public int QJ=1;
	public int Quant=1;
	public Resultado R1;
	public int random;
	public int quemvenceu=0;
	//public fimdPart t6;
	
	public int verefica() {
		int v=0;
		for (int f=1;f<=2;f++) {
			if (a[0]==f && a[1]==f && a[2]==f) {
				quemvenceu=f;
				return f+1;
			}if (a[3]==f && a[4]==f && a[5]==f) {
				quemvenceu=f;
				return f+1;
			}if (a[6]==f && a[7]==f && a[8]==f) {
				quemvenceu=f;
				return f+1;
				
			}if (a[0]==f && a[3]==f && a[6]==f) {
				quemvenceu=f;
				return f+1;
			}if (a[1]==f && a[4]==f && a[7]==f) {
				quemvenceu=f;
				return f+1;
			}if (a[2]==f && a[5]==f && a[8]==f) {
				quemvenceu=f;
				return f+1;
			}
			
			if (a[0]==f && a[4]==f && a[8]==f) {
				quemvenceu=f;
				return f+1;
			}if (a[2]==f && a[4]==f && a[6]==f) {
				quemvenceu=f;
				return f+1;
			}
		}for (int f=0;f<9;f++) {
			if(a[f]==0) {
				v++;
				break;
			}
		}if(v==1) {
			return 0;
		}else {
			quemvenceu=3;
			return 3;
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PcF1 frame = new PcF1();
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
	public PcF1() {
		getContentPane().setForeground(Color.BLACK);
		
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
		
		JLabel lblNewLabel = new JLabel("Preparado?");
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
			if(a[0]==0) {
				a[0]=1;
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				btnBotaoJogo.setText("X");
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				btnBotaoJogo_1.setText("X");
				
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				btnBotaoJogo_2.setText("X");
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				btnBotaoJogo_5.setText("X");
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				btnBotaoJogo_4.setText("X");
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				btnBotaoJogo_3.setText("X");
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
				btnBotaoJogo_7.setText("X");
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
				btnBotaoJogo_6.setText("X");
				random=RN.nextInt(9);
				while(random!=-1) {
					if(a[random]!=0) {
						random++;
					}
					else{
						switch (random) {
						case 0:
							btnBotaoJogo.setText("O");a[0]=2;random=-1;
							break;
						case 1:
							btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
							break;
						case 2:
							btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
							break;
						case 3:
							btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
							break;
						case 4:
							btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
							break;
						case 5:
							btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
							break;
						case 6:
							btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
							break;
						case 7:
							btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
							break;
						case 8:
							btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
							break;
						}
					}
				}
				if(verefica()==1 || verefica()==2 || verefica()==3) {
					
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
					btnBotaoJogo_8.setText("X");
					random=RN.nextInt(9);
					while(random!=-1) {
						if(a[random]!=0) {
							random++;
						}
						else{
							switch (random) {
							case 0:
								btnBotaoJogo.setText("O");a[0]=2;random=-1;
								break;
							case 1:
								btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
								break;
							case 2:
								btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
								break;
							case 3:
								btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
								break;
							case 4:
								btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
								break;
							case 5:
								btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
								break;
							case 6:
								btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
								break;
							case 7:
								btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
								break;
							case 8:
								btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
								break;
							}
						}
					}
					if(verefica()==1 || verefica()==2 || verefica()==3) {
						
						dispose();
					}
				}
			}
		});
		btnBotaoJogo_8.setBounds(444, 472, 167, 165);
		getContentPane().add(btnBotaoJogo_8);
		
		
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 90));
		lblNewLabel.setBounds(750, 94, 578, 132);
		getContentPane().add(lblNewLabel);
		
		JButton btnComeçar = new JButton("Come\u00E7ar");
		btnComeçar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int f= 0; f<9;f++) {
					a[f]=0;
				}
				lblNewLabel.setVisible(false);
				btnComeçar.setVisible(false);
				
				if(RN.nextInt(2)+1!=2) {
					random=RN.nextInt(9);
					while(random!=-1) {
						if(a[random]!=0) {
							random++;
						}
						else{
							switch (random) {
							case 0:
								btnBotaoJogo.setText("O");a[0]=2;random=-1;
								break;
							case 1:
								btnBotaoJogo_1.setText("O");a[random]=2;random=-1;
								break;
							case 2:
								btnBotaoJogo_2.setText("O");a[random]=2;random=-1;
								break;
							case 3:
								btnBotaoJogo_3.setText("O");a[random]=2;random=-1;
								break;
							case 4:
								btnBotaoJogo_4.setText("O");a[random]=2;random=-1;
								break;
							case 5:
								btnBotaoJogo_5.setText("O");a[random]=2;random=-1;
								break;
							case 6:
								btnBotaoJogo_6.setText("O");a[random]=2;random=-1;
								break;
							case 7:
								btnBotaoJogo_7.setText("O");a[random]=2;random=-1;
								break;
							case 8:
								btnBotaoJogo_8.setText("O");a[random]=2;random=-1;
								break;
							}
						}
					}
				}
			}
		});
		btnComeçar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnComeçar.setBounds(847, 237, 396, 90);
		getContentPane().add(btnComeçar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(90, 120, 521, 517);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		

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
	
	public void SetR1(Resultado res1) {
		this.R1.setDificuldade(res1.getDificuldade());
		this.R1.setNome("aa");
		this.R1.setQuantasJogada(res1.getQuantasJogada());
		this.R1.setQuemvenceu(res1.getQuemvenceu());
	}
	
	public int getQuemvenceu() {
		return quemvenceu;
	}

	public void setQuemvenceu(int quemvenceu) {
		this.quemvenceu = quemvenceu;
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
