package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex04 {
	
	public static void print(List<String> lst) {
		
		int i = 1;
		
		for (String name : lst) {
			System.out.printf("%02d %s \n", i++, name);
		}
	}
		
	public void main(String[] args) {
		//interface = estabelece um contrato, o conjunto de métodos que devem ser implementados
		//List é a interface e ArrayList a classe concreta
		List<String> lst = new ArrayList<>();
		
		//classe Collections contém diversos métodos utilitarios
		Collections.addAll(lst, "Vilson Luiz", "Julio Cezar", "Ana Maria");
		lst.add("Pedro da Silva");
		lst.add("Enio Januario");
		//a lista está com cinco nomes
		
		print(lst);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Qual deseja remover?");
		int pos = scn.nextInt();
		
		lst.remove(pos - 1);
		
		print(lst);
	}
}
