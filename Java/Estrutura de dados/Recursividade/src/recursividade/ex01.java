package recursividade;

public class ex01 {
	/* Desenvolva uma rotina recursiva que receba por parâmetro 
	 * dois números inteiros “m” e “n”, calcule e retorne o produto (m x n) 
	 * empregando apenas operações de soma.
	 * Ex. seja m=3 e n = 4 -> m x n = 4 + 4 + 4 = 12 
	 */
	public static int soma(int m, int n) {
		int r = 0;
		
		if (n > 0) {
			r = m + soma(m, n-1); 
		}		
		return r;
	}
	
	public static void main(String[] args) {
		int m = 3;
		int n = 4;
		
		System.out.printf("%3d", soma(m, n));
	}	
}
