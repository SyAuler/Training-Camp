package solution0;

public class Producer implements Runnable
{
	LimitedBuffer<Product> buff;
	volatile boolean isAlive = false;
	long max;
	long count = 0;
	
	public Producer(LimitedBuffer<Product> buff, long max)
	{
		this.buff = buff;
		this.max = max;
	}
	
	public void run()
	{
		isAlive = true;
		while(isAlive)
		{
			Product p = new Product();	
			while(isAlive)
			{
				try 
				{
					synchronized(buff)
					{
						buff.put(p);
					}
					isAlive = ++count < max;
					break;
				} 
				catch (Exception e) 
				{
					try
					{
						Thread.sleep(1);
					} 
					catch (InterruptedException e1) 
					{
						e1.printStackTrace();
					}
				}
			}
		}
		System.out.printf("%s_finished produced ->count %d\n",Thread.currentThread().getName(), count);
	}
	
	public void stop()
	{
		this.isAlive = false;
	}
}

