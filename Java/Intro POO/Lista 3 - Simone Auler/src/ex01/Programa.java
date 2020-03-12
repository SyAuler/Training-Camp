package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import tela.*;

public class Programa {

    static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Locacao> locacao = new ArrayList<Locacao>();

    public static void main(String[] args) {
        int op = 0;
        lerArquivo();

        do {
            op = Janela.lerInteiro("1 - Cadastrar Veículo"
                    + "\n2 - Cadastrar Cliente"
                    + "\n3 - Lançar Locação"
                    + "\n4 - Lançar Devolução"
                    + "\n5 - Relatório de Cadastros"
                    + "\n6 - Relatório Locação"
                    + "\n0 - Sair", false, 0);

            switch (op) {
                case 1:
                    cadastroVeiculos();
                    break;
                case 2:
                    cadastroCliente();
                    break;
                case 3:
                    locacao();
                    break;
                case 4:
                    devolucao();
                    break;
                case 5:
                    mostrarCadastros();
                    break;
                case 6:
                    mostrarLocacoes();
                    break;
                case 0:
                    break;
                default:
                    Janela.erro("Opção incorreta!");
            }
        } while (op != 0);
        gravarArquivo();
    }

    public static void mostrarCadastros() {
        String msg = "";

        if (veiculos.size() > 0) {
            msg = "Relatório de veículos\n";
            for (int i = 0; i < veiculos.size(); i++) {
                msg = msg + "Placa: " + veiculos.get(i).getPlaca()
                        + " Modelo: " + veiculos.get(i).getModelo()
                        + "\n";
            }
            Janela.info(msg);
        } else {
            Janela.info("Não existem Veículos cadastrados");
        }

        if (clientes.size() > 0) {
            msg = "Relatório de clientes\n";
            for (int i = 0; i < clientes.size(); i++) {
                msg = msg + "Nome do Cliente: " + clientes.get(i).getNome()
                        + " Telefone: " + clientes.get(i).getTelefone()
                        + "\n";
            }
            Janela.info(msg);
        } else {
            Janela.info("Não existem Clientes cadastrados");
        }
    }

    public static void mostrarLocacoes() {
        String msg = "";

        if (clientes.size() > 0) {
            msg = "Relatório de locações\n";
            for (int i = 0; i < locacao.size(); i++) {
                if (locacao.get(i).getDevolucao() == null) {
                    msg = msg + "Locação aberta "
                            + " Placa: " + locacao.get(i).getVeiculo().getPlaca()
                            + " Cliente: " + locacao.get(i).getCliente().getNome() + "\n";
                } else {
                    msg = msg + "Locação fechada "
                            + " Placa: " + locacao.get(i).getVeiculo().getPlaca()
                            + " Cliente: " + locacao.get(i).getCliente().getNome() + "\n";
                }
            }
            Janela.info(msg);
        } else {
            Janela.info("Não existem Locações cadastradas");
        }
    }

    public static void cadastroCliente() { //nome, telefone
        String nome = Janela.lerString("Informe o nome do cliente ", true).toUpperCase();

        // nome
        if (nome.length() < 2) {
            Janela.erro("Informe um nome válido" + nome);
        } else {
            Cliente objeto = new Cliente(nome);

            if (clientes.contains(objeto)) {
                Janela.erro("Já contém esse nome" + nome);

            } else {
                // telefone
                String fone = Janela.lerString("Informe o telefone ", true);

                if (fone.length() < 2) {
                    Janela.erro("Informe um telefone válido " + fone);
                } else {
                    objeto.setTelefone(fone);
                    clientes.add(objeto);
                }
            }
        }
    }

    public static void cadastroVeiculos() { //placa, descrição, km, valorkm

        String placa = Janela.lerString("Informe a placa do veículo (FFF-0000) ", true).toUpperCase();

        // placa
        if (placa == null || !placa.matches("[A-Z]{3}-[0-9]{4}")) {
            Janela.erro("Informe uma placa válida FFF-0000 " + placa);
        } else {
            Veiculo objeto = new Veiculo(placa, "ford");

            if (veiculos.contains(objeto)) {
                Janela.erro("Já há um cadastro com essa placa" + placa);

            } else {
                // modelo
                String model = Janela.lerString("Informe o modelo do veículo ", true);

                if (model.length() < 2) {
                    Janela.erro("Informe um nome válido " + model);
                } else {
                    objeto.setModelo(model);
                    veiculos.add(objeto);
                }
            }
        }
    }

