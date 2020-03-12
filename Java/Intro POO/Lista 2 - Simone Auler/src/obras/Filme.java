import java.util.ArrayList;
import java.util.List;

public class Filme extends Obra {

    private Integer duracaoMinutos;

    public Filme(String titulo, Integer anoLancamento, List<Autor> autores, Integer duracaoMinutos) {
        super(titulo, anoLancamento, autores);
        this.duracaoMinutos = duracaoMinutos;
    }

}
