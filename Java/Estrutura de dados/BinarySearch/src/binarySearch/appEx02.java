package binarySearch;

import java.util.Arrays;
import java.util.Random;

public class appEx02 {

	public static void fillRandom(char[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = gerarChar();
		}
	}

	public static char gerarChar() {
		char retorno;
		
		Random rdn = new Random();
		while(true){ 
			int charInt = rdn.nextInt(122); 

			if (charInt >= 65 && charInt <= 90 || charInt <= 97 && charInt >= 122) { 
				retorno = (char) charInt;
				break;
			}		
		}
		return retorno;
	}


	public static void main(String[] args) {

		char v[] = new char[1000];

		fillRandom(v);

		Arrays.sort(v);

		for (int i = 0; i < 10; i++) {
			char key = gerarChar();
			int retorno = Arrays.binarySearch(v, key);

			if (retorno > 0) {
				System.out.printf("O valor %s foi encontrado na posição %d\n", key, retorno);
			}
		}
	}
}