    public static Veiculo buscaVeiculoPorPlaca(String placa) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                return veiculos.get(i);
            }
        }
        return null;
    }

    public static void locacao() { // retirada, devoluçao

        String placa = Janela.lerString("Informe a placa do veículo ", true).toUpperCase();

        Veiculo veiculo = buscaVeiculoPorPlaca(placa);
        if (veiculo == null) {
            Janela.erro("Veículo não localizado pela placa " + placa + ", favor cadastrar o veiculo primeiro");
        } else {
            //verifica se não está locado
            Locacao objeto = new Locacao(veiculo);
            if (buscaLocacaoAberta(placa) != null) {
                Janela.erro("Veículo se encontra locado, com placa " + veiculo.getPlaca());
            } else {

                // cliente				
                String nome = Janela.lerString("Informe o nome do cliente ", true).toUpperCase();

                Cliente cliente = buscaClienteNome(nome);
                if (cliente == null) {
                    Janela.erro("Cliente não localizado " + cliente + ", favor cadastrar o cliente primeiro");
                } else {
                    objeto.setCliente(cliente);

                    if (buscaLocacaoAberta(placa) != null) {
                        Janela.erro("Veículo se encontra locado, com placa " + veiculo.getPlaca());
                    } else {

                        // data retirada
                        Date ret = Janela.lerData("Informe a data de retirada ", true);

                        if (ret == null) {
                            Janela.erro("Informe uma data válida " + ret);
                        } else {
                            objeto.setRetirada(ret);
                            locacao.add(objeto);
                        }
                    }
                }
            }
        }
    }

    public static Cliente buscaClienteNome(String nome) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                return clientes.get(i);
            }
        }
        return null;
    }

    public static Locacao buscaLocacaoAberta(String placa) {
        for (int i = 0; i < locacao.size(); i++) {
            if (locacao.get(i).getVeiculo().getPlaca().equalsIgnoreCase(placa)) {

                //locação com status aberto
                if (locacao.get(i).getDevolucao() == null) {
                    return locacao.get(i);
                }
            }
        }
        return null;
    }

    public static void devolucao() {
        String placa = Janela.lerString("Informe a placa do veículo", true);

        Locacao objeto = buscaLocacaoAberta(placa);

        if (objeto == null) {
            Janela.erro("Não foi localizado o veículo na locação " + placa);
        } else {
            // data final
            Date fim = Janela.lerData("Informe a data de devolução ", true);

            if (fim == null) {
                Janela.erro("Informe uma data válida " + fim);
            } else {
                objeto.setDevolucao(fim);

            }
        }
    }

    private static void lerArquivo() {
        try {
            FileInputStream fis = new FileInputStream("c:/temp/locadora.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            veiculos = (ArrayList<Veiculo>) ois.readObject();
            clientes = (ArrayList<Cliente>) ois.readObject();
            locacao = (ArrayList<Locacao>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException fnf) {
            Janela.erro("Arquivo de dados não encontrado. Cadastros vazios!");
        } catch (Exception ex) {
            Janela.erro("Falha ao ler arquivos. Verifique");
        }
    }

    private static void gravarArquivo() {
        // 1 - criar um fluxo de saída para arquivo
        try {
            FileOutputStream fos = new FileOutputStream("c:/temp/locadora.dat"); //cria o arquivo, nao as pastas
            // 2 - Criar um fluxo de saída de Objeto
            ObjectOutputStream saida = new ObjectOutputStream(fos);
            saida.writeObject(veiculos);
            saida.writeObject(clientes);
            saida.writeObject(locacao);
            saida.close();
            fos.close();

        } catch (Exception ex) {
            Janela.erro("Falha ao gravar o arquivo: " + ex.getMessage());
        }
    }
}
