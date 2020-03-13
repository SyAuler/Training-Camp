package guardedBlocks;

public class Consumer implements Runnable
{
	LimitedBuffer<Product> buff;
	volatile boolean isAlive = false;
	
	public Consumer(LimitedBuffer<Product> buff)
	{
		this.buff = buff;
	}
	
	public void run()
	{
		isAlive = true;
		while(isAlive)
		{
			Product p = buff.get(); 
			//System.out.printf("%d %s\n",p.getCode(), Thread.currentThread().getName());
		}
		System.out.printf("%s finished consumer\n", Thread.currentThread().getName());
	}
	
	public void stop()
	{
		this.isAlive = false;
	}
}