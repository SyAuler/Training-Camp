package exercicio07;

import java.util.Scanner;

public class ex07 {
	/* Escreva uma rotina que recebe duas FRASES (Strings) e 
	 * retorna uma frase contendo a intercalação das mesmas. 
	 * Ex.  fraseA = “Tecnologia Sistemas Internet”,  frase = “em para” 
	 * -> retorno “Tecnologia em Sistemas para Internet”
	 */
	public static String frase(String text1, String text2) {
		String frase1[] = text1.split(" ");
		String frase2[] = text2.split(" ");
		String retorno = "";
		
		int i = 0; 
		while (true) {
			String valor1 = "";
			if (i < frase1.length) {
				valor1 = frase1[i];
			}
			String valor2 = "";
			if (i < frase2.length) {
				valor2 = frase2[i];
			}
			String valor3 = "";
			valor3 = valor1 + " " + valor2;
			if (valor3.equals(" ")) {
				break;
			} else {
				retorno = retorno + " " + valor3;
			}
			i++;
		} 
		return retorno;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe uma frase");
		String text1 = scn.nextLine();
		
		System.out.print("Informe outra frase");
		String text2 = scn.nextLine();
		
		System.out.print(frase(text1, text2));
		scn.close();
	}
}
