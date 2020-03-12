package cadastros;

import dados.Animal;
import dados.Proprietario;
import dados.Raca;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import tela.Janela;

public class CadAnimal implements Cadastro {

    static ArrayList<Animal> animal = new ArrayList<Animal>();
    private CadRaca cadRaca;
    private CadProprietario cadProprietario;

    public CadAnimal(CadRaca cadRaca, CadProprietario cadProprietario) {
        this.cadRaca = cadRaca;
        this.cadProprietario = cadProprietario;
    }

    public static void dadosPadrao() {
        Animal[] animal = new Animal[5];

        animal[0] = new Animal("Batata", "cao", "macho", "23/11/2015");
        animal[1] = new Animal("Thor", "reptil", "macho", "09/08/2013");
        animal[2] = new Animal("Amora", "cao", "femea", "15/01/2014");
        animal[3] = new Animal("Batutinha", "passaro", "macho", "06/03/2015");

        Animal sel = (Animal) JOptionPane.showInputDialog(null, "Selecione a raça", "Animal",
                JOptionPane.INFORMATION_MESSAGE, null, animal, animal[0]);

        if (sel == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma");
        } else {
            JOptionPane.showMessageDialog(null, sel.getCaracteristica());
        }
    }

    @Override
    public boolean adicionar() {
        String cpf = Janela.lerString("Informe o CPF do Proprietário", true);
        Proprietario proprietario = cadProprietario.buscarProprietarioPorCPF(cpf);

        if (proprietario == null) {
            Janela.erro("O proprietário não foi localizado pelo CPF " + cpf);
        } else if (!cpf.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
            Janela.erro("Informe um cpf válido" + cpf);
        } else {
            proprietario.setCpf(cpf);
            if (animal.contains(cpf)) {
                Janela.erro("CPF já cadastrado" + cpf);

            } else {
                String descricao = Janela.lerString("Informe a raca do animal", true);
                Raca raca = cadRaca.buscarRaca(descricao);

                if (raca == null) {
                    Janela.erro("A raça não foi localizada");
                } else {
                    Animal objeto = new Animal(proprietario);
                    String nome = Janela.lerString("Informe o nome do animal ", true).toUpperCase();
                    if (nome == null) {
                        Janela.erro("Informe um nome válido");
                    } else {
                        String caract = Janela.lerString("Informe as características do animal", true);
                        if (caract == null) {
                            Janela.erro("Informe características válidas");
                        } else {
                            Date dataNasc = Janela.lerData("Informe a data de nascimento do animal. Ex: 01/01/2000", true);
                            if (dataNasc == null) {
                                Janela.erro("Informe uma data de nascimento válida");
                            } else {
                                String sexo = Janela.lerString("Informe o sexo do animal", true);
                                if (sexo == null) {
                                    Janela.erro("Informe um sexo válido");
                                } else {
                                    objeto.setNome(nome);
                                    animal.add(objeto);
                                }
                            }
                        }
                    }
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
        for (int i = 0; i < animal.size(); i++) {
            msg = msg + "Nome: " + animal.get(i).getNome()
                    + " Característica: " + animal.get(i).getCaracteristica()
                    + " Nascimento: " + animal.get(i).getNasc()
                    + " Sexo: " + animal.get(i).getSexo()
                    + " Raça: " + animal.get(i).getRaca().getDescricao()
                    + " Tipo de Animal: " + animal.get(i).getRaca().getTipoAnimal().getDescricao()
                    + " Proprietário " + animal.get(i).getProprietario().getNome()
                    + " Telefone " + animal.get(i).getProprietario().getTelefone()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

    @Override
    public void lerArquivo(ArrayList objeto) {
        animal = objeto;
    }

    @Override
    public ArrayList gravarArquivo() {
        return animal;
    }

    public static Animal buscarAnimalPorNome(String nome) {
        for (int index = 0; index < animal.size(); index++) {
            if (animal.get(index).getNome().equalsIgnoreCase(nome)) {
                return animal.get(index);
            }
        }
        return null;
    }
}
