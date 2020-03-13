package banco;

public class Account {

	static int id = 0;
	
	private int numIdentificacao = ++id; //incrementa antes de atribuir
	private float saldo = 0;
	private String conta;
	private String nome;
	private String cpf;
	
	Operation operacao = new Operation(null, 0);
	DataBase database = new DataBase();
	
	public Account(String conta, String nome, String cpf) {
		this.conta = conta;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getNumIdentificacao() {
		return numIdentificacao;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public float saque(float valor) {
		
		//if (getSaldo() == 0 && getSaldo() > valor) {
			saldo -= valor;
		//} 
		return saldo;
	}
	
	
	public float deposito(float valor) {
		saldo += valor;
		return saldo;
	}
	
	/*
	public float deposito(float valor) {
		
		if (getNumIdentificacao() == database.getAccount()) {
			return getSaldo() + valor;
		} 
		return getSaldo();
	}
	*/
}
