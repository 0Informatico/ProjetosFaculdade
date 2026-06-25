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



public class VsPc extends JFrame {

	/**
	 * Launch the application.
	 */
	public int dificuldade=0;
	
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
					VsPc frame = new VsPc();
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
	public VsPc() {
		setUndecorated(true);
		getContentPane().setMaximumSize(new Dimension(1920, 1080));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBounds(100, 100, 1600, 800);
		
		JButton btn_sair = new JButton("Sair");
		btn_sair.setBounds(1340, 667, 223, 100);
		btn_sair.setToolTipText("");
		btn_sair.setActionCommand("sair");
		btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JButton btnNewButton = new JButton("F\u00E1cil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificuldade=1;
				dispose();
			}
		});
		btnNewButton.setBounds(543, 241, 612, 153);
		getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Dificil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dificuldade=2;
				dispose();
			}
		});
		btnNewButton_1.setBounds(543, 428, 612, 153);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(btnNewButton);
		getContentPane().add(btn_sair);
		
	}
	public void reset() {
		dificuldade = 0;
	}

}
