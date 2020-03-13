package linkedList;

import java.util.List;

public class AppTest {

	public static void main(String[] args) {
		
		List<String> lst = new LinkedList<>();
		
		lst.add("Vilson Luiz");
		lst.add("Joaquim da Silva");
		lst.add("Mariana de Oliveira");
		lst.add("Silvana Queiroz"); // idosa - preferencia
		
		String name = lst.remove(0);
		lst.add("Ana Paula");
		lst.add("Felipe Tristão");
		
		System.out.println(name + " acaba de ser atendido");
		
		String pref = lst.remove(2);
		
		
	}
}
