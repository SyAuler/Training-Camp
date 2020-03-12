import java.util.ArrayList;
import java.util.List;

public class Obra {

    private String titulo;
    private int anoLancamento;
    List<Autor> autores = new ArrayList<Autor>();

    public Obra(String titulo, Integer anoLancamento, List<Autor> autores) {
        super();
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        String listaAutores = "";
        for (int i = 0; i < autores.size(); i++) {
            listaAutores = listaAutores + autores.get(i).getNome() + ", ";
        }
        return "Obra [titulo=" + titulo + ", anoLancamento=" + anoLancamento + ", autores=" + listaAutores + "]";
    }

}
