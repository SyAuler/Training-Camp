package Barbeiro;


public class Cadeira {

	public static int status;
	
	public Cadeira(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}
	
	public Boolean cadeiraVazia() {
		return this.status == 0;
	}
	
	public Boolean barbeiroDormindo() {
		return this.status == 1;
	}
	
	public Boolean clienteUsando() {
		return this.status == 2;
	}
}
