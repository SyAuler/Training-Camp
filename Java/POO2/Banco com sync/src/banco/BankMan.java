package banco;

import java.util.Random;

public class BankMan implements Runnable {

	// precisa ter uma conta, metodo saque e metodo deposito
	private Account conta;
	private boolean done;
	
	public BankMan(Account conta) {
		this.conta = conta;
	}
	
	public synchronized float saque(float valor) {
		return conta.saque(valor);
		
	}
	
	public synchronized float deposito(float valor) {
		return conta.deposito(valor);
	}
	
	public void done() {
		this.done = true;
	}
	
	@Override
	public void run() {
		done = false;
		
		while(!done) {
			Util.waitFor(2000);
			Random gerador = new Random();
			
			int dep = gerador.nextInt(10);
			if(dep > 0) {
				System.out.print("\nFazendo Depósito na conta: " + conta.getNumIdentificacao() 
							+ "\n	Valor do depósito: " + dep + "\n		Saldo: " + conta.deposito(dep) + "\n" );
			}
			
			int saq = gerador.nextInt(10);
			if(saq > 0) {
				System.out.print("\nFazendo Saque na conta: " + conta.getNumIdentificacao() 
				+ "\n	Valor do saque: " + saq + "\n		Saldo: " + conta.saque(saq) + "\n" );
			}
		}
	}
}
