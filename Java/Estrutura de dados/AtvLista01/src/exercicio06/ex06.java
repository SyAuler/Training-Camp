package exercicio06;

import java.util.Scanner;

public class ex06 {
	/*Escreva uma rotina de classe (static) que recebe um texto (String) 
	 *e retorna um array com a contagem, de cada uma das letras do alfabeto.
	 */
	
	public static String Alfabeto() {
		return "abcdefghijklmnopqrstuvxwyzç 1234567890";
	}
	public static int[] LetrasAlfabeto(String texto) {
		String alfabeto = Alfabeto();
		int retorno[] = new int[alfabeto.length()];
						
		for (int i=0; i < alfabeto.length(); i++) {
			retorno[i]=0;
			char caracter1 = alfabeto.charAt(i);
			
			for (int j = 0; j < texto.length(); j++) {
				char caracter2 = texto.charAt(j);
				if (caracter1 == caracter2) {
					retorno[i] = retorno[i] + 1; 
				}
			}
		}
		
		return retorno;
	}
		
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe um texto");
		String texto = scn.nextLine().toLowerCase();
		
		String alfabeto = Alfabeto();
		int retorno[] = LetrasAlfabeto(texto);
		for (int i=0; i < alfabeto.length(); i++) {
			char caracter1 = alfabeto.charAt(i);
			System.out.printf("A letra %s contém: %d\n", caracter1, retorno[i]);
		}
		scn.close();
	}
}
