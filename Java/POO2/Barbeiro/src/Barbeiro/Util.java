package Barbeiro;

public class Util {
	public static void waitFor(long milis)
	{
		try
		{
			Thread.sleep(milis); // est� suspenso, n�o est� consumindo recursos da maquina
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	public static void workHardFor(long milis) // n�o faz nada, mas fica processando um numero de vezes at� ser chamado(esta utilizando uma thread)
	{
		long t0 = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - t0 < milis)
			;
	}
}
