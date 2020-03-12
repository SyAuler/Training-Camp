package cadastros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import dados.Marcas;
import dados.Pecas;
import dados.Servicos;
import tela.Janela;

public class CadPecas implements Cadastro {
	
	static ArrayList<Pecas> pecas = new ArrayList<Pecas>();

	@Override
	public boolean adicionar() {
		int codigo = Janela.lerInteiro("Informe o c�digo da Pe�a ", true, 0);

		if (codigo < 0) { // c�digo
			Janela.erro("Informe um c�digo correto da Pe�a");			
		} else {
			Pecas objeto = new Pecas(codigo, null, 0);

			if (pecas.contains(objeto)) {
				Janela.erro("J� cont�m o c�digo " + codigo);

			} else { // descri��o
				String descricao = Janela.lerString("Descri��o da Pe�a ", true);

				if (descricao.trim().length() < 2 ) { 
					Janela.erro("Informe uma descri��o v�lida " + codigo);
				} else {
					objeto.setDescricao(descricao);

					double valor = Janela.lerDouble("Valor da Pe�a ", true, 0);

					if (! (valor > 0)) {
						Janela.erro("Informe o valor da pe�a " + codigo);	
					} else {
						objeto.setValor(valor);
						pecas.add(objeto);
					}
				}
			} 
		}
		return false;
	}

	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void listar() {
		String msg = "";
		for (int i = 0; i < (pecas).size(); i++ ) {
			msg = msg + "C�digo: " + pecas.get(i).getCodigo() 
					+ " Descricao: " + pecas.get(i).getDescricao() 
					+ " Valor: " + pecas.get(i).getValor()
					+ "\n";
		}
		Janela.mensagem( msg );
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		pecas = objeto;	
	}

	@Override
	public ArrayList gravarArquivo() {
		return pecas; // TODO Auto-generated method stub
	}
	
	public static Pecas buscarPecaPorCodigo(int codigo) {
		for (int index = 0; index < pecas.size(); index++) {
			if (pecas.get(index).getCodigo() == codigo) {
				return pecas.get(index);
			}
		}
		return null;
	}

}
