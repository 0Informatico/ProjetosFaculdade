package Componentes;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Mediador.Mediator;

public class Botao implements Component{
	
	private Mediator mediator;
	private JButton btn = new JButton("");
	private int x,y;

	private int status = 0; //0-8 numero de bombas; 9 Bomba
	private boolean prot=false, block=false;
	
	public void resetar() {
		btn.setText("");
		btn.setBackground(Color.LIGHT_GRAY);
		prot=false; 
		block=false;
		status = 0;
	}
	
	public Botao() {
		btn.setBackground(Color.LIGHT_GRAY);
		btn.setMargin(new Insets(0, 0, 0, 0));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!mediator.inicio()) {
					mediator.iniciarJogo(x, y);
					clic();
					mediator.setInicio(true);
				}else if(mediator.cavar()==1 && prot==false && block==false){
					clic();
					//System.out.println(x+" / "+y+" ");
				}else if(mediator.cavar()==2 && !block){
					if(prot) {
						prot=false;
						btn.setBackground(Color.LIGHT_GRAY);
						mediator.contarBombas(1);
					}else {
						btn.setBackground(Color.orange);
						mediator.contarBombas(-1);
						prot=true;
					}
				}
			}
		});
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public JButton retorn() {
		return btn;
	}
	
	public boolean block() {
		return block;
	}
	
	public void clic() {
		block=true;
		if(status==0) {
			//System.out.println(x+" / "+y+" ");
			mediator.abrirSq();
			mediator.abrirLados(x, y);
			btn.setBackground(Color.gray);
		}else if(status<9) {
			mediator.abrirSq();
			btn.setBackground(Color.gray);
			btn.setText(""+status);
			//mediator.abrirLados(x, y);
			block=true;
		}else if(status==9) {
			btn.setBackground(Color.red);
			mediator.perdeu();
		}
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
		
	}

	@Override
	public String getName() {
		return "BotãoCampo";
	}
}
