package exercicio4;

import java.util.Arrays;
import java.util.Random;

public class appEx04 {
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
	public static String palavras() {
		StringBuffer frase = new StringBuffer();
		int palavras = getRandomNumberInRange(1,5);
		for (int i = 0; i < palavras; i++) {
			if (i > 0) {frase.append(' ');}
			
			int letras = getRandomNumberInRange(3,50);
			for (int s = 0; s < letras; s++) {
				int t = getRandomNumberInRange(97,122);
				frase.append(Character.toChars(t).toString());
			}
		}
		return frase.toString();
	}

	public static void main(String[] args) {

		String v[] = new String[10];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = palavras();
		}
		
		for (int i = 0; i < v.length; i++) {	
			System.out.printf("Frase %s \n", v[i]);
		}
	}
	
}
