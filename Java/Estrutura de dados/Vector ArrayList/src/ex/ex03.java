package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex03 {

	private static void readNames(ArrayList<String> lst, int quantity) {
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < quantity; i++) {
			System.out.printf("%d :", i + 1);
			lst.add(scn.nextLine());
		}
	}
	
	public static void printReverse(ArrayList<String> lst) {
		
		System.out.print("[");
		for (int i = lst.size() - 1; i > - 1; i--) {
			System.out.printf("%s", lst.get(i));
			if (i > 0) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> lst = new ArrayList<>(); 
		
		readNames(lst, 5);
		
		System.out.println(lst.toString());
		
		//mostrando em ordem inversa
		for (int i = lst.size() - 1; i > - 1; i--) {
			System.out.printf("%s ", lst.get(i));
		}
		
		printReverse(lst);
		
		//mostrando em ordem inversa
		Collections.reverse(lst);
		
		System.out.println(lst.toString());
	}
}
