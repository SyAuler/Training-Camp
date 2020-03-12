package cadastros;

import java.util.ArrayList;
import java.util.Date;

import dados.Atendimentos;
import dados.*;
import tela.*;

public class CadAtendimentos implements Cadastro {

	static ArrayList<Atendimentos> atendimentos = new ArrayList<Atendimentos>();
	private CadVeiculos cadVeiculos;

	public CadAtendimentos(CadVeiculos cadVeiculos) {
		this.cadVeiculos = cadVeiculos;
	}
	
	@Override
	public boolean adicionar() {
		return false;
	}

	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList gravarArquivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		// TODO Auto-generated method stub
	}

}
