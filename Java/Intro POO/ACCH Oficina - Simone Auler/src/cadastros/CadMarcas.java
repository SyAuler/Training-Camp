package cadastros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.Marcas;
import tela.Janela;

public class CadMarcas implements Cadastro {
	
	static ArrayList<Marcas> marcas = new ArrayList<Marcas>();

	public static void dadosPadrao() {
		Marcas[] marcas = new Marcas[5];
		
		marcas[0] = new Marcas("1", "Volkswagen");
		marcas[1] = new Marcas("2", "Ford");
		marcas[2] = new Marcas("3", "Fiat");
		marcas[3] = new Marcas("4", "Chevrolet");
		marcas[4] = new Marcas("5", "Renault");

		Marcas sel = (Marcas) JOptionPane.showInputDialog(null, "Selecione a marca", "Marcas", 
				JOptionPane.INFORMATION_MESSAGE, null, marcas, marcas[3]);

		if (sel == null) {
			JOptionPane.showMessageDialog(null, "Nenhuma");
		} else {
			JOptionPane.showMessageDialog(null, sel.getDescricao());
		}	
	}

	@Override
	public boolean adicionar() {
		String codigo = Janela.lerString("Informe o código da Marca ", true);
		if (codigo.trim().length() < 2) {
			Janela.erro("Informe um código correto da Marca");			
		} else {
			Marcas objeto = new Marcas(codigo.toUpperCase(), null);
			if (marcas.contains(objeto)) {
				Janela.erro("Já contém o código " + codigo.toUpperCase());				
			} else {
				String descricao = Janela.lerString("Descrição da Marca ", true);
				objeto.setDescricao(descricao);
				marcas.add(objeto);
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
		for (int i = 0; i < (marcas).size(); i++ ) {
			msg = msg + "Código: " + marcas.get(i).getCodigo() 
					+ " Descricao: " + marcas.get(i).getDescricao()
					+ "\n";
		}		
		Janela.mensagem( msg );	
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		marcas = objeto;	
	}

	@Override
	public ArrayList gravarArquivo() {
		// TODO Auto-generated method stub
		return marcas;
	}
	
	public static Marcas buscarMarca(String descricao) {
		for (int index = 0; index < marcas.size(); index++) {
			if (marcas.get(index).getDescricao().equalsIgnoreCase(descricao)) {
				return marcas.get(index);
			}
		}
		return null;
	}

}
