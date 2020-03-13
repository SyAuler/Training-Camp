package prjWorkingWithStrings;

public class Lista01 {
	//08. Escreva uma rotina (static) que receba um nome do dia da semana por extenso e retorne o respectivo dia em número
	public static int dayOfWeek(String day) {
		
		
		return -1;
	}
	
	
	//07. Escreva uma rotina (static) que receba um numero e retorne o respectivo dia da semana por extenso
public static String dayOfWeeks(int day) {
	final String vDays[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
	
	if (day < 1 || day > 7){
		return "Desconhecido";
	return vDays [--day];
	}
}
	/*
	switch (day) {
		case 1:
			return "Domingo";
		case 2:
			return "Segunda";
		case 3:
			return "Terça";
		case 4:
			return "Quarta";
		case 5: 
			return "Quinta";
		case 6: 
			return "Sexta";
		case 7:
			return "Sábado";
		default:
			return "Desconhecido";		
		}
		
		OU
		if (day == 1) {
			return "Domingo";
		} else if {
			return "Segunda";
		}
		*/
	
	//06. Escreva uma rotina (static) que receba uma String e retorne a contagem de dígitos
	
	public static int countDigits(String str) {
		
		int digits = 0;
		
		for(int i=0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i)==' ')) {
				digits++;
			}
		}
		return digits;
	}
	
	//05. Escreva uma rotina (static) que receba uma String e retorne a contagem de sílabas
	public static int countWords(String str) {
		if(str==null || str.length()==0) {
			return 0; 
		}
		
		int words = 1;
		
		for(int i=0; i < str.length(); i++) {
			if (Character.isSpaceChar(str.charAt(i) == ' ')) {
				words++;
			}
		}
		return words;
	}
	
	/* OU
	if(str==null || str.lenght()==0)
		return 0; 
	return str.split(" ").lenght;*/ 
	//retorna um array de strings(guarda as referencias para a string no heap)
	// o vetor de strings fica no stack
	
	
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
	
		System.out.printf("meu nome é %s e contém %d letras do alfabeto\n", myName, howAlphabetic(myName));
		
		System.out.printf("meu nome é %s e contém %d sílabas\n", myName, countWords(myName));
		
		System.out.printf("meu nome é %s e contém %d sílabas\n", myName, countDigits(myName));
		
		System.out.printf("O dia da semana é %s \n", myName, dayOfWeek());
		
	}
}
