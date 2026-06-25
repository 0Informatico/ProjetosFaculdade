package atividade;

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

public class Resultado {
		
	private int quemvenceu;
	private int quantasJogada;
	private int dificuldade;
	private String Nome;

		public String getNome() {
		return this.Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

		public int getQuantasJogada() {
			return this.quantasJogada;
		}

		public void setQuantasJogada(int quantasJogada) {
			this.quantasJogada = quantasJogada;
		}

		public int getDificuldade() {
			return this.dificuldade;
		}

		public void setDificuldade(int dificuldade) {
			this.dificuldade = dificuldade;
		}

		public int getQuemvenceu() {
			return this.quemvenceu;
		}

		public void setQuemvenceu(int quemvenceu) {
			this.quemvenceu = quemvenceu;
		}

		public Resultado(int quemvenceu, int quantasJogada, int dificuldade, String nome) {
			super();
			this.quemvenceu = quemvenceu;
			this.quantasJogada = quantasJogada;
			this.dificuldade = dificuldade;
			Nome = nome;
		}
}
