package exercicio4;

import java.util.Arrays;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		int linhas = 1000;
		String[] arr = new String[linhas];

		for (int i = 0; i < linhas; i++) { //cria uma frase
			arr[i] = createWords().toString();
		}

		Arrays.sort(arr);

		for (int i = 0; i < linhas; i++) {
			System.out.printf("%s\n", arr[i]);
		}

		Random rand = new Random();
		for (int i = 0; i < 10; i++) {

			int k = rand.nextInt(1000);
			String str = arr [ k ];

			int retorno = Arrays.binarySearch(arr, str);

			if (k == retorno) {
				System.out.printf("A posição %d é compatível com o valor: %s \n", retorno, arr[k]);
			} else {
				System.out.printf("A posição %d não é compatível \n", k);
			}
		}
	} // end main

	public static int unicodeRandom() {
		Random rdn = new Random();
		int num = 0;
		Boolean flag = false;
		while (flag == false) {
			num = rdn.nextInt(122);
			if (num >= 65 && num <= 90 || num <= 97 && num >= 122)
				flag = true;
		}
		return num;
	} // end unicodeRandom

	public static StringBuilder createWords() {
		StringBuilder builder = new StringBuilder(); // Instanciar o objeto StringBuilder

		int words = createPalavras(); //flag palavras

		for (int j = 0; j < words; j++) {
			if (j > 0) {
				builder.append(" ");
			}
			int count = countRandom(); // flag contador
			builder.append(word(count)); // define o tamanho por parâmetro
		}
		return builder;
	} // end createWords

	public static String word(int tamanho) {
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < tamanho; i++) {
			buffer.append(Character.toChars(unicodeRandom()));
		}
		return buffer.toString();
	}

	public static int countRandom() {
		int count = 0;
		Random rdn = new Random();
		while (true) {
			count = rdn.nextInt(10); 
			if ((count > 3) && (count < 10)) {break;}
		}
		return count;
	} // end countRandom

	public static int createPalavras() {
		int count = 0;
		Random rdn = new Random();
		while (true) {
			count = rdn.nextInt(10); 
			if ((count > 3) && (count < 10)) {break;}
		}
		return count;
	} // end countRandom

} // end Program
