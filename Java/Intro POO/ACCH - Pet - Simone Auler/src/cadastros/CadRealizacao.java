package cadastros;

import dados.Realizacao;
import java.util.ArrayList;
import tela.Janela;

public class CadRealizacao {

    static ArrayList<Realizacao> realiza = new ArrayList<Realizacao>();

    public void add(Realizacao realizacao) {
        realiza.add(realizacao);
    }

    public ArrayList gravarArquivo() {
        return realiza;
    }

    public void lerArquivo(ArrayList objeto) {
        realiza = objeto;
    }

    public void listar() {
        String msg = "";
        for (int i = 0; i < (realiza).size(); i++) {
            msg = msg + "Nome do animal: " + realiza.get(i).getAtendimento().getAnimal().getNome()
                    + " Procedimento: " + realiza.get(i).getProcedimento().getDescricao()
                    + " Quantidade: " + realiza.get(i).getQtde()
                    + " Valor: " + realiza.get(i).getValor()
                    + " Proprietario: " + realiza.get(i).getAtendimento().getAnimal().getProprietario().getNome()
                    + "\n";
        }
        Janela.mensagem(msg);
    }

}
