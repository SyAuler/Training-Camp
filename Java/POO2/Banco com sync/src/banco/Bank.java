package banco;


public class Bank {

	DataBase database;
	BankMan bm1, bm2, bm3, bm4;
	
	public Bank() {
		
		database = new DataBase();
		Account account = new Account("12345", "simone", "098765432198");
		Account account1 = new Account("43287", "cezar", "098765432198");
		Account account2 = new Account("56907", "botaro", "098765432198");
		Account account3 = new Account("20974", "maria", "098765432198");
		
		database.add(account);
		database.add(account1);
		database.add(account2);
		database.add(account3);
	
		bm1 = new BankMan(account);
		bm2 = new BankMan(account1);
		bm3 = new BankMan(account2);
		bm4 = new BankMan(account3);
	}
	
	public void go() {
		new Thread(bm1).start();
		new Thread(bm2).start();
		new Thread(bm3).start();
		new Thread(bm4).start();
	}
	
	public void done() {
		bm1.done();
		bm2.done();
		bm3.done();
		bm4.done();
	}
}
