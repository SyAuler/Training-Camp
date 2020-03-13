package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex06 {

	private static void readPhrases(List<String> lst, int numberOfLines) {

		@SuppressWarnings("resources")//anotação, não notificar o erro pq eu sei o que to fazendo 
		//instruções para o programa executar corretamente
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < numberOfLines; i++) {
			System.out.printf("Frase %d: ", i);
			lst.add(scanner.nextLine());
		}
	}

	private static String createNewPhrase(List<String> lst) {

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < lst.size(); i++) {

			String line = lst.get(i);
			sb.append(line.substring(0, line.indexOf(' ')));

			if (i < lst.size() - 1) {
				sb.append(' ');
			}
		}

		return sb.toString();
		
		/* Código ruim
		String phrase = "";

		for(int i = 0; i < lst.size(); i++) {

			String line = lst.get(i);
			phrase += line.substring(0, line.indexOf(' '));

			if (i < lst.size() - 1) {
				phrase += " ";
			}
		}

		return phrase;  */
	}

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();

		readPhrases(lst, 5);

		String phrase = createNewPhrase(lst);

		System.out.print(phrase.toUpperCase());

	}
}
