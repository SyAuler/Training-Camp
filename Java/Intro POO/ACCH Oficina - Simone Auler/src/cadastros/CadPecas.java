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
		int codigo = Janela.lerInteiro("Informe o código da Peça ", true, 0);

		if (codigo < 0) { // código
			Janela.erro("Informe um código correto da Peça");			
		} else {
			Pecas objeto = new Pecas(codigo, null, 0);

			if (pecas.contains(objeto)) {
				Janela.erro("Já contém o código " + codigo);

			} else { // descrição
				String descricao = Janela.lerString("Descrição da Peça ", true);

				if (descricao.trim().length() < 2 ) { 
					Janela.erro("Informe uma descrição válida " + codigo);
				} else {
					objeto.setDescricao(descricao);

					double valor = Janela.lerDouble("Valor da Peça ", true, 0);

					if (! (valor > 0)) {
						Janela.erro("Informe o valor da peça " + codigo);	
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
			msg = msg + "Código: " + pecas.get(i).getCodigo() 
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
