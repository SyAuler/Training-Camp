package prjSortMethods;

public class selectionSort {
	/*Dado o vetor v[] a seguir, int[] v = {1,3,2,5,7,4,0,6,9,8}
	 * Execute o algoritmo passo a passo, depois descreva, com suas
	 * palavras como o algoritmo funciona	 * 
	 */
	public static void ascendingSelectionSort(int v[]){ 
	   for (int i = 0; i < v.length-1; i++) {
	      int min = i;
	      for (int j = (i+1); j < v.length; j++){
	         if (v[j] < v[min]) {
	            min = j;
	         }
	      }
	      if (v[i] != v[min]){
	         int aux = v[i];
	         v[i]    = v[min];
	         v[min]  = aux;
	      }
	   }
	}

	public static void main(String[] args) {
		int[] v ={1,3,2,5,7,4,0,6,9,8};
		
		ascendingSelectionSort(v);
		for (int value : v) {
			System.out.println(value);
		}
	}
}
