package cadastros;

import dados.Raca;
import dados.TipoAnimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tela.Janela;

public class CadRaca implements Cadastro {

    static ArrayList<Raca> raca = new ArrayList<Raca>();
    private CadTipoAnimal cadTipoAnimal;

    public CadRaca(CadTipoAnimal cadTipoAnimal) {
        this.cadTipoAnimal = cadTipoAnimal;
    }

    public static void dadosPadrao() {
        Raca[] raca = new Raca[5];

        raca[0] = new Raca(1, "Vira Lata");
        raca[1] = new Raca(2, "Boxer");
        raca[2] = new Raca(3, "Lhasa");
        raca[3] = new Raca(4, "Spitz alemão");

        Raca sel = (Raca) JOptionPane.showInputDialog(null, "Selecione a raça", "Raça",
                JOptionPane.INFORMATION_MESSAGE, null, raca, raca[1]);

        if (sel == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma");
        } else {
            JOptionPane.showMessageDialog(null, sel.getDescricao());
        }
    }

    @Override
    public boolean adicionar() {
        String descricao = Janela.lerString("Informe o Tipo de Animal. Ex: cachorro", true);
        TipoAnimal tipoAnimal = cadTipoAnimal.buscarTipoAnimal(descricao);

        if (tipoAnimal == null) {
            Janela.erro("O tipo de animal não foi localizada");
        } else {
            Raca objeto = new Raca(tipoAnimal);

            int codigo = Janela.lerInteiro("Informe o código da raça ", true, 0);
            if (codigo < 1) {
                Janela.erro("Informe um código correto da raça");
            } else {
                objeto.setCodigo(codigo);

                if (raca.contains(objeto)) {
                    Janela.erro("Já contém o código " + codigo);
                } else {
                    objeto.setDescricao(descricao);
                    raca.add(objeto);
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
        for (int i = 0; i < (raca).size(); i++) {
            msg = msg + "Código: " + raca.get(i).getCodigo()
                    + " Descricao: " + raca.get(i).getDescricao()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

    @Override
    public void lerArquivo(ArrayList objeto) {
        raca = objeto;
    }

    @Override
    public ArrayList gravarArquivo() {
        return raca;
    }

    public static Raca buscarRaca(String descricao) {
        for (int index = 0; index < raca.size(); index++) {
            if (raca.get(index).getDescricao().equalsIgnoreCase(descricao)) {
                return raca.get(index);
            }
        }
        return null;
    }
}
