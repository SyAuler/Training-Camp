package prjSortMethods;

public class recursividade {
	//fibonacci
	
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n == 1 || n == 0) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static void main (String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("%3d, ", fibonacci(i));
		}
		/*System.out.print();*/
	}
}
