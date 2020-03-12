package dados;

import java.util.ArrayList;
import cadastros.Cadastro;
import tela.Janela;

public class Veiculos implements java.io.Serializable {

	private String placa;
	private int ano;
	private String observacao;
	private Modelos modelo;
	private Proprietarios proprietario;
	
	public Veiculos(Proprietarios proprietario) {
		this.proprietario = proprietario;
	}
	
	public Veiculos(Modelos modelo, Proprietarios proprietario) {
		this.modelo = modelo;
		this.proprietario = proprietario;
	}
	
	public Veiculos(String placa, int ano, String observacao) {
		super();
		this.placa = placa;
		this.ano = ano;
		this.observacao = observacao;
	}

	public Modelos getModelo() {
		return modelo;
	}
	
	public Proprietarios getProprietario() {
		return proprietario;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}	
	
}
