package Barbeiro;

public class App {
	
	public static void main(String args[])
	{
		/* Runnable runnable = new Runnable(); */
		Tasks tk = new Tasks();
		tk.go();
		Util.waitFor(1000 * 60 * 5);
		tk.stop();
	}

}
