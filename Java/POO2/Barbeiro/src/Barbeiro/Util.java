package Barbeiro;

public class Util {
	public static void waitFor(long milis)
	{
		try
		{
			Thread.sleep(milis); // está suspenso, não está consumindo recursos da maquina
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	public static void workHardFor(long milis) // não faz nada, mas fica processando um numero de vezes até ser chamado(esta utilizando uma thread)
	{
		long t0 = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - t0 < milis)
			;
	}
}
