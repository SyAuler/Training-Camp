package cadastros;

import java.util.ArrayList;

import dados.*;
import tela.*;

public class CadUtilizacao  {

	static ArrayList<Utilizacao> utilizacoes = new ArrayList<Utilizacao>();

	public void add(Utilizacao utilizacao) {
		utilizacoes.add(utilizacao);
	}
	
	public ArrayList gravarArquivo() {
		return utilizacoes;
	}
	
	public void lerArquivo(ArrayList objeto) {
		utilizacoes = objeto;	
	}
	
	public void listar() {
		String msg = "";
		for (int i = 0; i < (utilizacoes).size(); i++ ) {
			msg = msg + "Placa: " + utilizacoes.get(i).getAtendimento().getVeiculo().getPlaca()
					+ " Peça: " + utilizacoes.get(i).getPeca().getDescricao() 
					+ " Proprietario: " + utilizacoes.get(i).getAtendimento().getVeiculo().getProprietario().getNome()
					+ "\n";
		}
		Janela.mensagem( msg );
	}

}
