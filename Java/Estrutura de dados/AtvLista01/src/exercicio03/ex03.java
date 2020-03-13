package exercicio03;

import java.util.Scanner;

public class ex03 {
	/* 3.Escreva uma rotina de classe, a qual recebe um texto (String) qualquer
	e retorne um vetor contendo a contagem de cada uma das cinco vogais no texto.
	*/
	
	public static int[] Vogal(String str) {
		 int[] vCont = new int[5];
		
		vCont[0] = 0;
		vCont[1] = 0;
		vCont[2] = 0;
		vCont[3] = 0;
		vCont[4] = 0;
		
		for (int i = 0; i < str.length(); i++) { //é um método da string	 
			switch(str.charAt(i)) {
				case 'a': 
					vCont[0]++;
					break;
				case 'e':
					vCont[1]++;
					break;
				case 'i':
					vCont[2]++;
					break;
				case 'o': 
					vCont[3]++;
					break;
				case 'u':
					vCont[4]++;
					break;
			}
		}		
		return vCont;
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe uma palavra qualquer");
		
		String str = scn.next().toLowerCase();

		System.out.printf("A palavra é %s e contém:\n", str);
		
		int[] retorno = Vogal(str);

		for (int i = 0; i < retorno.length; i++) { //o length é propriedade do array
			switch(i) {
				case 0: 
					System.out.printf("Caracteres A: %d\n", retorno[i]);
					break;
				case 1:
					System.out.printf("Caracteres E: %d\n", retorno[i]);
					break;
				case 2:
					System.out.printf("Caracteres I: %d\n", retorno[i]);
					break;
				case 3: 
					System.out.printf("Caracteres O: %d\n", retorno[i]);
					break;
				case 4:
					System.out.printf("Caracteres U: %d\n", retorno[i]);
					break;
			}
		}
		scn.close();
	}	
}
