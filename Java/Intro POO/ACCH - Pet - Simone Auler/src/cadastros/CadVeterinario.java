package cadastros;

import dados.Veterinario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tela.Janela;

public class CadVeterinario implements Cadastro {

    static ArrayList<Veterinario> vet = new ArrayList<Veterinario>();

    public static void dadosPadrao() {
        Veterinario[] vet = new Veterinario[2];

        vet[0] = new Veterinario("123456", "Fulano", "45 99999-9999");
        vet[1] = new Veterinario("654987", "Ciclano", "45 99999-8888");
        vet[2] = new Veterinario("321789", "Pafuncio", "45 99999-7777");

        Veterinario sel = (Veterinario) JOptionPane.showInputDialog(null, "Selecione o veterinário", "Veterinário",
                JOptionPane.INFORMATION_MESSAGE, null, vet, vet[1]);

        if (sel == null) {
            JOptionPane.showMessageDialog(null, "Nenhum");
        } else {
            JOptionPane.showMessageDialog(null, sel.getNome());
        }
    }

    @Override
    public boolean adicionar() {
        String crmv = Janela.lerString("Informe o CRMV do Veterinário ", true);
        if (crmv.trim().length() < 2) {
            Janela.erro("Informe um CRMV válido");
        } else {
            Veterinario objeto = new Veterinario(crmv.toUpperCase(), null, crmv);
            if (vet.contains(objeto)) {
                Janela.erro("Já contém o CRMV " + crmv);
            } else {
                objeto.setCrmv(crmv);

                String nome = Janela.lerString("Nome do Veterinário ", true);
                if (nome.length() < 3) {
                    Janela.erro("Informar o nome correto do Veterinário");
                } else {
                    objeto.setNome(nome);
                    vet.add(objeto);
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
        for (int i = 0; i < vet.size(); i++) {
            msg = msg + "CRMV: " + vet.get(i).getCrmv()
                    + "Nome do Veterinário: " + vet.get(i).getNome()
                    + "Telefone: " + vet.get(i).getTelefone()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

    @Override
    public void lerArquivo(ArrayList objeto) {
        vet = objeto;
    }

    @Override
    public ArrayList gravarArquivo() {
        return vet;
    }

    public static Veterinario buscarVeterinarioPorCrmv(String crmv) {
        for (int index = 0; index < vet.size(); index++) {
            if (vet.get(index).getCrmv().equalsIgnoreCase(crmv)) {
                return vet.get(index);
            }
        }
        return null;
    }
}
