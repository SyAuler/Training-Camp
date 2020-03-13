package recursividade;

public class ex03 {
	/* Desenvolva uma rotina recursiva que tenha como parâmetro 
	 * uma String “str” e como retorno a sua inversa.
	 * Ex: seja  str = “abaxi” o retorno deve ser “ixaba”
	 */
	public static String inverso(String str) {
		
		if (str.length() == 1) {
            return str;
        } else {
            return inverso(str.substring(1)) + str.charAt(0);
        }
	}
	public static void main(String[] args) {
		String str = "abacaxi";
		System.out.print(inverso(str));
	}
}
