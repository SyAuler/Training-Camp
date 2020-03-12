package cadastros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.*;
import tela.*;

public class CadVeiculos implements Cadastro {

	static ArrayList<Veiculos> veiculos = new ArrayList<Veiculos>();
	private CadModelos cadModelos;
	private CadProprietarios cadProprietarios;

	public CadVeiculos(CadModelos cadModelos, CadProprietarios cadProprietarios) {
		this.cadModelos = cadModelos;
		this.cadProprietarios = cadProprietarios;
	}

	public static void dadosPadrao() {
		Veiculos[] veiculos = new Veiculos[5];

		veiculos[0] = new Veiculos("LKJ-4568", 2010, "Focus");
		veiculos[1] = new Veiculos("2", 0, "Ford");

		Veiculos sel = (Veiculos) JOptionPane.showInputDialog(null, "Selecione o veiculo", "Veiculos", 
				JOptionPane.INFORMATION_MESSAGE, null, veiculos, veiculos[0]);

		if (sel == null) {
			JOptionPane.showMessageDialog(null, "Nenhuma");
		} else {
			JOptionPane.showMessageDialog(null, sel.getPlaca());
		}	
	}

	@Override
	public boolean adicionar() {
		String descricao = Janela.lerString("Informe o Modelo", true);

		Modelos modelo = cadModelos.buscarModelo(descricao);

		if (modelo == null) {
			Janela.erro("O modelo não foi localizado");
		} else {
			String cpf = Janela.lerString("Informe o CPF Proprietario", true);
			Proprietarios proprietario = cadProprietarios.buscarProprietarioPorCPF(cpf);

			if (proprietario == null) {
				Janela.erro("O proprietário não foi localizado pelo CPF " + cpf);
			} else {
				Veiculos objeto = new Veiculos(modelo, proprietario);
				
				String placa = Janela.lerString("Informe a Placa ", true).toUpperCase();

				// código
				if (placa == null || ! placa.matches("[A-Z]{3}-[0-9]{4}")) {
					Janela.erro("Já contém essa placa " + placa);		
				} else {
					objeto.setPlaca(placa);

					if (veiculos.contains(objeto)) {
						Janela.erro("Já contém a placa" + placa);

					} else { // ano
						int ano = Janela.lerInteiro("Ano do veículo ", false, 0);

						if (ano < 4 ) { 
							Janela.erro("Informe uma descrição válida " + ano);
						} else {
							objeto.setAno(ano);
							// observação
							String obs = Janela.lerString("Observacao", true);
							objeto.setObservacao(obs);
							veiculos.add(objeto);
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
		for (int i = 0; i < veiculos.size(); i++ ) {
			msg = msg + "Placa: " + veiculos.get(i).getPlaca() 
					+ " Ano: " + veiculos.get(i).getAno() 
					+ " Modelo: " + veiculos.get(i).getModelo().getDescricao()
					+ " Marca: " + veiculos.get(i).getModelo().getMarca().getDescricao()
					+ " Proprietário " + veiculos.get(i).getProprietario().getNome()
					+ " OBS: " + veiculos.get(i).getObservacao()
					+ "\n";
		}		
		Janela.mensagem( msg );
	}

	@Override
	public void lerArquivo(ArrayList objeto) {
		veiculos = objeto;	
	}

	@Override
	public ArrayList gravarArquivo() {
		// TODO Auto-generated method stub
		return veiculos;
	}
	
	public static Veiculos buscarVeiculosPorPlaca(String placa) {
		for (int index = 0; index < veiculos.size(); index++) {
			if (veiculos.get(index).getPlaca().equalsIgnoreCase(placa)) {
				return veiculos.get(index);
			}
		}
		return null;
	}

}
