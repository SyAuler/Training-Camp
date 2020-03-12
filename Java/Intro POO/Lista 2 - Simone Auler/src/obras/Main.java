import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Obra> lista = new ArrayList<Obra>();

        List<Autor> autores_livro = new ArrayList<Autor>(10);
        autores_livro.add(new Autor("Maria"));
        autores_livro.add(new Autor("Joao"));
        lista.add(new Livro("Pequeno principe", 1985, autores_livro, "ISBN-2225", 100));

        List<Autor> autores_filme = new ArrayList<Autor>(10);
        autores_filme.add(new Autor("Felipe"));
        autores_filme.add(new Autor("Maria"));
        autores_filme.add(new Autor("Andre"));
        autores_filme.add(new Autor("Jeorge"));
        lista.add(new Filme("Titanic", 1999, autores_filme, 230));

        List<Autor> autores_quadro = new ArrayList<Autor>(10);
        autores_quadro.add(new Autor("Leonardo da Vinci"));
        lista.add(new Quadro("Monalisa", 1503, autores_quadro, "Retrato", "Pintura"));

        List<Autor> autores_escultura = new ArrayList<Autor>(10);
        autores_escultura.add(new Autor("Michelangelo"));
        lista.add(new Escultura("David", 1501, autores_escultura, "Argila", 4, 1, 1, 1200));

        String titulo = "Pequeno principe";
        System.out.println("Pesquisa por título da obra " + titulo);
        for (int i = 0; i < lista.size(); i++) {
            if (titulo == lista.get(i).getTitulo()) {
                System.out.println(lista.get(i).toString());
            }
        }

        int anoLancamento = 1503;
        System.out.println("Pesquisa por ano de lançamento " + anoLancamento);
        for (int i = 0; i < lista.size(); i++) {
            if (anoLancamento == lista.get(i).getAnoLancamento()) {
                System.out.println(lista.get(i).toString());
            }
        }

        String autor = "Maria";
        System.out.println("Pesquisa por autor " + autor);
        for (int i = 0; i < lista.size(); i++) {
            for (int s = 0; s < lista.get(i).autores.size(); s++) {
                if (autor == lista.get(i).autores.get(s).getNome()) {
                    System.out.println(lista.get(i).toString());
                }
            }
        }
    }
}
