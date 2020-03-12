package cadastros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.*;
import tela.*;

public class CadProprietarios implements Cadastro {

	static ArrayList<Proprietarios> proprietario = new ArrayList<Proprietarios>();

	public static void dadosPadrao() {
		Proprietarios[] proprietario = new Proprietarios[2];

		proprietario[0] = new Proprietarios("Fulano", "01245667900", "45999886655", "Rua A, 2000");
		proprietario[1] = new Proprietarios("Ciclano", null, null, null);

		Proprietarios sel = (Proprietarios) JOptionPane.showInputDialog(null, "Selecione o proprietário", "Proprietário", 
				JOptionPane.INFORMATION_MESSAGE, null, proprietario, proprietario[0]);

		if (sel == null) {
			JOptionPane.showMessageDialog(null, "Nenhuma");
		} else {
			JOptionPane.showMessageDialog(null, sel.getNome());
		}	
	}

	@Override
	public boolean adicionar() { // nome, cpf, telefone, endereco
		String nome = Janela.lerString("Informe o nome do proprietário ", true);

		if (nome.length() < 2) { // nome
			Janela.erro("Informe um nome correto");			
		} else {
			Proprietarios objeto = new Proprietarios(nome, null, null, null);

			if (proprietario.contains(objeto)) {
				Janela.erro("Já contém o nome " + nome);

			} else { // cpf
				String cpf = Janela.lerString("Informe o CPF do proprietário ", true);

				if (cpf.trim().length() < 11 ) { 
					Janela.erro("Informe um CPF válido " + cpf);
				} else {
					objeto.setCpf(cpf);

					// telefone
					String telefone = Janela.lerString("Telefone do proprietário ", true);

					if (telefone.length() < 9) {
						Janela.erro("Informe o telefone válido " + telefone);	
					} else {
						objeto.setTelefone(telefone);
							// endereço
						String endereco = Janela.lerString("Endereço do proprietário ", true);

						if (endereco.length() < 3) {
							Janela.erro("Informe um endereço válido " + endereco);	
						} else {
							objeto.setEndereco(endereco);
							proprietario.add(objeto);
						}
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
		for (int i = 0; i < (proprietario).size(); i++ ) {
			msg = msg + "Nome: " + proprietario.get(i).getNome() 
					+ " CPF: " + proprietario.get(i).getCpf() 
					+ " Telefone: " + proprietario.get(i).getTelefone()
					+ "\n";
		}
		Janela.mensagem( msg );
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		proprietario = objeto;	
	}

	@Override
	public ArrayList gravarArquivo() {
		// TODO Auto-generated method stub
		return proprietario;
	}
	
	public static Proprietarios buscarProprietarioPorCPF(String cpf) {
		for (int index = 0; index < proprietario.size(); index++) {
			if (proprietario.get(index).getCpf().equalsIgnoreCase(cpf)) {
				return proprietario.get(index);
			}
		}
		return null;
	}

}
