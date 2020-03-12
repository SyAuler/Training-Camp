package cadastros;

import dados.TipoAnimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tela.Janela;

public class CadTipoAnimal implements Cadastro {

    static ArrayList<TipoAnimal> tipoAnimal = new ArrayList<TipoAnimal>();

    public static void dadosPadrao() {
        TipoAnimal[] tipoAnimal = new TipoAnimal[5];

        tipoAnimal[0] = new TipoAnimal("1", "Cachorro");
        tipoAnimal[1] = new TipoAnimal("2", "Gato");
        tipoAnimal[2] = new TipoAnimal("3", "Pássaro");
        tipoAnimal[3] = new TipoAnimal("4", "Réptil");

        TipoAnimal sel = (TipoAnimal) JOptionPane.showInputDialog(null, "Selecione o tipo de animal", "Tipo de Animal",
                JOptionPane.INFORMATION_MESSAGE, null, tipoAnimal, tipoAnimal[3]);

        if (sel == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma");
        } else {
            JOptionPane.showMessageDialog(null, sel.getDescricao());
        }
    }

    @Override
    public boolean adicionar() {
        String codigo = Janela.lerString("Informe o código do tipo de animal ", true);
        if (codigo.trim().length() < 1) {
            Janela.erro("Informe um código correto do tipo de animal");
        } else {
            TipoAnimal objeto = new TipoAnimal(codigo.toUpperCase(), null);
            if (tipoAnimal.contains(objeto)) {
                Janela.erro("Já contém o código " + codigo.toUpperCase());
            } else {
                String descricao = Janela.lerString("Descrição do tipo de animal ", true);
                objeto.setDescricao(descricao);
                tipoAnimal.add(objeto);
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
        for (int i = 0; i < (tipoAnimal).size(); i++) {
            msg = msg + "Código: " + tipoAnimal.get(i).getCodigo()
                    + " Descricao: " + tipoAnimal.get(i).getDescricao()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

    @Override
    public void lerArquivo(ArrayList objeto) {
        tipoAnimal = objeto;
    }

    @Override
    public ArrayList gravarArquivo() {
        // TODO Auto-generated method stub
        return tipoAnimal;
    }

    public static TipoAnimal buscarTipoAnimal(String descricao) {
        for (int index = 0; index < tipoAnimal.size(); index++) {
            if (tipoAnimal.get(index).getDescricao().equalsIgnoreCase(descricao)) {
                return tipoAnimal.get(index);
            }
        }
        return null;
    }
}
