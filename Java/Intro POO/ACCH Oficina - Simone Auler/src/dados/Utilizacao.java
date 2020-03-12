package dados;

import java.io.Serializable;

public class Utilizacao implements Serializable {
	private int qtde;
	private double valor;
	private Pecas peca;
	private Atendimentos atendimento;
	
	public Utilizacao(Atendimentos atendimento) {
		this.atendimento = atendimento;
	}
	
	public Utilizacao(int qtde, double valor) {
		this.qtde = qtde;
		this.valor = valor;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Pecas getPeca() {
		return peca;
	}

	public void setPeca(Pecas peca) {
		this.peca = peca;
	}

	public Atendimentos getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimentos atendimento) {
		this.atendimento = atendimento;
	}
	
	
}
