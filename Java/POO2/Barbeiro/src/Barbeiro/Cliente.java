package Barbeiro;

public class Cliente implements Runnable {
	
	private Fila fila;
	private Runnable barbeiro;
	private int indice;
	
	public Cliente(Fila fila, Runnable barbeiro) {
		this.fila = fila;
		this.barbeiro = barbeiro;
	}
	
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public int getIndice() {
		return this.indice;
	}
	 
	@Override
	public void run() {
		if (this.fila.filaCheia()) {
			System.out.print("A Fila está cheia, vou embora\n");
			if ( ((Barbeiro) this.barbeiro).cadeiraVazia() ) {
				((Barbeiro) this.barbeiro).cortarCabelo();
			}
		} else {
			this.fila.Add(this);
		
			while(true) {
				Util.waitFor(1000);	 		
				if ( ((Barbeiro) this.barbeiro).estaDormindo()) {
					((Barbeiro) this.barbeiro).acordar();
						((Barbeiro) this.barbeiro).cortarCabelo();
				}
			}
		}
	}
}
