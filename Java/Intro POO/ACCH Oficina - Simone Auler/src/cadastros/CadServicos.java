package cadastros;

import java.util.ArrayList;
import dados.Servicos;
import tela.Janela;

public class CadServicos implements Cadastro {
	
	static ArrayList<Servicos> servicos = new ArrayList<Servicos>();

	@Override
	public boolean adicionar() {
		int codigo = Janela.lerInteiro("Informe o c�digo do Servico ", true, 0);
		if (codigo < 0) {
			Janela.erro("Informe um c�digo correto do servi�o");			
		} else {
			Servicos objeto = new Servicos(codigo, null);
			if (servicos.contains(objeto)) {
				Janela.erro("J� cont�m o servi�o " + codigo);				
			} else {
				String descricao = Janela.lerString("Descri��o do servi�o ", true);
				objeto.setDescricao(descricao);
				servicos.add(objeto);
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
		for (int i = 0; i < (servicos).size(); i++ ) {
			msg = msg + "C�digo: " + servicos.get(i).getCodigo() 
					+ " Descricao: " + servicos.get(i).getDescricao()
					+ "\n";
		}
		Janela.mensagem( msg );
	}

	@Override
	public ArrayList gravarArquivo() {
		// TODO Auto-generated method stub
		return servicos;
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		// TODO Auto-generated method stub
		servicos = objeto;
	}
	
	public static Servicos buscarServicoPorCodigo(int codigo) {
		for (int index = 0; index < servicos.size(); index++) {
			if (servicos.get(index).getCodigo() == codigo) {
				return servicos.get(index);
			}
		}
		return null;
	}

}
