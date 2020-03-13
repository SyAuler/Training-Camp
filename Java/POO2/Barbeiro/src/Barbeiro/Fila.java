package Barbeiro;

public class Fila {

	private int indice = 0;
	private Cliente[] clientes;
	
	public Fila(int cadeiras) {
		this.clientes = new Cliente[cadeiras];
	}
	
	public Cliente[] getClientes() {
		return clientes;
	}
	
	public void proximo() {
		int menor = 999999;
		for (int i = 0; i < this.clientes.length; i++) {
			if ( this.clientes[i] != null) {
				if (menor > this.clientes[i].getIndice()) {
					menor = this.clientes[i].getIndice();
				}
			}
		}
		for (int i = 0; i < this.clientes.length; i++) {
			if ( this.clientes[i] != null) {
				if (menor == this.clientes[i].getIndice()) {
					this.clientes[i] = null;
					break;
				}
			}
		}
	}
	
	public int getCadeiras() {
		return this.clientes.length;
	}
	
	public Boolean filaCheia() {
		for (int i = 0; i < this.clientes.length; i++) {
			if(this.clientes[i] == null){
				return false;
			}
		}
		return true;
	}
	
	public Boolean filaVazia() {
		for (int i = 0; i < this.clientes.length; i++) {
			if(this.clientes[i] != null){
				return false;
			}
		}
		return true;
	}
	
	public void Add(Cliente cliente) {		
		for (int i = 0; i < this.clientes.length; i++) {
			if(this.clientes[i] == null){
				this.indice += 1;
				System.out.printf("%d Cliente na fila\n", indice);
				this.clientes[i] = cliente;
				this.clientes[i].setIndice(this.indice);
				break;
			}
		}
	}
}
