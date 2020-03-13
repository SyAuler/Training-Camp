package prjSortMethods;

public class AppOrdena {
	public static void sortAscending(int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			
			int posMenor = i;
			
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[posMenor]) {
					posMenor = j;
				}
			}
			int aux = v[i]; 
			v[i] = v[posMenor]; 
			v[posMenor] = aux;
		}
	}
	public static void main(String[] args) {
		int vetor[] = {2, 5, 4, 1, 3, 8, 7, 9, 0, 6};
		
		sortAscending(vetor);
		
		/*for (int value: vetor) { // pega o indexador i e varre até a posição final (for each) dentro do vetor, so serve para leitura
			System.out.printf("%2d", value);*/ //%2 é para imprimir com duas casas
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%2d", vetor[i]);
		}
	}
}
