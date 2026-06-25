package Componentes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Mediador.Mediator;

public class escritor implements Component{
	private Mediator med;
	
	public static String leitor(String path) throws IOException {
		System.out.println(path);
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		String a = "";
		while (true) {
			if (a != null) {
				System.out.println(a);

			} else
				break;
			
			a=buffRead.readLine();
			if(linha=="" && a != null) {
				linha = a;
			}else if(a != null){
				linha = linha+"\n"+a;
			}
		}
		buffRead.close();
		//System.out.print(linha);
		return linha;
	}
	
	public void escritor(String path, String text) throws IOException {
		FileWriter arquivo = new FileWriter(path);
		BufferedWriter buffWrite = new BufferedWriter(arquivo);
		int a;
		if(path=="dificio") {
			a=1;
		}else {
			a=2;
		}
		buffWrite.write(med.enviaTexto(a)+"\n"+text);
		buffWrite.close();
	}
	
	public void REescritor(String path, String tex) throws IOException {
		FileWriter arquivo = new FileWriter(path);
		BufferedWriter buffWrite = new BufferedWriter(arquivo);
		buffWrite.write(tex);
		buffWrite.close();
	}

	@Override
	public void setMediator(Mediator mediator) {
		med=mediator;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
