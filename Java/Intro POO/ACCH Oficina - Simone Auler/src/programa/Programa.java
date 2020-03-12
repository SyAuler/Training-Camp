package programa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

import cadastros.*;
import dados.*;
import tela.*;

public class Programa {
	static CadMarcas cadMarcas = new CadMarcas();
	static CadModelos cadModelos = new CadModelos(cadMarcas);
	static CadProprietarios cadProprietarios = new CadProprietarios();
	static CadVeiculos cadVeiculos = new CadVeiculos(cadModelos, cadProprietarios);
	static CadAtendimentos cadAtendimento = new CadAtendimentos(cadVeiculos);
	static CadServicos cadServicos = new CadServicos();
	static CadMecanicos cadMecanicos = new CadMecanicos();
	static CadRealizacao cadRealizacao = new CadRealizacao();
	static CadPecas cadPecas = new CadPecas();
	static CadUtilizacao cadUtilizacao = new CadUtilizacao();

	public static void main(String[] args) {
		int op = 0;
		lerArquivo();

		do {
			op = Janela.lerInteiro("1 - Cadastros\n" + "2 - Lan�amentos\n3 - Relat�rios\n9 - Sair", false, 9);

			switch(op) {
			case 1 : cadastros(); break;
			case 2 : lancamentos(); break;
			case 3 : relatorios(); break;

			case 9 : break;
			default : Janela.erro("Op��o incorreta!");
			}			
		} while (op != 9);
		gravarArquivo();
	}

	private static void lancamentos() {
		int op = 0;
		do {
			op = Janela.lerInteiro("1 - Lan�ar Servi�o\n"
					+ "2 - Lan�ar Pe�a\n"
					+ "9 - Cancelar Lan�amento", false, 9);

			switch(op) {
			case 1 : cadastrarServico(); break;
			case 2 : cadastrarPeca(); break;

			case 9 : break;
			default : Janela.erro("Op��o incorreta!");
			}			
		} while (op != 9);
	}

	public static void cadastrarServico() {
		String placa = Janela.lerString("Informe a placa do ve�culo ", true);
		Veiculos veiculo = cadVeiculos.buscarVeiculosPorPlaca(placa);

		if (veiculo == null) {
			Janela.erro("Ve�culo com placa " + placa + " n�o localizado ou cadastrado.");	
		} else {
			Date entrada = Janela.lerData("Informe a data de entrada", true);
			if (entrada == null) {
				Janela.erro("Informar uma data v�lida.");
			} else {
				Date prometida = Janela.lerData("Informe a data de saida", true);
				if (prometida == null) {
					Janela.erro("Informar uma data v�lida.");
				} else {
					Atendimentos atendimento = new Atendimentos(veiculo);
					atendimento.setDataEntrada(entrada);
					atendimento.setDataPrometida(prometida);

					Realizacao realizacao = new Realizacao(atendimento);

					int codigo = Janela.lerInteiro("Informar o c�digo (n�merico) do Servi�o", true, 0);
					Servicos servico = cadServicos.buscarServicoPorCodigo(codigo);

					if (servico == null) {
						Janela.erro("Servi�o (c�digo n�merico) n�o encontrado ou cadastrado");
					} else {
						realizacao.setServico(servico);

						String cpf = Janela.lerString("Informar o CPF do mec�nica para a pesquisa", true);
						Mecanicos mecanico = cadMecanicos.buscarMecanicoPorCPF(cpf);

						if (mecanico == null) {
							Janela.erro("Servi�o (c�digo n�merico) n�o encontrado ou cadastrado");
						} else {
							realizacao.setMecanico(mecanico);
							cadRealizacao.add(realizacao);
						}
					}
				}
			}
		}
	}

	public static void cadastrarPeca() {
		String placa = Janela.lerString("Informe a placa do ve�culo ", true);
		Veiculos veiculo = cadVeiculos.buscarVeiculosPorPlaca(placa);

		if (veiculo == null) {
			Janela.erro("Ve�culo com placa " + placa + " n�o localizado ou cadastrado.");	
		} else {
			Date entrada = Janela.lerData("Informe a data de entrada", true);
			if (entrada == null) {
				Janela.erro("Informar uma data v�lida.");
			} else {
				Date prometida = Janela.lerData("Informe a data de saida", true);
				if (prometida == null) {
					Janela.erro("Informar uma data v�lida.");
				} else {
					Atendimentos atendimento = new Atendimentos(veiculo);
					atendimento.setDataEntrada(entrada);
					atendimento.setDataPrometida(prometida);

					Utilizacao utilizacao = new Utilizacao(atendimento);

					int codigo = Janela.lerInteiro("Informar o c�digo (n�merico) da Pe�a", true, 0);
					Pecas peca = cadPecas.buscarPecaPorCodigo(codigo);

					if (peca == null) {
						Janela.erro("Servi�o (c�digo n�merico) n�o encontrado ou cadastrado");
					} else {
						utilizacao.setPeca(peca);
						cadUtilizacao.add(utilizacao);
					}
				}
			}
		}
	}

