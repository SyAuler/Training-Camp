package cadastros;

import dados.Procedimento;
import java.util.ArrayList;
import tela.Janela;

public class CadProcedimento implements Cadastro {

    static ArrayList<Procedimento> procedmt = new ArrayList<Procedimento>();

    @Override
    public boolean adicionar() {
        int codigo = Janela.lerInteiro("Informe o código do Procedimento ", true, 0);

        if (codigo < 0) { // código
            Janela.erro("Informe um código correto do Procedimento");
        } else {
            Procedimento objeto = new Procedimento(codigo, null, 0);

            if (procedmt.contains(objeto)) {
                Janela.erro("Já contém o código " + codigo);

            } else { // descrição
                String descricao = Janela.lerString("Descrição do Procedimento ", true);

                if (descricao.trim().length() < 2) {
                    Janela.erro("Informe uma descrição válida " + codigo);
                } else {
                    objeto.setDescricao(descricao);

                    double valor = Janela.lerDouble("Valor do Procedimento ", true, 0);

                    if (!(valor > 0)) {
                        Janela.erro("Informe o valor do Procedimento " + codigo);
                    } else {
                        objeto.setValor(valor);
                        procedmt.add(objeto);
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
        for (int i = 0; i < (procedmt).size(); i++) {
            msg = msg + "Código: " + procedmt.get(i).getCodigo()
                    + " Descricao: " + procedmt.get(i).getDescricao()
                    + " Valor: " + procedmt.get(i).getValor()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

    @Override
    public void lerArquivo(ArrayList objeto) {
        procedmt = objeto;
    }

    @Override
    public ArrayList gravarArquivo() {
        return procedmt; // TODO Auto-generated method stub
    }

    public static Procedimento buscarProcedimentoPorCodigo(int codigo) {
        for (int index = 0; index < procedmt.size(); index++) {
            if (procedmt.get(index).getCodigo() == codigo) {
                return procedmt.get(index);
            }
        }
        return null;
    }
}
