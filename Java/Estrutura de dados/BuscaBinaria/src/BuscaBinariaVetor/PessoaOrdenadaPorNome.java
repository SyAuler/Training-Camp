package BuscaBinariaVetor;

import java.time.LocalDate;
import java.util.Comparator;

public class PessoaOrdenadaPorNome implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Pessoa) o1).getNome().compareTo( ((Pessoa) o2).getNome() );
	}

}
