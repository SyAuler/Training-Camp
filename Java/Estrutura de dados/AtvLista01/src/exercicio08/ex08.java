package exercicio08;

import java.util.Base64;

public class ex08 {
	/*Escreva uma classe Encryptor com dois métodos. 
	 * ◦ O primeiro recebe uma String “txt” e uma chave de criptografia (uma palavra) “key” 
	 * e retorna uma String, o conteúdo de “txt” criptografado. 
	 * 
	 * ◦ O segundo recebe uma String “txt” e uma chave de criptografia (uma palavra) “key” 
	 * e retorna uma String, o conteúdo de “txt” descriptografado. 
	 * 
	 * ◦ O processo de criptografia pode consistir de: 
	 * 
	 * a) aplicar a operação XOR (^), caractere a caractere da String com 
	 * caractere a caractere da palavra 
	 *
	 * b) aplicar uma operação de soma, caractere a caractere da String 
	 * com caractere a caractere da palavra } 
	 * 
	 * Escrever uma classe de teste, no método main declarar um objeto Encryptor 
	 * e testar com pelo menos três diferentes Strings com no mínimo 100 caracteres de comprimento.
	 */
	private static byte[] base64Decode(String s) {
	    return Base64.getDecoder().decode(s);
	}
	private static String base64Encode(byte[] bytes) {
	    return Base64.getEncoder().encodeToString(bytes);
	}
	private static byte[] xorChave(byte[] a, byte[] chave) {
	    byte[] saida = new byte[a.length];
	    for (int i = 0; i < a.length; i++) {
	        saida[i] = (byte) (a[i] ^ chave[i % chave.length]); //xor
	    }
	    return saida;
	}
	public static String Encryptor(String conteudo, String chave) {
		byte[] saida = xorChave(conteudo.getBytes(), chave.getBytes());
		return base64Encode(saida);
	}
	public static String Desencryptor(String conteudo, String chave) {
		return new String(xorChave(base64Decode(conteudo), chave.getBytes()));
	}
	public static Boolean Teste(String conteudo_enc, String conteudo_dec, String chave) {
		System.out.println(conteudo_enc);
		return Desencryptor(conteudo_enc, chave).equals(conteudo_dec);
	}
	public static void main(String[] args) {
		String chave = "fsdburiebvibsdbresuismkgmsdlpmsdriogensuibguawg";
		String conteudo_dec = "Escrever uma classe de teste, no método main declarar um objeto Encryptor e testar com pelo menos três diferentes Strings";
		String conteudo_enc = Encryptor(conteudo_dec, chave);
		
		if (Teste(conteudo_enc, conteudo_dec, chave) == true) {
			System.out.print("funcao funciona!");
		}
	}
}
