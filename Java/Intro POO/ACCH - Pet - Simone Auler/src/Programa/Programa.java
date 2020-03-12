package Programa;

import tela.*;
import cadastros.*;
import dados.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Programa {

    static CadTipoAnimal cadTipoAnimal = new CadTipoAnimal();
    static CadRaca cadRaca = new CadRaca(cadTipoAnimal);
    static CadBairro cadBairro = new CadBairro();
    static CadProprietario cadProprietario = new CadProprietario(cadBairro);
    static CadAnimal cadAnimal = new CadAnimal(cadRaca, cadProprietario);
    static CadAtendimento cadAtendimento = new CadAtendimento(cadAnimal);
    static CadVeterinario cadVeterinario = new CadVeterinario();
    static CadMedicamento cadMedicamento = new CadMedicamento();
    static CadAplicacao cadAplicacao = new CadAplicacao();
    static CadProcedimento cadProcedimento = new CadProcedimento();
    static CadRealizacao cadRealizacao = new CadRealizacao();

    public static void main(String[] args) {
        int op = 0;
        lerArquivo();

        do {
            op = Janela.lerInteiro("1 - Cadastros\n" + "2 - Lançamentos\n3 - Relatórios\n0 - Sair", false, 0);

            switch (op) {
                case 1:
                    cadastros();
                    break;
                case 2:
                    lancamentos();
                    break;
                case 3:
                    relatorios();
                    break;
                case 0:
                    break;
                default:
                    Janela.erro("Opção incorreta!");
            }
        } while (op != 0);
        gravarArquivo();
    }

    private static void lancamentos() {
        int op = 0;
        do {
            op = Janela.lerInteiro("1 - Lançar Atendimento\n"
                    + "2 - Lançar Procedimento\n"
                    + "0 - Cancelar Lançamento", false, 0);

            switch (op) {
                case 1:
                    cadastrarAtendimento();
                    break;
                case 2:
                    cadastrarProcedimento();
                    break;

                case 0:
                    break;
                default:
                    Janela.erro("Opção incorreta!");
            }
        } while (op != 0);
    }

    public static void cadastrarAtendimento() {
        String nome = Janela.lerString("Informe o nome do animal ", true);
        Animal animal = cadAnimal.buscarAnimalPorNome(nome);

        if (animal == null) {
            Janela.erro("Animal com nome " + nome + " não localizado ou cadastrado.");
        } else {
            Date entrada = Janela.lerData("Informe a data de entrada", true);
            if (entrada == null) {
                Janela.erro("Informe uma data válida.");
            } else {
                Date hrPrometida = Janela.lerData("Informe a hora prometida", true);
                if (hrPrometida == null) {
                    Janela.erro("Informar uma hora válida.");
                } else {
                    Atendimento atendimento = new Atendimento(animal);
                    atendimento.setDataEntrada(entrada);
                    atendimento.setHoraPrometida(hrPrometida);

                    Aplicacao aplicacao = new Aplicacao(atendimento);

                    int codigo = Janela.lerInteiro("Informar o código (númerico) do Medicamento", true, 0);
                    Medicamento medicamento = cadMedicamento.buscarMedicamentoPorCodigo(codigo);

                    if (medicamento == null) {
                        Janela.erro("Medicamento (código númerico) não encontrado ou cadastrado");
                    } else {
                        aplicacao.setMedicamento(medicamento);

                        String crmv = Janela.lerString("Informar o CRMV do Veterinário para a medicação", true);
                        Veterinario veterinario = cadVeterinario.buscarVeterinarioPorCrmv(crmv);

                        if (veterinario == null) {
                            Janela.erro("Veterinario (código númerico) não encontrado ou cadastrado");
                        } else {
                            aplicacao.setVeterinario(veterinario);
                            cadAplicacao.add(aplicacao);
                        }
                    }
                }
            }
        }
    }

    public static void cadastrarProcedimento() {
        String nome = Janela.lerString("Informe o nome do animal ", true);
        Animal animal = cadAnimal.buscarAnimalPorNome(nome);

        if (animal == null) {
            Janela.erro("Animal com nome " + nome + " não localizado ou cadastrado.");
        } else {
            Date entrada = Janela.lerData("Informe a data de entrada", true);
            if (entrada == null) {
                Janela.erro("Informar uma data válida.");
            } else {
                Date hrPrometida = Janela.lerData("Informe a hora prometida", true);
                if (hrPrometida == null) {
                    Janela.erro("Informar uma hora válida.");
                } else {
                    Atendimento atendimento = new Atendimento(animal);
                    atendimento.setDataEntrada(entrada);
                    atendimento.setHoraPrometida(hrPrometida);

                    Realizacao realizacao = new Realizacao(atendimento);

                    int codigo = Janela.lerInteiro("Informar o código (númerico) da Peça", true, 0);
                    Procedimento procedimento = cadProcedimento.buscarProcedimentoPorCodigo(codigo);

                    if (procedimento == null) {
                        Janela.erro("Procedimento (código númerico) não encontrado ou cadastrado");
                    } else {
                        realizacao.setProcedimento(procedimento);
                        cadRealizacao.add(realizacao);
                    }
                }
            }
        }
    }

    private static void cadastros() {
        int op = 0;
        do {
            op = Janela.lerInteiro("1 - Cadastrar Animal\n"
                    + "2 - Cadastrar Proprietário\n"
                    + "3 - Cadastrar Procedimento\n"
                    + "4 - Cadastrar Medicamento\n"
                    + "5 - Cadastrar Veterinário\n"
                    + "6 - Cadastrar Bairro\n"
                    + "7 - Cadastrar Raça\n"
                    + "8 - Cadastrar Tipo de Animal\n"
                    + "0 - Sair", false, 0);

            switch (op) {
                case 1:
                    cadAnimal.adicionar();
                    break;
                case 2:
                    cadProprietario.adicionar();
                    break;
                case 3:
                    cadProcedimento.adicionar();
                    break;
                case 4:
                    cadMedicamento.adicionar();
                    break;
                case 5:
                    cadVeterinario.adicionar();
                    break;
                case 6:
                    cadBairro.adicionar();
                    break;
                case 7:
                    cadRaca.adicionar();
                    break;
                case 8:
                    cadTipoAnimal.adicionar();
                    break;
                case 0:
                    break;
                default:
                    Janela.erro("Opção incorreta!");
            }
        } while (op != 0);
    }

    private static void relatorios() {
        int op = 0;
        do {
            op = Janela.lerInteiro("1 - Listar Animal\n"
                    + "2 - Listar Proprietário\n"
                    + "3 - Listar Procedimento\n"
                    + "4 - Listar Medicamento\n"
                    + "5 - Listar Veterinário\n"
                    + "6 - Listar Bairro\n"
                    + "7 - Listar Raça\n"
                    + "8 - Listar Tipo de Animal\n"
                    + "0 - Sair", false, 0);

            switch (op) {
                case 1:
                    cadAnimal.listar();
                    break;
                case 2:
                    cadProprietario.listar();
                    break;
                case 3:
                    cadProcedimento.listar();
                    break;
                case 4:
                    cadMedicamento.listar();
                    break;
                case 5:
                    cadVeterinario.listar();
                    break;
                case 6:
                    cadBairro.listar();
                    break;
                case 7:
                    cadRaca.listar();
                    break;
                case 8:
                    cadTipoAnimal.listar();
                    break;
                case 9: {
                    cadAplicacao.listar();
                    cadRealizacao.listar();
                    break;
                }
                case 0:
                    break;
                default:
                    Janela.erro("Opção incorreta!");
            }
        } while (op != 0);
    }

    private static void lerArquivo() {

        try {
            FileInputStream fis = new FileInputStream("c:/temp/programa4.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            cadAnimal.lerArquivo((ArrayList<Animal>) ois.readObject());
            cadProprietario.lerArquivo((ArrayList<Proprietario>) ois.readObject());
            cadProcedimento.lerArquivo((ArrayList<Procedimento>) ois.readObject());
            cadMedicamento.lerArquivo((ArrayList<Medicamento>) ois.readObject());
            cadVeterinario.lerArquivo((ArrayList<Veterinario>) ois.readObject());
            cadBairro.lerArquivo((ArrayList<Bairro>) ois.readObject());
            cadRaca.lerArquivo((ArrayList<Raca>) ois.readObject());
            cadTipoAnimal.lerArquivo((ArrayList<TipoAnimal>) ois.readObject());
            cadAplicacao.lerArquivo((ArrayList<Aplicacao>) ois.readObject());
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
            ObjectOutputStream saida = new ObjectOutputStream(fos); // 2 - Criar um fluxo de saída de Objeto

            saida.writeObject(cadAnimal.gravarArquivo());
            saida.writeObject(cadProprietario.gravarArquivo());
            saida.writeObject(cadProcedimento.gravarArquivo());
            saida.writeObject(cadMedicamento.gravarArquivo());
            saida.writeObject(cadVeterinario.gravarArquivo());
            saida.writeObject(cadBairro.gravarArquivo());
            saida.writeObject(cadRaca.gravarArquivo());
            saida.writeObject(cadTipoAnimal.gravarArquivo());
            saida.writeObject(cadAplicacao.gravarArquivo());
            saida.writeObject(cadRealizacao.gravarArquivo());

            saida.close();
            fos.close();
        } catch (Exception ex) {
            Janela.erro("Falha gravando arquivo: " + ex.getMessage());
        }
    }
}
