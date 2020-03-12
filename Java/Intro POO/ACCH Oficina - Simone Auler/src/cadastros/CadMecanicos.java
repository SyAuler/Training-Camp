package cadastros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.*;
import tela.*;

public class CadMecanicos implements Cadastro {

	static ArrayList<Mecanicos> mecanicos = new ArrayList<Mecanicos>();

	public static void dadosPadrao() {
		Mecanicos[] mecanicos = new Mecanicos[2];

		mecanicos[0] = new Mecanicos("Pafuncio", "101.102.103-00", "45 9999-9999", 10, 1000);
		mecanicos[1] = new Mecanicos("Ford", null, null, 0, 0);

		Mecanicos sel = (Mecanicos) JOptionPane.showInputDialog(null, "Selecione a marca", "Marcas", 
				JOptionPane.INFORMATION_MESSAGE, null, mecanicos, mecanicos[1]);

		if (sel == null) {
			JOptionPane.showMessageDialog(null, "Nenhuma");
		} else {
			JOptionPane.showMessageDialog(null, sel.getNome());
		}	
	}

	@Override
	public boolean adicionar() {
		String cpf = Janela.lerString("Informe o CPF do Mecanico ", true);
		if (cpf.trim().length() < 2) {
			Janela.erro("Informe um CPF válido");			
		} else {
			Mecanicos objeto = new Mecanicos(cpf.toUpperCase(), null, cpf, 0, 0);
			if (mecanicos.contains(objeto)) {
				Janela.erro("Já contém o CPF " + cpf);				
			} else {
				objeto.setCpf(cpf);

				String nome = Janela.lerString("Nome do Mecanico ", true);
				if (nome.length() < 3) {
					Janela.erro("Informar o nome correto do mecânico");
				} else {
					objeto.setNome(nome);
					mecanicos.add(objeto);
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
		for (int i = 0; i < mecanicos.size(); i++ ) {
			msg = msg + " Descricao: " + mecanicos.get(i).getNome() 
					+ "CPF: " + mecanicos.get(i).getCpf() 
					+ "\n";
		}		
		Janela.mensagem( msg );
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		mecanicos = objeto;	
	}

	@Override
	public ArrayList gravarArquivo() {
		return mecanicos;
	}

	public static Mecanicos buscarMecanicoPorCPF(String cpf) {
		for (int index = 0; index < mecanicos.size(); index++) {
			if (mecanicos.get(index).getCpf().equalsIgnoreCase(cpf)) {
				return mecanicos.get(index);
			}
		}
		return null;
	}
}
