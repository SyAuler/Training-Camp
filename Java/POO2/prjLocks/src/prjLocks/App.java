package prjLocks;

public class App 
{
	private static int x=0;
	private static int y=0;
	
	private static class ClassA
	{
		private Object lock = new Object();
		public void methodA()
		{
			synchronized (lock)
			{
				x++; x--;
			}
		}
		
		public void methodB()
		{
			synchronized (lock)
			{
				y++; y--;
			}
		}
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		Thread vt[] = new Thread[10];
		for(int i=0; i<10; i++)
		{
			vt[i]= new Thread(new Runnable()
			{
				ClassA ca = new ClassA();
				
				public void run()
				{
					for(int k=0; k<1000000; k++)
					{
						ca.methodA();
						ca.methodB();
					}
				}
			});
		}
		
		for(Thread t : vt)
			t.start();
		
		for(Thread t : vt)
			t.join();
		
		System.out.printf("\nx: %d y: %d", x, y);
	}
}
