package buscaBinaria;

import java.util.Arrays;
import java.util.Random;

import BuscaBinariaVetor.Pessoa;

public class BuscaBinaria {
	//serve para numeros inteiros

	static int buscaBinaria(int[] v, int i, int f, int key) {
		int meio = (i + f) / 2;

		if (i >= f) {
			return -1;
		} else if (v[meio] == key) {
			return meio;
		} else if (v[meio] < key) {
			return buscaBinaria(v, meio + 1, f, key);
		} else
			return buscaBinaria(v, 0, meio - 1, key);
	}

	public static void main(String[] args) {

		int[] v = new int[1000];
		Random rand = new Random();

		for (int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(1000);
			System.out.println(v[i]);
		}

		Arrays.sort(v);

		for (int i = 0; i < v.length; i++) {
			int key = rand.nextInt(1000);

			System.out.printf("chave %d\n", key);

			int retorno = buscaBinaria(v, 0, v.length, key);

			if (retorno != -1) {
				System.out.printf("O valor %d foi encontrado na posição %d\n", key, retorno);
			} else {
				System.out.printf("O valor %d não está no vetor \n", key);
			}
		}

		for (int i = 0; i < v.length; i++) {
			int key = rand.nextInt(1000);
			int retorno = Arrays.binarySearch(v, key);

			if (retorno > 0) {
				System.out.printf("O valor %d foi encontrado na posição %d\n", key, retorno);
			} else {
				System.out.printf("O valor %d não está no vetor \n", key);
			}
		}
	}
}
