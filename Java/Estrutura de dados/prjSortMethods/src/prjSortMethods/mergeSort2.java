package prjSortMethods;

public class mergeSort2 {
	/*Antes de estudar o algoritmo “Merge Sort”, escreva um função que 
	receba dois vetores de números inteiros, e retorne um único vetor 
	contendo a intercalação dos dois vetores iniciais.
	Teste com
	   	int[] v = {1,3,5,7,9};
		int[] u = {0,2,4,6,8,10};
	 
	public static int[] interleave(int[] v, int[] u) {
	}*/

	public static int[] mergeSort(int[] v, int[] u) {//vai dividindo e depois juntando de novo
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
	
	public static void main (String[] args) {
		int[] v = {0,2,4,6,8,10,7};
		int[] u = {1,3,5,7,9};
		
			
		int[] result = mergeSort(u, v);
		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j]);
		}			
	}
}
