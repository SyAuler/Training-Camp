
public class App 
{
	
	public static void main(String args[])
	{
		/* Runnable runnable = new Runnable(); */
		PhilosophesDinner pd = new PhilosophesDinner();
		pd.go();
		
		Util.waitFor(1000 * 60 * 5);
		
		pd.stop();
	}
}
