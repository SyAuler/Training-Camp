package prjWorkingWithStrings;

public class Lista01 {
	
	//04. Escreva uma rotina (static) que receba uma String e retorne a contagem de letras do alfabeto
	public static int howAlphabetic(String str) { //consoante
		str = str.toLowerCase();
		int alpha = 0;
		for (int i=0; i<str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				alpha++;
			}
		}
		return alpha;
	}
	
	
	//03. Escreva uma rotina (static) que receba uma String e retorne a contagem de consoantes
	// ainda precisa verificar acentos e Ç
	
	public static int howConsonant(String str) { //consoante
		str = str.toLowerCase();
		int consoant = 0;
		for (int i=0; i<str.length(); i++) {
			if ("bcdfghjklmnpqrstvxwyz".indexOf(str.charAt(i))>=0) {
				consoant++;
			}
		}
		return consoant;
	}
	
	//02. Escreva uma rotina(static) que receba uma String e retorne a contagem de vogais
	
	public static int howVowel(String str) { //vogal
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			if ("aeiou".indexOf(str.charAt(i))>=0) {
				count++;
			}
		}
		return count;
	}
		
	//01. Escreva uma linha de código para imprimir a String myName em CAIXA ALTA
	public static void main (String[] args) {
		String myName = "Simone Cristhina Auler";
		System.out.println(myName.toUpperCase());
		
		System.out.printf("meu nome é %s e contém %d vogais\n", myName, howVowel(myName));
		
		System.out.printf("meu nome é %s e contém %d consoantes\n", myName, howConsonant(myName));
	
	
	
	
		
		
		//05. Escreva uma rotina (static) que receba uma String e retorne a contagem de sílabas
		
		//06. Escreva uma rotina (static) que receba uma String e retorne a contagem de dígitos
		
		//07. Escreva uma rotina (static) que receba um numero e retorne o respectivo dia da semana por extenso
		
	}
}
