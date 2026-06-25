package atividade;

import java.awt.EventQueue;

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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.ListSelectionModel;



public class Rank extends JFrame {

	/**
	 * Launch the application.
	 */
	public int dificuldade=0;
	public resultados R;
	public int ok=0;
	
	public int getOk() {
		return ok;
	}

	public void setOk(int ok) {
		this.ok = ok;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rank frame = new Rank(null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
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
	public Rank(String N1,String N2,String N3,String N4,String N5,String N6,String N7,String N8,String N9,String N10,
			int D1,int D2,int D3,int D4,int D5,int D6,int D7,int D8,int D9,int D10,
			int Q1,int Q2,int Q3,int Q4,int Q5,int Q6,int Q7,int Q8,int Q9,int Q10) {
		setUndecorated(true);
		getContentPane().setMaximumSize(new Dimension(1920, 1080));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBounds(100, 100, 1600, 800);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 11, 1273, 810);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome.setBounds(0, 0, 680, 67);
		panel.add(lblNome);
		
		JLabel lblDificuldade = new JLabel("Dificuldade");
		lblDificuldade.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade.setBounds(679, 0, 223, 67);
		panel.add(lblDificuldade);
		
		JLabel lblQuantidadeDeJogadas = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas.setBounds(898, 0, 336, 67);
		panel.add(lblQuantidadeDeJogadas);
		
		JLabel lblNome_1 = new JLabel(""+N1);
		lblNome_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_1.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_1.setBounds(0, 66, 680, 67);
		panel.add(lblNome_1);
		
		JLabel lblDificuldade_1 = new JLabel("Dificuldade");
		lblDificuldade_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_1.setBounds(679, 66, 223, 67);
		panel.add(lblDificuldade_1);
		
		JLabel lblQuantidadeDeJogadas_1 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_1.setBounds(898, 66, 336, 67);
		panel.add(lblQuantidadeDeJogadas_1);
		
		JLabel lblNome_2 = new JLabel("false");
		lblNome_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_2.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_2.setBounds(0, 135, 680, 67);
		panel.add(lblNome_2);
		
		JLabel lblDificuldade_2 = new JLabel("Dificuldade");
		lblDificuldade_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_2.setBounds(679, 135, 223, 67);
		panel.add(lblDificuldade_2);
		
		JLabel lblQuantidadeDeJogadas_2 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_2.setBounds(898, 135, 336, 67);
		panel.add(lblQuantidadeDeJogadas_2);
		
		JLabel lblNome_3 = new JLabel("Nome");
		lblNome_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_3.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_3.setBounds(0, 198, 680, 67);
		panel.add(lblNome_3);
		
		JLabel lblDificuldade_3 = new JLabel("Dificuldade");
		lblDificuldade_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_3.setBounds(679, 198, 223, 67);
		panel.add(lblDificuldade_3);
		
		JLabel lblQuantidadeDeJogadas_3 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_3.setBounds(898, 198, 336, 67);
		panel.add(lblQuantidadeDeJogadas_3);
		
		JLabel lblNome_4 = new JLabel("Nome");
		lblNome_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_4.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_4.setBounds(0, 263, 680, 67);
		panel.add(lblNome_4);
		
		JLabel lblDificuldade_4 = new JLabel("Dificuldade");
		lblDificuldade_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_4.setBounds(679, 263, 223, 67);
		panel.add(lblDificuldade_4);
		
		JLabel lblQuantidadeDeJogadas_4 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_4.setBounds(898, 263, 336, 67);
		panel.add(lblQuantidadeDeJogadas_4);
		
		JLabel lblNome_5 = new JLabel("Nome");
		lblNome_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_5.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_5.setBounds(0, 331, 680, 67);
		panel.add(lblNome_5);
		
		JLabel lblDificuldade_5 = new JLabel("Dificuldade");
		lblDificuldade_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_5.setBounds(679, 331, 223, 67);
		panel.add(lblDificuldade_5);
		
		JLabel lblQuantidadeDeJogadas_5 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_5.setBounds(898, 331, 336, 67);
		panel.add(lblQuantidadeDeJogadas_5);
		
		JLabel lblNome_6 = new JLabel("Nome");
		lblNome_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_6.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_6.setBounds(0, 398, 680, 67);
		panel.add(lblNome_6);
		
		JLabel lblDificuldade_6 = new JLabel("Dificuldade");
		lblDificuldade_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_6.setBounds(679, 398, 223, 67);
		panel.add(lblDificuldade_6);
		
		JLabel lblQuantidadeDeJogadas_6 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_6.setBounds(898, 398, 336, 67);
		panel.add(lblQuantidadeDeJogadas_6);
		
		JLabel lblNome_7 = new JLabel("Nome");
		lblNome_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_7.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_7.setBounds(0, 465, 680, 67);
		panel.add(lblNome_7);
		
		JLabel lblDificuldade_7 = new JLabel("Dificuldade");
		lblDificuldade_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_7.setBounds(679, 465, 223, 67);
		panel.add(lblDificuldade_7);
		
		JLabel lblQuantidadeDeJogadas_7 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_7.setBounds(898, 465, 336, 67);
		panel.add(lblQuantidadeDeJogadas_7);
		
		JLabel lblNome_8 = new JLabel("Nome");
		lblNome_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_8.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_8.setBounds(0, 533, 680, 67);
		panel.add(lblNome_8);
		
		JLabel lblDificuldade_8 = new JLabel("Dificuldade");
		lblDificuldade_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_8.setBounds(679, 533, 223, 67);
		panel.add(lblDificuldade_8);
		
		JLabel lblQuantidadeDeJogadas_8 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_8.setBounds(898, 533, 336, 67);
		panel.add(lblQuantidadeDeJogadas_8);
		
		JLabel lblNome_9 = new JLabel("Nome");
		lblNome_9.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_9.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_9.setBounds(0, 600, 680, 67);
		panel.add(lblNome_9);
		
		JLabel lblDificuldade_9 = new JLabel("Dificuldade");
		lblDificuldade_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_9.setBounds(679, 600, 223, 67);
		panel.add(lblDificuldade_9);
		
		JLabel lblQuantidadeDeJogadas_9 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_9.setBounds(898, 600, 336, 67);
		panel.add(lblQuantidadeDeJogadas_9);
		
		JLabel lblNome_10 = new JLabel("Nome");
		lblNome_10.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNome_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_10.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNome_10.setBounds(0, 665, 680, 67);
		panel.add(lblNome_10);
		
		JLabel lblDificuldade_10 = new JLabel("Dificuldade");
		lblDificuldade_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblDificuldade_10.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDificuldade_10.setBounds(679, 665, 223, 67);
		panel.add(lblDificuldade_10);
		
		JLabel lblQuantidadeDeJogadas_10 = new JLabel("Quantidade de Jogadas");
		lblQuantidadeDeJogadas_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeJogadas_10.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblQuantidadeDeJogadas_10.setBounds(898, 665, 336, 67);
		panel.add(lblQuantidadeDeJogadas_10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 58));
		btnSair.setBounds(1336, 557, 242, 137);
		getContentPane().add(btnSair);
		
	}
	public void reset() {
		dificuldade = 0;
	}
}
