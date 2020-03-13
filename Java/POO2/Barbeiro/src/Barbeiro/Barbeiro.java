package Barbeiro;

public class Barbeiro implements Runnable {
	
	private Fila fila;
	private Boolean cortando = false;
	private Boolean dormindo = false;
	private Cadeira cadeira;
	
	public Barbeiro(Fila fila, Cadeira cadeira) {
		this.fila = fila;
		this.cadeira = cadeira;
	}
	
	public void cortarCabelo() {		
        System.out.println("Cortando cabelo");
        this.cadeira.clienteUsando();
        cortando = true;
        try {
        	Util.waitFor(1000 * 6);
            System.out.println("Terminei de cortar o cabelo");
            this.fila.proximo();
            cortando = false;
        }
        catch(Exception e){e.printStackTrace();}
    }
	
	public void dormir() {
		System.out.println("Não tem ninguém, vou dormir");
		this.dormindo = true;
		this.cadeira.barbeiroDormindo();
        while(this.dormindo) {
        	Util.waitFor(1000);
        }
	}
	
	public void acordar() {
		this.dormindo = false;
		this.cadeira.cadeiraVazia();
	}
	
	public Boolean estaDormindo() {
		return this.dormindo;
	}
	
	public Boolean cadeiraVazia() {
		return this.cadeira.cadeiraVazia();
	}
	
	@Override
	public void run() {
		while(true) {
			Util.waitFor(1000);	 	
			if (this.fila.filaVazia()) {
				dormir(); 
			}
		}
	}
}
