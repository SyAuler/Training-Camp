package exercicio05;

import java.util.Scanner;

public class ex05 {
	/* 5. Escreva uma rotina de classe, a qual recebe uma palavra 
	 * e retorna true caso seja um PALINDROMO, ou false caso contrário.
	 * Dica: Primeiro descubra o que é um palindromo
	 */
	public static boolean verificar(String palavra) {
		
		String invertida = new StringBuffer(palavra).reverse().toString();
			if (palavra.equals(invertida)){
				return true;
			} else {
				return false;
			}
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe uma palavra palindroma");
		String palavra = scn.nextLine();
		
		System.out.print(verificar(palavra));
		
		scn.close();
	}
}
