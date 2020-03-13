package banco;


public class Bank {

	DataBase database;
	BankMan bm1, bm2, bm3, bm4;
	
	public Bank() {
		
		database = new DataBase();
		Account account = new Account(
			"12345", "simone", "098765432198");
		database.add(account);
	
		bm1 = new BankMan(account);
		bm2 = new BankMan(account);
		bm3 = new BankMan(account);
		bm4 = new BankMan(account);
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
