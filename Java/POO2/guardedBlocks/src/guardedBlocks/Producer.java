package guardedBlocks;

public class Producer implements Runnable
{
	LimitedBuffer<Product> buff;
	volatile boolean isAlive = false;
	
	public Producer(LimitedBuffer<Product> buff)
	{
		this.buff = buff;
	}
	
	public void run()
	{
		isAlive = true;
		while(isAlive)
		{
			buff.put(new Product());
		}
		System.out.printf("%s finished producer\n", Thread.currentThread().getName());
	}
	
	public void stop()
	{
		this.isAlive = false;
	}
}