package banco;

import java.util.Date;

public class Operation {

	static public enum Type {SAQUE, DEPOSITO};
	
	private Type tipo;
	private float valor;
	private Date data;
	
	
	public Operation(Type tipo, float valor) {
		this.tipo = tipo;
		this.valor = valor;
		this.data = new Date();		
	}
	
	public Type getTipo() {
		return this.tipo;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public Date getDate() {
		return this.data;
	}
}
