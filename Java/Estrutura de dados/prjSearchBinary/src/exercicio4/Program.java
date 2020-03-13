package exercicio4;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		System.out.println(createWords().toString());
		
		// builder.append(Character.toChars(unicodeRandom()));

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
		int count = countRandom(); // flag contador
		
		for (int i = 0; i < count; i++) {
			builder.append(Character.toChars(unicodeRandom()));
		}
		
		return builder;
	} // end createWords

	public static int countRandom() {
		Random rdn = new Random();
		int count = 0; // contador para gerar palavras
		while (count < 3 && count > 10) {
			count = rdn.nextInt(10);
		}
		return count;
	} // end countRandom

} // end Program
