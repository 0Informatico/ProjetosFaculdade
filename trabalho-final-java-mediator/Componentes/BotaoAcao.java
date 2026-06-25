package Componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Mediador.Mediator;

public class BotaoAcao implements Component{
	
	private Mediator mediator;
	private JButton btn = new JButton("Iniciar");
	private int status = 0;
	
	public BotaoAcao() {
		btn.setMargin(new Insets(0, 0, 0, 0));
		btn.setBackground(Color.LIGHT_GRAY);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn.setMargin(new Insets(0, 0, 0, 0));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clic();
			}
		});
	}
	
	public void reset() {
		btn.setText("Iniciar");
		status=0;
		btn.setVisible(false);
	}
	
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}

	public JButton retorn() {
		return btn;
	}
	
	public void clic() {
		if (status==1) {
			btn.setText("Bandeira");
			status=2;
		}else if(status==0){
			btn.setText("Cavar");
			status=1;
			btn.setVisible(true);
		}else {
			btn.setText("Cavar");
			status=1;
		}
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
		
	}

	@Override
	public String getName() {
		return "Iniciar";
	}
}
