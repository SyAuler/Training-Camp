package banco;

public class App {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.go();
		System.out.print("\nIniciou");
		Util.waitFor(10000);
		
		bank.database.getAccount(0);
		System.out.print("\nSaldo " + bank.database.getAccount(0));
		bank.done();
	}
}
