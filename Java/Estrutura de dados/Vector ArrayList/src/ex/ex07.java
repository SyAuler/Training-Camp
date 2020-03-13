package ex;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex07 {
	
	private static void read(List<Integer> lst, int quantity) {
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < quantity; i++) {
			System.out.println("%d º número");
			int number = scn.nextInt();
			
			if (lst.contains(number)) {
				
			}
			lst.add(number);
		}
	}

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		read(lst, 10);
		
		System.out.println(lst.toString());
		
	}
}
