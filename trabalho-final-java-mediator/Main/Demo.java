package Main;

import Mediador.Editor;
import Mediador.Mediator;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();
        mediator.createGUI();
        mediator.criarBotoes();        
    }
}