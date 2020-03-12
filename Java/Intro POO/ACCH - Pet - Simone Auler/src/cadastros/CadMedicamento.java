package cadastros;

import dados.Medicamento;
import java.util.ArrayList;
import tela.Janela;

public class CadMedicamento implements Cadastro {

    static ArrayList<Medicamento> medicamt = new ArrayList<Medicamento>();

    @Override
    public boolean adicionar() {
        int codigo = Janela.lerInteiro("Informe o código do Medicamento ", true, 0);
        if (codigo < 0) {
            Janela.erro("Informe um código correto do Medicamento");
        } else {
            Medicamento objeto = new Medicamento(codigo, null);
            if (medicamt.contains(objeto)) {
                Janela.erro("Já contém o medicamento " + codigo);
            } else {
                String descricao = Janela.lerString("Descrição do Medicamento ", true);
                objeto.setDescricao(descricao);
                medicamt.add(objeto);
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
        for (int i = 0; i < (medicamt).size(); i++) {
            msg = msg + "Código: " + medicamt.get(i).getCodigo()
                    + " Descricao: " + medicamt.get(i).getDescricao()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

    @Override
    public ArrayList gravarArquivo() {
        // TODO Auto-generated method stub
        return medicamt;
    }

    @Override
    public void lerArquivo(ArrayList objeto) {
        // TODO Auto-generated method stub
        medicamt = objeto;
    }

    public static Medicamento buscarMedicamentoPorCodigo(int codigo) {
        for (int index = 0; index < medicamt.size(); index++) {
            if (medicamt.get(index).getCodigo() == codigo) {
                return medicamt.get(index);
            }
        }
        return null;
    }
}
