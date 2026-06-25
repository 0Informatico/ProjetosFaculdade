package Componentes;

import Mediador.Mediator;
import java.util.concurrent.TimeUnit;

public class cronometro extends Thread implements Component{
	
	private Mediator mediador;
	
	public void run() {
		int segundos=0;
		int min=0;
		boolean jogoAnd=true;
		while (jogoAnd && segundos<=60) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			segundos++;
			if(segundos==60) {
				segundos=0;
				min++;
			}
			
			mediador.AtualizaCro(min, segundos);
			jogoAnd=mediador.verificarJogoEmAndamento();
			System.out.println("segundos: "+segundos);
		}
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		mediador=mediator;
	}

}
