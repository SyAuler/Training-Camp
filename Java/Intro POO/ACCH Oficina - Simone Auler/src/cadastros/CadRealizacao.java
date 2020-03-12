package cadastros;

import java.util.ArrayList;

import dados.*;
import tela.*;

public class CadRealizacao {
	
	static ArrayList<Realizacao> realizacoes = new ArrayList<Realizacao>();

	public void add(Realizacao realizacao) {
		realizacoes.add(realizacao);
	}
	
	public ArrayList gravarArquivo() {
		return realizacoes;
	}
	
	public void lerArquivo(ArrayList objeto) {
		realizacoes = objeto;	
	}
	
	public void listar() {
		String msg = "";
		for (int i = 0; i < (realizacoes).size(); i++ ) {
			msg = msg + "Placa: " + realizacoes.get(i).getAtendimento().getVeiculo().getPlaca()
					+ " Proprietário" + realizacoes.get(i).getAtendimento().getVeiculo().getProprietario().getNome()
					+ " Serviço: " + realizacoes.get(i).getServico().getDescricao()
					+ " Mecanico: " + realizacoes.get(i).getMecanico().getNome()
					+ "\n";
		}
		Janela.mensagem( msg );
	}

}
