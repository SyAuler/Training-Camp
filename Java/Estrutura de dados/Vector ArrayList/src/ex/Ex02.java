package ex;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lst = new ArrayList<>(); //10 elementos
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(10);
		lst.add(7);
		lst.add(8);
		lst.add(0);
		lst.add(9);
		
		for (int i = 0; i < lst.size(); i++) {
			System.out.printf("%3d ", lst.get(i));
		}
		System.out.println();
		
		for (Integer value : lst) { // for each
			System.out.printf("%3d ", value);
		}
		System.out.println();
		
		System.out.println(lst.toString());
		
		lst.forEach(value -> System.out.printf("%3d", value)); // -> = conhecido como Lambda
		
		
	}
}
