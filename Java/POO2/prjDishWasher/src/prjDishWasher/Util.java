package prjDishWasher;
public class Util 
{
	
	public static void waitFor(long milis)
	{
		try
		{
			Thread.sleep(milis);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	public static void workHardFor(long milis)
	{
		long t0 = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - t0 < milis)
			;
	}

}
