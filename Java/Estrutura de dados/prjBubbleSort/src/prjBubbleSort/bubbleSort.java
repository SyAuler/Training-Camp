package prjBubbleSort;

public class bubbleSort {

	public static void bubbleSort(int[] v) {
		
		int aux = 0;
		
		for (int ciclo = 1; ciclo < v.length; ciclo++) {
			for (int i = 0; i < v.length - 1; i++) { //ponto de parada no v[4] senão da erro
				if (v[i] > v[i + 1]) {
					aux = v[i];		//swap/troca
					v[i] = v[i + 1];
					v[i + 1] = aux;
				}
			}
		}		
	}
	public static void main(String args[]) {
		int[] v = {8,7,5,1,0,2,4,3,9,6};
		bubbleSort(v);
		for (int value : v) {
			System.out.printf("%2d", value);
		}
	}
}
