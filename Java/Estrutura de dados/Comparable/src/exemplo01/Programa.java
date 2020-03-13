package exemplo01;

import java.util.Arrays;
import java.util.Comparator;

public class Programa {
	static Pessoa[] vPessoa = {
			new Pessoa("Vilson", 'M', 47, 79, 1.67f),
			new Pessoa("Mariana", 'F', 22, 49.5, 1.56f),
			new Pessoa("Jorge", 'M', 17, 55.6, 1.70f),
			new Pessoa("Silvia", 'F', 19, 56.5, 1.72f),
			new Pessoa("Pedro", 'M', 32, 68.4, 1.68f),
			new Pessoa("Ana Maria", 'F', 45, 64, 1.56f),
			new Pessoa("Luiz Alberto", 'M', 35, 87, 1.8f),
			new Pessoa("Maria", 'F', 50, 80, 1.50f),
			new Pessoa("Andre", 'M', 15, 69, 1.75f),
			new Pessoa("Aline", 'F', 28, 74, 1.73f),
	};
	static void print(Pessoa[] v) {
		for(Pessoa pessoa : v)
			System.out.println(pessoa);
	}
	// ordenar por sexo
	static class ComparatorSexo implements Comparator<Pessoa>{
		@Override
		public int compare(Pessoa pA, Pessoa pB) {
			//return pA.getSexo() - pB.getSexo(); //avançado
			if(pA.getSexo() == pB.getSexo()) //novato
				return 0;
			if(pA.getSexo() < pB.getSexo())
				return -1;
			return 1;
		}
	}
	// ordenar por idade
	static class ComparatorIdade implements Comparator<Pessoa>{
		@Override
		public int compare(Pessoa pA, Pessoa pB) {
			return pA.getIdade() - pB.getIdade();
		}
	}
	// ordenar por peso
	static class ComparatorPeso implements Comparator<Pessoa>{
		@Override
		public int compare(Pessoa pA, Pessoa pB) {
			if(pA.getPeso() < pB.getPeso()) {
				return -1;
			}
			return 1;
		}
	}
	// ordenar por altura
	static class ComparatorAltura implements Comparator<Pessoa>{
		@Override
		public int compare(Pessoa pA, Pessoa pB) {
			if(pA.getAltura() < pB.getAltura())
				return -1;
			return 1;
		}
	}
	
	public static void main(String args[]) {
		Arrays.sort(vPessoa);
		System.out.println("Ordenado por Nome");
		print(vPessoa);
		System.out.println();
		
		// ordenar por sexo
		Arrays.sort(vPessoa,  new ComparatorSexo());
		System.out.println("Ordenado por sexo");
		print(vPessoa);
		System.out.println();
		
		// ordenar por sexo - idade
		Arrays.sort(vPessoa,  new ComparatorIdade());
		Arrays.sort(vPessoa,  new ComparatorSexo());
		System.out.println("Ordenado por Sexo e Idade");
		print(vPessoa);
		System.out.println();
		
		// ordenar por sexo - peso
		Arrays.sort(vPessoa,  new ComparatorPeso());
		Arrays.sort(vPessoa,  new ComparatorSexo());
		System.out.println("Ordenado por Sexo e Peso");
		print(vPessoa);
		System.out.println();
		
		// ordenar por idade - sexo - nome
		Arrays.sort(vPessoa);
		Arrays.sort(vPessoa,  new ComparatorSexo());
		Arrays.sort(vPessoa,  new ComparatorIdade());
		System.out.println("Ordenado por Idade, Sexo e Nome");
		print(vPessoa);
		System.out.println();
	}
}
