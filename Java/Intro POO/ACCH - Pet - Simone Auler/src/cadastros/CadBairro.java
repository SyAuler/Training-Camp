
package cadastros;

import dados.Bairro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tela.Janela;

public class CadBairro implements Cadastro {

    static ArrayList<Bairro> bairro = new ArrayList<Bairro>();

    public static void dadosPadrao() {
        Bairro[] bairro = new Bairro[5];

        bairro[0] = new Bairro("1", 11);
        bairro[1] = new Bairro("2", 10);
        bairro[2] = new Bairro("3", 9);
        bairro[3] = new Bairro("4", 8);

        Bairro sel = (Bairro) JOptionPane.showInputDialog(null, "Selecione o bairro", "Bairro",
                JOptionPane.INFORMATION_MESSAGE, null, bairro, bairro[3]);

        if (sel == null) {
            JOptionPane.showMessageDialog(null, "Nenhum");
        } else {
            JOptionPane.showMessageDialog(null, sel.getNome());
        }
    }

    @Override
    public boolean adicionar() {
        String nome = Janela.lerString("Informe o nome do bairro ", true);
               
        if (nome.trim().length() < 2) {
            Janela.erro("Informe um nome correto do bairro");
        } else {
            Bairro objeto = new Bairro(nome.toUpperCase(), 0);
            if (bairro.contains(objeto)) {
                Janela.erro("Já contém o nome do bairro " + nome.toUpperCase());
            } else {
                double txTrans = Janela.lerDouble("Taxa de transporte do animal ", true, 0);
                objeto.setTxTrans(txTrans);
                bairro.add(objeto);
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
        for (int i = 0; i < (bairro).size(); i++) {
            msg = msg + "Nome do bairro: " + bairro.get(i).getNome()
                    + " Taxa de transporte: " + bairro.get(i).getTxTrans()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

    @Override
    public void lerArquivo(ArrayList objeto) {
        bairro = objeto;
    }

    @Override
    public ArrayList gravarArquivo() {
        // TODO Auto-generated method stub
        return bairro;
    }

    public static Bairro buscarBairro(String nome) {
        for (int index = 0; index < bairro.size(); index++) {
            if (bairro.get(index).getNome().equalsIgnoreCase(nome)) {
                return bairro.get(index);
            }            
        }
        return null;
    }
}
