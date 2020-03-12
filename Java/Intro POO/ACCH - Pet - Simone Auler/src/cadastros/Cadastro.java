package cadastros;

import java.util.ArrayList;

public interface Cadastro {

    public boolean adicionar();

    public boolean remover();

    public ArrayList gravarArquivo();

    public void listar();

    public void lerArquivo(ArrayList objeto);
}
