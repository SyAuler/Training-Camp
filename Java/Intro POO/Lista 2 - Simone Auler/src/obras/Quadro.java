import java.util.List;

public class Quadro extends Obra {

    private String estilo;
    private String tecnica;

    public Quadro(String titulo, Integer anoLancamento, List<Autor> autores, String estilo, String tecnica) {
        super(titulo, anoLancamento, autores);
        this.estilo = estilo;
        this.tecnica = tecnica;
    }

}
