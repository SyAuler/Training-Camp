package cadastros;

import dados.Atendimento;
import java.util.ArrayList;

public class CadAtendimento {

    static ArrayList<Atendimento> atendimentos = new ArrayList<Atendimento>();
    private CadAnimal cadAnimal;

    public CadAtendimento(CadAnimal cadAnimal) {
        this.cadAnimal = cadAnimal;
    }

    public boolean adicionar() {
        return false;
    }

    public boolean remover() {
        return false;
    }

    public ArrayList gravarArquivo() {
        return null;
    }

    public void listar() {

    }

    public void lerArquivo(ArrayList objeto) {

    }
}
