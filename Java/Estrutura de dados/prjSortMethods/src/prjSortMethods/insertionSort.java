package prjSortMethods;
/* 
Dado o vetor v[] a seguir, int[] v ={1,3,2,5,7,4,0,6,9,8};
execute o algoritmo passo a passo, depois descreva, com suas palavras
como o algoritmo funciona.

desenvolver o passo a passo (teste de mesa) em papel e entregar na próxima aula*/

public class insertionSort {
	public static void ascendingInsertionSort(int v[]) {
		
		for (int i = 1; i < v.length; i++) {
			int j, tmp = v[i];
			
			for (j = i; j > 0; j--) {
				int atual = v[j- 1];
				if (tmp < atual)
					v[j] = v[j - 1];
				else
					break;
			}
			v[j] = tmp;
		}
	}

	public static void main(String[] args) {
		int[] v ={1,3,2,5,7,4,0,6,9,8};
		
		ascendingInsertionSort(v);
		for (int value : v) {
			System.out.println(value);
		}
	}
}