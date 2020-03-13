package exercicio02;

import java.util.Scanner;

public class ex02 {
	/* 
	2. Escreva uma rotina de classe, a qual recebe um número real “value”, 
	faz uso das rotinas valueOf, indexOf, e subtring para extrair 
	e retornar uma String contendo apenas a parte decimal de value.
	Ex: dado o valor real 2341.456 retorna a string “456”
	*/
	
	// function da posicao
	public static int usa_indexOf(String valor) { //retorna a posição do ponto
		return valor.indexOf('.');
	}
	
	// function do retorno
	public static String usa_substring(String valor, int posicao) { //copiar da posição até o ponto
		return valor.substring(posicao + 1, valor.length() - posicao + 2 ); // 
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um número real qualquer");
		double valor_double = scn.nextDouble();
		
		String valor_string = String.valueOf(valor_double);//converte de double para string
		int posicao = usa_indexOf(valor_string);
		
		String retorno = usa_substring(valor_string, posicao);
		System.out.println(retorno);
		
		scn.close();
	}
}
