import java.util.List;

public class Escultura extends Obra {

    private String material;
    private double altura;
    private double largura;
    private double comprimento;
    private double peso;

    public Escultura(String titulo, Integer anoLancamento, List<Autor> autores, String material, double altura,
            double largura, double comprimento, double peso) {
        super(titulo, anoLancamento, autores);
        this.material = material;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.peso = peso;
    }

}
