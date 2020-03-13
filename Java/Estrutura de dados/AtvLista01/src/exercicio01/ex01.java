package exercicio01;

import java.util.Scanner;

public class ex01 {
	/* 1. Escreva uma rotina de classe, a qual recebe um número real “value”, 
	faz uso das rotinas valueOf, indexOf, e subtring para extrair 
	e retornar uma String contendo apenas a parte inteira de value.
	Ex: dado o valor real 2341.456 retorna a string “2341” */
	
	
	public static int usa_indexOf(double valor) {
	
		String novo_valor = String.valueOf(valor);
		return novo_valor.indexOf('.');
	}
	
	public static String usa_substring(double valor, int posicao) {
		String novo_valor = String.valueOf(valor);
		return novo_valor.substring(0, posicao); 
	}
	
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe um número real qualquer: ");
		double valor = scn.nextDouble();

		int posicao = usa_indexOf(valor);
		String retorno = usa_substring(valor, posicao);
		System.out.println(retorno);
		
		scn.close();
	}
}	