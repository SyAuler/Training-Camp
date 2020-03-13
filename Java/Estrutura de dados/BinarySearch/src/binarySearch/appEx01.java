package binarySearch;

import java.util.Arrays;
import java.util.Random;

public class appEx01 {

	public static void fillRandom(int[] v) {

		Random rand = new Random();

		for (int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(1000);
		}
	}

	public static void main(String[] args) {

		int v[] = new int[1000];

		fillRandom(v);

		Arrays.sort(v);

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			int key = rand.nextInt(1000);
			int retorno = Arrays.binarySearch(v, key);

			if (retorno > 0) {
				System.out.printf("O valor %d foi encontrado na posi��o %d\n", key, retorno);
			} else {
				System.out.printf("O valor %d n�o est� no vetor \n", key);
			}
		}
	}
}