	private static void cadastros() {
		int op = 0;
		do {
			op = Janela.lerInteiro("1 - Cadastrar Marcas\n"
					+ "2 - Cadastrar Modelos\n"
					+ "3 - Cadastrar Pe�as\n"
					+ "4 - Cadastrar Servicos\n"
					+ "5 - Cadastrar Mec�nicos\n"
					+ "6 - Cadastrar Propriet�rios\n"
					+ "7 - Cadastrar Ve�culos\n"
					+ "9 - Sair", false, 9);

			switch(op) {
			case 1 : cadMarcas.adicionar(); break;
			case 2 : cadModelos.adicionar(); break;
			case 3 : cadPecas.adicionar(); break;
			case 4 : cadServicos.adicionar(); break;
			case 5 : cadMecanicos.adicionar(); break;
			case 6 : cadProprietarios.adicionar(); break;
			case 7 : cadVeiculos.adicionar(); break;

			case 9 : break;
			default : Janela.erro("Op��o incorreta!");
			}			
		} while (op != 9);
	}

	private static void relatorios() {
		int op = 0;
		do {
			op = Janela.lerInteiro("1 - Listar Marcas\n"
					+ "2 - Listar Modelos\n"
					+ "3 - Listar Pe�as\n"
					+ "4 - Listar Servi�os\n"
					+ "5 - Listar Mec�nicos\n"
					+ "6 - Listar Propriet�rios\n"
					+ "7 - Listar Ve�culos\n"
					+ "8 - Listar Atendimentos\n"
					+ "9 - Sair", false, 9);

			switch(op) {
			case 1 : cadMarcas.listar(); break;
			case 2 : cadModelos.listar(); break;
			case 3 : cadPecas.listar(); break;
			case 4 : cadServicos.listar(); break;
			case 5 : cadMecanicos.listar(); break;
			case 6 : cadProprietarios.listar(); break;
			case 8 : {
				cadUtilizacao.listar();
				cadRealizacao.listar();
				break;
			}
			case 7 : cadVeiculos.listar(); break;

			case 9 : break;
			default : Janela.erro("Op��o incorreta!");
			}			
		} while (op != 9);		
	}


	private static void lerArquivo() {

		try {
			FileInputStream fis = new FileInputStream("c:/temp/programa4.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			cadPecas.lerArquivo((ArrayList<Pecas>) ois.readObject());
			cadMarcas.lerArquivo((ArrayList<Marcas>) ois.readObject());
			cadModelos.lerArquivo((ArrayList<Modelos>) ois.readObject());
			cadServicos.lerArquivo((ArrayList<Servicos>) ois.readObject());
			cadMecanicos.lerArquivo((ArrayList<Mecanicos>) ois.readObject());
			cadVeiculos.lerArquivo((ArrayList<Veiculos>) ois.readObject());
			cadProprietarios.lerArquivo((ArrayList<Proprietarios>) ois.readObject());
			cadUtilizacao.lerArquivo((ArrayList<Utilizacao>) ois.readObject());
			cadRealizacao.lerArquivo((ArrayList<Realizacao>) ois.readObject());
			
			ois.close();
			fis.close();
		} catch (FileNotFoundException fnf) {
			Janela.erro("Arquivo de dados nao encontrado. Cadastros vazios!");
		} catch (Exception ex) {
			Janela.erro("Falha ao ler arquivos. Verifique");
		}
	}

	private static void gravarArquivo() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/programa4.dat"); //cria o arquivo, nao as pastas
			ObjectOutputStream saida = new ObjectOutputStream(fos); // 2 - Criar um fluxo de sa�da de Objeto

			saida.writeObject(cadPecas.gravarArquivo());
			saida.writeObject(cadMarcas.gravarArquivo());
			saida.writeObject(cadModelos.gravarArquivo());
			saida.writeObject(cadServicos.gravarArquivo());
			saida.writeObject(cadMecanicos.gravarArquivo());
			saida.writeObject(cadVeiculos.gravarArquivo());
			saida.writeObject(cadProprietarios.gravarArquivo());
			saida.writeObject(cadUtilizacao.gravarArquivo());
			saida.writeObject(cadRealizacao.gravarArquivo());
			
			saida.close();
			fos.close();			
		} catch(Exception ex) {
			Janela.erro("Falha gravando arquivo: " + ex.getMessage());
		}
	}
}
