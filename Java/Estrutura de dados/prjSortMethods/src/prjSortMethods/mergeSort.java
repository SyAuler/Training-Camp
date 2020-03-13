package prjSortMethods;

public class mergeSort {
	/*Antes de estudar o algoritmo “Merge Sort”, escreva um função que 
	receba dois vetores de números inteiros, e retorne um único vetor 
	contendo a intercalação dos dois vetores iniciais.
	Teste com
	   	int[] v = {1,3,5,7,9};
		int[] u = {0,2,4,6,8,10};
	 
	public static int[] interleave(int[] v, int[] u) {
	}*/

	private static int[] junta(int[] v, int[] u) {
		int tam = (v.length + u.length);
		int[] array = new int[tam];
		int i = 0;
		int r = 0;
		
		for (int j = 0; j < array.length; j++) {
			if (j < u.length) {
				array[r++] = u[i];
			} 
			if (j < v.length) {
				array[r++] = v[i];
			} 
			i++;
		}
		return array;
	}
	
	private static void intercalador(int[] v, int[] w, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++) 
			w[k] = v[k];	
		
		int i = ini;
		int j = meio + 1;
		for (int k = ini; k <= fim; k++) {
			if (i > meio) v[k] = w[j++];
			else if (j > fim) v[k] = w[i++];
			else if (w[i] < w[j]) v[k] = w[i++];
			else v[k] = w[j++];
		}
	}
	
	private static void my_mergeSort(int[] v, int[] w, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			my_mergeSort(v, w, ini, meio);
			my_mergeSort(v, w, meio+1, fim);
			intercalador(v, w, ini, meio, fim);
		}
	}
	
	public static void main (String[] args) {
		int[] v = {0,2,4,6,8,10};
		int[] u = {1,3,5,7,9};
		
		int[] s = junta(v, u);
		int[] w = new int[s.length];
		my_mergeSort(s, w, 0, s.length-1);
		
		for (int j = 0; j < s.length; j++) {
			System.out.print(s[j]);
		}
	}
}
