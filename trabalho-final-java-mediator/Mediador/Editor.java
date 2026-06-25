package Mediador;

import Componentes.*;
//import mediador.Note;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Editor implements Mediator {
	
	private JFrame CampoMinado;
	private JPanel contentPane;
	private telaJogadores tJogadores;
	private escritor es = new escritor();
	@Override
	public JPanel getContentPane() {
		return contentPane;
	}
	
	// ============================= jogo =================================
	private JPanel quant;
	private JPanel Botoes;
	private JPanel Campo;
	private JPanel painelJogo;
	private JTextField txtBombas;
	private JTextField contadorBombas;
	private JTextField cron;
	private Botao[][] btn;
	private BotaoAcao inicial;
	private boolean inicio=false;
	private int xProtegido[]=new int[90];
	private int yProtegido[]=new int[90];
	private int dificuldade=2;
	private Random gerador = new Random();
	private int numQuadrados=20*20;
	private cronometro cro = new cronometro();
	private boolean jogoEmAndamento=false;
	private String tempoConometro="00:00";
	
	//============================= Venceu/Perdeu ==========================
	private JPanel Vitoria;
	private JTextField MensagemVit;
	private JTextField tempo;
	private JTextField nome;
	private JTextField MensagemDerrota;
	private JTextField mensagemFaltoBom;
	private JPanel Derrotas;
	
	//============================= Menu =====================================
	private JPanel Menu;
	private JPanel tCreditos;
	
	//========================== add/remov ==================
	
	public void removMenu() {
		contentPane.remove(Menu);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}

	@Override
	public void addMenu() {
		contentPane.add(Menu);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void removCreditos() {
		contentPane.remove(tCreditos);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void addCreditos() {
		contentPane.add(tCreditos);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void removJogo() {
		contentPane.remove(painelJogo);
		contentPane.remove(Campo);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void addJogo() {
		contentPane.add(painelJogo);
		contentPane.add(Campo);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void removVitoria() {
		contentPane.remove(Vitoria);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void addVitoria() {
		contentPane.add(Vitoria);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void removDerrota() {
		contentPane.remove(Derrotas);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	public void addDerrota() {
		contentPane.add(Derrotas);
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	// ============================== Metodos Menu ==============================
	
	public void clicIniciaJogo(int a) {
		inicio=false;
		xProtegido=new int[90];
		yProtegido=new int[90];
		dificuldade=a;
		resetaBotoesCampo();
		removMenu();
		addJogo();
		inicial.reset();
		numQuadrados=20*20;
		tempoConometro="00:00";
		cro=new cronometro();
		cro.setMediator(this);
		contadorBombas.setText("");
	}
	
	//=============================== Metodos do jogo ===========================
	
	public void escrever(int a, String b) {
		if(a==1) {
			try {
				es.escritor("dificio", b+"\t\tTempo:"+tempoConometro);
			} catch (IOException e) {
			}
		}else {
			try {
				es.escritor("facio", b+"\t\tTempo:"+tempoConometro);
			} catch (IOException e) {
			}
		}
	}
	
	@Override
	public String enviaTexto(int a) {
		if(a==1) {
			return tJogadores.Dificio();
		}else {
			return tJogadores.Facio();
		}
		
	}
	
	@Override
	public String ler(int a) {
		try {
			if(a==2) {
				return es.leitor("facio");
			}
			else {
				return es.leitor("dificio");
			}
		} catch (IOException e) {
		}
		return "oi";
		
	}
	
	@Override
	public void repassar(int a,String b) {
		try {
			if(a==2) {
				es.REescritor("dificio",b);
			}
			else {
				es.REescritor("facio",b);
			}
		} catch (IOException e) {
		}
		
	}
	
	@Override
	public boolean verificarJogoEmAndamento() {
		return jogoEmAndamento;
	}
	
	@Override
	public void AtualizaCro(int b,int a) {
		if(b<10) {
			tempoConometro=("0"+b+":");
		}else {
			tempoConometro=(b+":");
		}
		
		if(a<10) {
			tempoConometro=(tempoConometro+"0"+a);
		}else {
			tempoConometro=(tempoConometro+a);
		}
		
		cron.setText(tempoConometro);
	}
	
	public void resetaBotoesCampo(){
		//Campo.removeAll();
		for (int x=0;x<20;x++) {
			for (int y=0;y<20;y++) {
				btn[x][y].resetar();
			}
		}
	}
	
	@Override
	public void perdeu(){
		removJogo();
		addDerrota();
		jogoEmAndamento=false;
		cro.stop();
		mensagemFaltoBom.setText("faltou "+contadorBombas.getText()+" bombas");
	}
	
	public void ganhou() {
		if(numQuadrados==0) {
			removJogo();
			addVitoria();
			tempo.setText("seu tempo foi "+tempoConometro);
			jogoEmAndamento=false;
			cro.stop();
		}
	}
	
	@Override
	public void abrirSq() {
		numQuadrados--;
		ganhou();
	}
	
	public void setAte() {
		for(int x=0;x<90;x++) {
			xProtegido[x]=999;
			yProtegido[x]=999;
		}
	}
	
	public int irAte() {
		int x=0;
		while(true) {
			if(xProtegido[x]==999) {
				return x;
			}
			x++;
		}
	}
	
	public boolean confere(int a, int b) {
		int x=0;
		while(true) {
			if(xProtegido[x]==999) {
				return false;
			}else if(xProtegido[x]==a && yProtegido[x]==b) {
				return true;
			}
			x++;
		}
	}
	
	public void setarNumeros() {
		for(int x=0;x<20;x++) {
			for(int y=0;y<20;y++) {
				int a=0;
				if(btn[x][y].getStatus()==9) {
					contarBombas(1);
					numQuadrados--;
					continue;
				}
				for(int X=(x-1);X<=x+1;X++) {
					for(int Y=(y-1);Y<=y+1;Y++) {
						try {
							if(btn[X][Y].getStatus()==9) {
								a++;
							}
						}
						catch (ArrayIndexOutOfBoundsException e){
							//System.out.println("não foi");
							continue;
						}
					} 
				}
				btn[x][y].setStatus(a);
			}
		}
	}
	
	@Override
	public void iniciarJogo(int x, int y) {
		setAte();
		//System.out.println("fase1");
		for(int X=x-dificuldade;X<=x+dificuldade;X++) {
			for(int Y=y-dificuldade;Y<=y+dificuldade;Y++) {
				xProtegido[irAte()]=X;
				yProtegido[irAte()]=Y;
			}		
		}
		contadorBombas.setText(""+(0));
		//System.out.println("fase2");
		for(int X=0;X<(100-dificuldade*20);X++) {
			int rand1 = gerador.nextInt(20);
			int rand2 = gerador.nextInt(20);
			if(!confere(rand1,rand2)) {
				//System.out.println("fase3");
				xProtegido[irAte()]=rand1;
				yProtegido[irAte()]=rand2;
				btn[rand1][rand2].setStatus(9);
			}else {
				X--;
			}
		}
		
		setarNumeros();
		jogoEmAndamento=true;
		inicial.clic();
		cro.start();
		
	}
	
	@Override
	public void abrirLados(int x,int y) {
		for(int X=x-1;X<=x+1;X++) {
			for(int Y=y-1;Y<=y+1;Y++) {
				/*System.out.println("original: "+x+"/"+y+
						"\nNovo Click: "+X+"/"+Y);
				*/try {
					if((X==x && Y==y) || btn[X][Y].block()==true) {
						continue;
					}else{
						btn[X][Y].clic();
					}
				}
				catch (ArrayIndexOutOfBoundsException e){
					//System.out.println("não foi");
					continue;
				}
				
				//System.out.println("\n");
			}
		}
	}
	
	@Override
	public int cavar() {
		return inicial.getStatus();
	}
	
	@Override
	public boolean inicio() {
		return inicio;
	}
	
	@Override
	public void setInicio(boolean a) {
		inicio=a;
	}
	
	@Override
	public void enviarA(int B) {
		contadorBombas.setText(""+B);
	}
	
	@Override
	public void criarBotoes() {
		btn= new Botao[20][20];
		for (int x=0;x<20;x++) {
			for (int y=0;y<20;y++) {
				btn[x][y]= new Botao();
				btn[x][y].setXY(x, y);
				btn[x][y].setMediator(this);
				Campo.add(btn[x][y].retorn());
			}
		}
		CampoMinado.setVisible(true);
		
	}
	
    @Override
    public void createGUI() {
    	CampoMinado = new JFrame("CampoMinado");
    	CampoMinado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CampoMinado.setBounds(100, 100, 478, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		CampoMinado.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		painelJogo = new JPanel();
		painelJogo.setBounds(10, 11, 441, 61);
		contentPane.add(painelJogo);
		painelJogo.setLayout(new GridLayout(0, 3, 0, 0));
		
		quant = new JPanel();
		painelJogo.add(quant);
		quant.setLayout(null);
		
		txtBombas = new JTextField();
		txtBombas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBombas.setBorder(null);
		txtBombas.setForeground(Color.BLACK);
		txtBombas.setEditable(false);
		txtBombas.setHorizontalAlignment(SwingConstants.CENTER);
		txtBombas.setText("Bombas");
		txtBombas.setBounds(10, 5, 127, 20);
		quant.add(txtBombas);
		txtBombas.setColumns(10);
		
		contadorBombas = new JTextField();
		contadorBombas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contadorBombas.setText("");
		contadorBombas.setHorizontalAlignment(SwingConstants.CENTER);
		contadorBombas.setForeground(Color.BLACK);
		contadorBombas.setEditable(false);
		contadorBombas.setColumns(10);
		contadorBombas.setBorder(null);
		contadorBombas.setBounds(10, 30, 127, 31);
		quant.add(contadorBombas);
		
		Botoes = new JPanel();
		painelJogo.add(Botoes);
		Botoes.setLayout(new GridLayout(0, 1, 0, 0));
		
		inicial = new BotaoAcao();
		Botoes.add(inicial.retorn());
		
		JPanel Cronometro = new JPanel();
		painelJogo.add(Cronometro);
		Cronometro.setLayout(new GridLayout(0, 1, 0, 0));
		
		cron = new JTextField();
		cron.setText("00:00");
		cron.setHorizontalAlignment(SwingConstants.CENTER);
		cron.setForeground(Color.BLACK);
		cron.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cron.setEditable(false);
		cron.setColumns(10);
		cron.setBorder(null);
		Cronometro.add(cron);
		
		Campo = new JPanel();
		Campo.setBounds(10, 83, 441, 530);
		contentPane.add(Campo);
		Campo.setLayout(new GridLayout(20, 20, 0, 0));
		CampoMinado.setVisible(true);
		
		//Tela Vitoria
		
		Vitoria = new JPanel();
		Vitoria.setBounds(10, 11, 442, 602);
		contentPane.add(Vitoria);
		Vitoria.setLayout(null);
		
		MensagemVit = new JTextField();
		MensagemVit.setBounds(10, 188, 422, 85);
		Vitoria.add(MensagemVit);
		MensagemVit.setFont(new Font("Tahoma", Font.PLAIN, 70));
		MensagemVit.setText("Parab\u00E9ns");
		MensagemVit.setBorder(null);
		MensagemVit.setHorizontalAlignment(SwingConstants.CENTER);
		MensagemVit.setEditable(false);
		MensagemVit.setColumns(10);
		
		tempo = new JTextField();
		tempo.setBounds(10, 272, 422, 56);
		Vitoria.add(tempo);
		tempo.setFont(new Font("Tahoma", Font.PLAIN, 32));
		tempo.setText("seu tempo foi 00:00");
		tempo.setBorder(null);
		tempo.setHorizontalAlignment(SwingConstants.CENTER);
		tempo.setEditable(false);
		tempo.setColumns(10);
		
		nome = new JTextField();
		nome.setBounds(20, 339, 400, 48);
		Vitoria.add(nome);
		nome.setHorizontalAlignment(SwingConstants.CENTER);
		nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nome.setText("Digite seu nome aqui");
		nome.setColumns(10);
		
		JButton btnMenu2 = new JButton("Menu");
		btnMenu2.setBounds(118, 521, 222, 56);
		Vitoria.add(btnMenu2);
		btnMenu2.setBackground(Color.LIGHT_GRAY);
		btnMenu2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escrever(dificuldade,nome.getText());
				removVitoria();
				addMenu();
			}
		});
		
		//Tela Derrotas
		
		Derrotas = new JPanel();
		Derrotas.setBounds(10, 11, 442, 602);
		contentPane.add(Derrotas);
		Derrotas.setLayout(null);
		
		MensagemDerrota = new JTextField();
		MensagemDerrota.setBounds(10, 188, 422, 85);
		Derrotas.add(MensagemDerrota);
		MensagemDerrota.setFont(new Font("Tahoma", Font.PLAIN, 70));
		MensagemDerrota.setText("Voc\u00EA Perdeu");
		MensagemDerrota.setBorder(null);
		MensagemDerrota.setHorizontalAlignment(SwingConstants.CENTER);
		MensagemDerrota.setEditable(false);
		MensagemDerrota.setColumns(10);
		
		mensagemFaltoBom = new JTextField();
		mensagemFaltoBom.setBounds(10, 272, 422, 56);
		Derrotas.add(mensagemFaltoBom);
		mensagemFaltoBom.setFont(new Font("Tahoma", Font.PLAIN, 32));
		mensagemFaltoBom.setText("Faltou x Bombas");
		mensagemFaltoBom.setBorder(null);
		mensagemFaltoBom.setHorizontalAlignment(SwingConstants.CENTER);
		mensagemFaltoBom.setEditable(false);
		mensagemFaltoBom.setColumns(10);
		
		JButton btnMenu1 = new JButton("Menu");
		btnMenu1.setBounds(118, 521, 222, 56);
		Derrotas.add(btnMenu1);
		btnMenu1.setBackground(Color.LIGHT_GRAY);
		btnMenu1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removDerrota();
				addMenu();
			}
		});
		
		//TelaMenu
		Menu = new JPanel();
		Menu.setBounds(10, 11, 442, 602);
		contentPane.add(Menu);
		Menu.setLayout(null);
		
		JTextField tituloInicial = new JTextField();
		tituloInicial.setBounds(10, 73, 422, 85);
		Menu.add(tituloInicial);
		tituloInicial.setFont(new Font("Tahoma", Font.PLAIN, 60));
		tituloInicial.setText("Campo Minado");
		tituloInicial.setBorder(null);
		tituloInicial.setHorizontalAlignment(SwingConstants.CENTER);
		tituloInicial.setEditable(false);
		tituloInicial.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 196, 422, 349);
		Menu.add(panel);
		panel.setLayout(new GridLayout(4, 1, 10, 25));
		
		JButton IniciarJogo = new JButton("Iniciar Jogo");
		IniciarJogo.setBackground(Color.LIGHT_GRAY);
		IniciarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicIniciaJogo(2);
			}
		});
		IniciarJogo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(IniciarJogo);
		
		JButton JogoDificil = new JButton("Jogo Dificil");
		JogoDificil.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JogoDificil.setBackground(Color.LIGHT_GRAY);
		JogoDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicIniciaJogo(1);
			}
		});
		panel.add(JogoDificil);
		
		JButton Rankin = new JButton("Jogadores");
		Rankin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Rankin.setBackground(Color.LIGHT_GRAY);
		Rankin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removMenu();
				tJogadores.addTelJogador();
			}
		});
		panel.add(Rankin);
		
		JButton Creditos = new JButton("Creditos");
		Creditos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Creditos.setBackground(Color.LIGHT_GRAY);
		Creditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removMenu();
				addCreditos();
			}
		});
		panel.add(Creditos);
		
		cro.setMediator(this);
		
		//===================== tela Jogadores ==========================
		tJogadores= new telaJogadores(this);
		
		//===================== creditos
		tCreditos = new JPanel();
		tCreditos.setBounds(10, 11, 442, 602);
		contentPane.add(tCreditos);
		tCreditos.setLayout(null);
		
		JTextArea txtrCreditosJonatanHerman = new JTextArea();
		txtrCreditosJonatanHerman.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtrCreditosJonatanHerman.setText("Creditos:\r\nJonatan Herman\r\n\r\nIdeias:\r\nJonatan Herman\r\n\r\nAgradecimentos:\r\n   Agrade\u00E7o ao professor \r\n   Fernando pela opurtunidade,\r\n   os meus colegas e meu \r\n   fim de semana perdido por \r\n   conta desse trabalho kkkkk");
		txtrCreditosJonatanHerman.setBounds(10, 11, 422, 465);
		tCreditos.add(txtrCreditosJonatanHerman);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removCreditos();
				addMenu();
			}
		});
		btnNewButton.setBounds(117, 529, 213, 62);
		tCreditos.add(btnNewButton);
		
		removJogo();
		removVitoria();
		removDerrota();
		removMenu();
		removCreditos();
		
		//tJogadores.addTelJogador();
		addMenu();
		//addVitoria();
		es.setMediator(this);
		
	}
    
    @Override
    public void contarBombas(int a) {
    	if(a==1) {
    		contadorBombas.setText(""+(Integer.parseInt(contadorBombas.getText())+1));
    	}else {
    		contadorBombas.setText(""+(Integer.parseInt(contadorBombas.getText())-1));
    	}
    }
}