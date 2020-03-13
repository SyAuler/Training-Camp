package recursividade;

public class ex02 {
	/* Desenvolva uma rotina recursiva que tenha como par�metro um n�mero inteiro �n� 
	 * e como retorno uma String contendo a representa��o de �n� na base bin�ria.
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
