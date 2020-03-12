package cadastros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.Marcas;
import dados.Modelos;
import tela.Janela;

public class CadModelos implements Cadastro {

	static ArrayList<Modelos> modelos = new ArrayList<Modelos>();
	private CadMarcas cadMarcas;

	public CadModelos(CadMarcas cadMarcas) {
		this.cadMarcas = cadMarcas;
	}

	public static void dadosPadrao() {
		Modelos[] modelos = new Modelos[5];

		modelos[0] = new Modelos("1", "Volkswagen");
		modelos[1] = new Modelos("2", "Ford");

		Modelos sel = (Modelos) JOptionPane.showInputDialog(null, "Selecione o modelo", "Modelos", 
				JOptionPane.INFORMATION_MESSAGE, null, modelos, modelos[1]);

		if (sel == null) {
			JOptionPane.showMessageDialog(null, "Nenhuma");
		} else {
			JOptionPane.showMessageDialog(null, sel.getDescricao());
		}	
	}

	@Override
	public boolean adicionar() {
		String descricao = Janela.lerString("Informe a Marca", true);
		Marcas marca = cadMarcas.buscarMarca(descricao);

		if (marca == null) {
			Janela.erro("A marca não foi localizada");
		} else {
			Modelos objeto = new Modelos(marca);

			String codigo = Janela.lerString("Informe o código do modelo ", true);
			if (codigo.trim().length() < 2) {
				Janela.erro("Informe um código correto do modelo");			
			} else {
				objeto.setCodigo(codigo.toUpperCase());


				if (modelos.contains(objeto)) {
					Janela.erro("Já contém o código " + codigo.toUpperCase());				
				} else {
					descricao = Janela.lerString("Descrição do Modelo ", true);
					objeto.setDescricao(descricao);

					modelos.add(objeto);
				}
			}
		}

		return false;
	}

	@Override
	public boolean remover() {
		return false;
	}

	@Override
	public void listar() {
		String msg = "";
		for (int i = 0; i < (modelos).size(); i++ ) {
			msg = msg + "Código: " + modelos.get(i).getCodigo() 
					+ " Descricao: " + modelos.get(i).getDescricao()
					+ "\n";
		}		
		Janela.mensagem( msg );
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		modelos = objeto;	
	}

	@Override
	public ArrayList gravarArquivo() {
		return modelos;
	}
	
	public static Modelos buscarModelo(String descricao) {
		for (int index = 0; index < modelos.size(); index++) {
			if (modelos.get(index).getDescricao().equalsIgnoreCase(descricao)) {
				return modelos.get(index);
			}
		}
		return null;
	}
}
