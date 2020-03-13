package recursividade;

public class ex02 {
	/* Desenvolva uma rotina recursiva que tenha como parâmetro um número inteiro “n” 
	 * e como retorno uma String contendo a representação de “n” na base binária.
	 */
	public static String binario(int n) {
		String str = "";
		if (n > 1) {
			str = str + binario(n / 2);
		}
		return str + String.valueOf( (n % 2) );
	}
	
	public static void main(String[] args) {
		int n = 20;
		System.out.println(binario(n));
	}	
}
