package util;

public class Teste {

	public static void main(String[] args) {
		//criando o buffer para 5 strings
		BufferCircular<String> bcs = new BufferCircular<>(5);
		bcs.push("Vilson");
		bcs.push("Luiz");
		
		System.out.println(bcs.pop());
		bcs.push("Maria");
		bcs.push("Paula"); //Exception
		
		//teste com buffer de inteiros
		
		BufferCircular<Integer> bci = new BufferCircular<>(5);
		bci.push(5);
		bci.push(3);
		
	}
}
