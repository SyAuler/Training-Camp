package dados;

public class Mecanicos implements java.io.Serializable {

	private String nome;
	private String cpf;
	private String telefone;
	private double valorHora;
	private double salarioFixo;
	
	public Mecanicos(String nome, String cpf, String telefone, double valorHora, double salarioFixo) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.valorHora = valorHora;
		this.salarioFixo = salarioFixo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	
	
}
