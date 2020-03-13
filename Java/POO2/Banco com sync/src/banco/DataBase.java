package banco;

import java.util.ArrayList;

public class DataBase {

	ArrayList<Account> accounts = new ArrayList<>(10);
	
	public void add(Account conta) {
		this.accounts.add(conta);
	}
	
	public Account getAccount(int id) {
		
		for(Account account : accounts) {
			if (account.getNumIdentificacao() == id) {
				return account;
			}
		}
		return null;
	}
}
