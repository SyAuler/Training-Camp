package Barbeiro;


public class Tasks {
	
	public void go()
	{
		int cadeiras = 5;
		Fila fila = new Fila(cadeiras);
		
		Cadeira cadeira = new Cadeira(0);
		
		Runnable run = new Barbeiro(fila, cadeira);
		Thread barbeiro = new Thread(run);
		barbeiro.start();
		
		while (true) {
			Util.waitFor(1000 * 6);
			Runnable run2 = new Cliente(fila, run);
			Thread cliente = new Thread(run2);
			cliente.start();
		}
	}

	public void stop(){
		
		
	}
}
