public class PhilosophesDinner 
{
	private Table table= new Table();
	private Runnable vPhilosopher[] = { new Philosopher("Platao",     0, table, 0, 1)
										 , new Philosopher("Socrates",   1, table, 1, 2)
										 , new Philosopher("Aristoteles",2, table, 2, 3)
										 , new Philosopher("Eraclito",   3, table, 3, 4)
										 , new Philosopher("Munraaa",    4, table, 4, 0)
										};
	
	
	public void go()
	{
		for (int i = 0; i < vPhilosopher.length; i++) {
			Thread runnable = new Thread(vPhilosopher[i]);
			runnable.start();
		}
	}
	
	public void stop()
	{
		for (int i = 0; i < vPhilosopher.length; i++) {
			((Philosopher) vPhilosopher[i]).done();
		}
	}

}
