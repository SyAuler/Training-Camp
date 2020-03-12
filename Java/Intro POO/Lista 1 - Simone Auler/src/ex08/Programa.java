
package ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    static Scanner input = new Scanner(System.in);
	
	public static String retNomeProduto() {
		String nomeProduto = "";
		
		while (true) {
			System.out.println("Informe o nome do produto");
			
			if (input.hasNext()) {
				nomeProduto = input.next();
				if (nomeProduto.length() > 3) {
					break;
				} else {
					input.nextLine();
					System.out.println("Nome do produto não atende aos critérios (tamanho maior que 3)");
				}
			} else {
				input.nextLine();
				System.out.println("Nome do produto é inválido!");
			}			
		}
		return nomeProduto;
	}
	
	public static double retPrecoUnitario() {
		double precoUnitario = 0;

		while (true) {
			System.out.println("Informe o preço unitário do produto");
			
			if (input.hasNextDouble()) {
				precoUnitario = input.nextDouble();
				if (precoUnitario > 0) {
					break;
				} else {
					input.nextLine();
					System.out.println("Preço unitário do produto não atende aos critérios (tamanho maior que 0)");
				}
			} else {
				input.nextLine();
				System.out.println("Preço unitário do produto é inválido!");
			}			
		}
		return precoUnitario;
	}
	
	public static void main (String[] args) {
		
		List<Produto> lista = new ArrayList<Produto>();
		lista.add(new Produto("Produto teste 1"));
		lista.add(new Produto("Produto teste 2", 10.00));
		lista.add(new Produto("Produto teste 3"));
		
		while (true) {
			System.out.println("Selecione: 1-Cadastrar Produto; 2-Sair");
			int comando = input.nextInt();
			
			if (comando == 1) {
				String nomeProduto = retNomeProduto();
				
				while (true) {
					System.out.println("Opção: 1-Cadastrar Preço Unitário; 2-Não informar preço");
					int opcao = input.nextInt();
					
					if (opcao == 1) {	
						double precoUnitario = retPrecoUnitario();
						
						lista.add(new Produto(nomeProduto, precoUnitario));
					} else {
						lista.add(new Produto(nomeProduto));
					}
					
					System.out.println(lista.get(lista.size()-1).toString());
					break;
				}
			}
			if (comando == 2) {break;}
		}
		input.close();
		
		for (int s = 0; s < lista.size(); s++) {
			System.out.println(lista.get(s).toString());
		}
		
		System.out.println(lista.get(0).ajustarPrecoUnitario(15));
		System.out.println(lista.get(0).lancarEntrada(5));
		System.out.println(lista.get(0).lancarSaida(3));
		
		for (int s = 0; s < lista.size(); s++) {
			System.out.println(lista.get(s).toString());
		}
		
	}
}
