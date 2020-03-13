package BuscaBinariaVetor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class BuscaBinariaVetor {
	//serve para buscar objeto pessoa por chaves

	static int buscaBinaria(Pessoa[] v, int menor, int maior, int chave) {
		
		int media = (maior + menor) / 2;
		int valorMeio = v[media].getId();
		
		if (menor > maior) { 
			return -1; 
		} else if (valorMeio == chave) {
			return media;
		} else if (valorMeio < chave ) {
			return buscaBinaria(v, media + 1, maior, chave);
		} else 
		   return buscaBinaria(v, menor, media -1, chave);
	}	
	
	static void imprime(Pessoa[] v, int indice) {
		if (indice >= 0) {
			System.out.println( (v[indice].nome)  + " na posicao " + String.valueOf(indice) + " do vetor");
		} else {
			System.out.println( "Aluno não encontrado" );
		}
	}
	
	public static void main(String[] args) {

		Pessoa v[] = new Pessoa[20];
		v[0] = new Pessoa(47, "Vilson", LocalDate.parse("2010-01-20"));
		v[1] = new Pessoa(17, "Jorge", LocalDate.parse("2012-02-12"));
		v[2] = new Pessoa(19, "Silvia", LocalDate.parse("2015-03-21"));
		v[3] = new Pessoa(32, "Pedro", LocalDate.parse("2007-10-30"));
		v[4] = new Pessoa(45, "Ana", LocalDate.parse("2012-09-15"));
		v[5] = new Pessoa(23, "Luiz", LocalDate.parse("2005-04-03"));
		v[6] = new Pessoa(50, "Maria", LocalDate.parse("2003-07-09"));
		v[7] = new Pessoa(15, "Andre", LocalDate.parse("2027-12-05"));
		v[8] = new Pessoa(28, "Aline", LocalDate.parse("2000-11-18"));
		v[9] = new Pessoa(21, "Pessoa9", LocalDate.parse("1998-01-28"));
		v[10] = new Pessoa(18, "Pessoa10", LocalDate.parse("1999-02-21"));
		v[11] = new Pessoa(57, "Pessoa11", LocalDate.parse("2018-11-17"));
		v[12] = new Pessoa(9, "Pessoa12", LocalDate.parse("2012-03-07"));
		v[13] = new Pessoa(4, "Pessoa13", LocalDate.parse("2011-04-30"));
		v[14] = new Pessoa(62, "Pessoa14", LocalDate.parse("2010-05-10"));
		v[15] = new Pessoa(37, "Pessoa15", LocalDate.parse("2016-07-06"));
		v[16] = new Pessoa(61, "Pessoa16", LocalDate.parse("2017-09-27"));
		v[17] = new Pessoa(34, "Pessoa17", LocalDate.parse("2019-10-24"));
		v[18] = new Pessoa(12, "Pessoa18", LocalDate.parse("2009-06-21"));
		v[19] = new Pessoa(27, "Pessoa19", LocalDate.parse("2008-01-05"));
	
		System.out.println("--------vetor original--------------");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%d %s \n", ((Pessoa) v[i]).getId(),  ((Pessoa) v[i]).getNome() );
		}
		
		//Ordenado por ID, implementando Comparable e usando compareTo
		System.out.println("--------vetor ordenado por id--------------");
		Arrays.sort(v);
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%d %s \n", ((Pessoa) v[i]).getId(),  ((Pessoa) v[i]).getNome() );
		}
		
		System.out.println("--------contem na buscao binaria--------------");
		imprime(v, buscaBinaria(v, 0, v.length - 1, 37));
		imprime(v, buscaBinaria(v, 0, v.length - 1, 34));
		imprime(v, buscaBinaria(v, 0, v.length - 1, 61));
		
		System.out.println("--------nao contem na busca binaria--------------");
		imprime(v, buscaBinaria(v, 0, v.length - 1, 100));
		imprime(v, buscaBinaria(v, 0, v.length - 1, 101));
		imprime(v, buscaBinaria(v, 0, v.length - 1, 102));
	
		//ordenado por nome, comparable é a comparação por string, 
		//logo o buscaBinaria não funciona por necessita de um vetor ordenado por ID
		System.out.println("----------ordenado por nome------------");
		Arrays.sort(v, new PessoaOrdenadaPorNome());
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%s %d \n", ((Pessoa) v[i]).getNome(), ((Pessoa) v[i]).getId() );
		}

		System.out.println("----------------------");
	}
}