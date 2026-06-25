package Mediador;

import Componentes.Botao;
import Componentes.Component;

import javax.swing.*;

/**
 * Common mediator interface.
 */
public interface Mediator {
    
	void createGUI();
	void criarBotoes();
	void enviarA(int b);
	boolean inicio();
	void setInicio(boolean a);
	int cavar();
	void abrirLados(int x, int y);
	void iniciarJogo(int x, int y);
	void contarBombas(int a);
	void abrirSq();
	void perdeu();
	void AtualizaCro(int b, int a);
	boolean verificarJogoEmAndamento();
	JPanel getContentPane();
	void repassar(int a, String b);
	void addMenu();
	String ler(int a);
	String enviaTexto(int a);
}