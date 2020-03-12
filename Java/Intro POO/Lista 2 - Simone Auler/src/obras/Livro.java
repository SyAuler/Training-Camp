import java.util.List;

public class Livro extends Obra {

    private String codigoISBN;
    private Integer numeroPaginas;

    public Livro(String titulo, Integer anoLancamento, List<Autor> autores, String codigoISBN, Integer numeroPaginas) {
        super(titulo, anoLancamento, autores);
        this.codigoISBN = codigoISBN;
        this.numeroPaginas = numeroPaginas;
    }

}
