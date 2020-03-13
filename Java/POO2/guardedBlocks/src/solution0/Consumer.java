package solution0;

import java.util.concurrent.atomic.AtomicInteger;

public class Consumer implements Runnable
{
	LimitedBuffer<Product> buff;
	volatile boolean isAlive = false;
	long count = 0;
	
	public Consumer(LimitedBuffer<Product> buff)
	{
		this.buff = buff;
	}
	
	public void run()
	{
		isAlive = true;
		while(isAlive)
		{
			try 
			{
				Product p=null;
				synchronized(buff)
				{
					p = buff.get();
				}
				System.out.println(p.getCode());
				++count;
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
		System.out.printf("%s_finished consumed %d\n",Thread.currentThread().getName(),count);
	}
	
	public void stop()
	{
		this.isAlive = false;
	}
}

