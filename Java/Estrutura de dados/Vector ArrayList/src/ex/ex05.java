package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex05 {
	
	private static int max(List<Integer> lst) {
		
		int max = lst.get(0);
		
		for (int value : lst) {
			max = value > max ? value : max;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
	
		List<Integer> lst = new ArrayList<>();
	
		Random rand = new Random(System.nanoTime());
		
		for (int i = 0; i < 10; i++) {
			lst.add(rand.nextInt(90)+10);
		}
		
		System.out.println(lst.toString());
		System.out.printf("Maior valor: %d\n", max(lst));
	
	}
}
