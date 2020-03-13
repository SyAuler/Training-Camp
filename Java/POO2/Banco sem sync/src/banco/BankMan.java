package banco;

public class BankMan implements Runnable {

	// precisa ter uma conta, metodo saque e metodo deposito
	private Account conta;
	private boolean done;
	
	public BankMan(Account conta) {
		this.conta = conta;
	}
	
	public void saque(float valor) {
		conta.saque(valor);
	}
	
	public void deposito(float valor) {
		conta.deposito(valor);
	}
	
	public void done() {
		this.done = true;
	}
	
	@Override
	public void run() {
		done = false;
		
		while(!done) {
			
			conta.saque(10);
			System.out.print("\nFazendo Saque " + conta.saque(0));
			
			conta.deposito(10);
			System.out.print("\nFazendo Deposito " + conta.saque(0));
		}
	}
}
