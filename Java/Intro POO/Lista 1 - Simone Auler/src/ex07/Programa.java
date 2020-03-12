
package ex07;

public class Programa {
    
    public static void main(String[] args) {
		Funcionario folha[] = new Funcionario[5];
		//Funcionario.reajusteSalario();
		
		folha[0] = new Funcionario(20, "Juca", "A", 8000);
		folha[1] = new Funcionario(21, "Pafuncio", "B", 2000);
		folha[2] = new Funcionario(22, "Ana", "C", 2100);
		folha[3] = new Funcionario(23, "Astor", "D", 3900);
		folha[4] = new Funcionario(24, "Bianca", "A", 6200);
		
		for(Funcionario e : folha) {
			System.out.println(e);
		}		
	}
}
