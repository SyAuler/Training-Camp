package ex01;

import java.util.Random;

public class Slide4 {

	public static int busca(int key, int[] v ) {

		for (int i = 0; i < v.length; i++) {
			if (v[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] v = new int[1000];
		Random rand = new Random();

		for (int i = 0; i < v.length; i++) {
			System.out.println(rand.nextInt(1000));
		}
		for (int i = 0; i < 10; i++) {
			int key = rand.nextInt(1000);
			int pos = busca(key, v);
			
			if (pos != -1) {
				System.out.printf("O valor %d foi encontrado na posição %d\n", key, pos);
			} else {
				System.out.printf("O valor %d não está no vetor \n", key);
			}
		}
	}
}
