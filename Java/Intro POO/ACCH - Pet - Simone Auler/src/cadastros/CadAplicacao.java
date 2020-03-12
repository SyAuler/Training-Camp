package cadastros;

import dados.Aplicacao;
import java.util.ArrayList;
import tela.Janela;

public class CadAplicacao {

    static ArrayList<Aplicacao> aplic = new ArrayList<Aplicacao>();

    public void add(Aplicacao aplicacao) {
        aplic.add(aplicacao);
    }

    public ArrayList gravarArquivo() {
        return aplic;
    }

    public void lerArquivo(ArrayList objeto) {
        aplic = objeto;
    }

    public void listar() {
        String msg = "";
        for (int i = 0; i < (aplic).size(); i++) {
            msg = msg + "Nome do animal: " + aplic.get(i).getAtendimento().getAnimal().getNome()
                    + " Proprietário" + aplic.get(i).getAtendimento().getAnimal().getProprietario().getNome()
                    + " Medicamento: " + aplic.get(i).getMedicamento().getDescricao()
                    + " Veterinário: " + aplic.get(i).getVeterinario().getNome()
                    + "\n";
        }
        Janela.mensagem(msg);
    }
}
