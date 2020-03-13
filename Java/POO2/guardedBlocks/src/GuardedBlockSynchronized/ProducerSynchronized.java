package GuardedBlockSynchronized;

public class ProducerSynchronized implements Runnable
{
	LimitedBufferUnsafe<Product> buff;
	volatile boolean isAlive = false;
	
	public ProducerSynchronized(LimitedBufferUnsafe<Product> buff)
	{
		this.buff = buff;
	}
	
	public void run()
	{
		isAlive = true;
		while(isAlive)
		{
			synchronized(buff) {
				while (buff.isFull()) {
					try {
						buff.notifyAll();
						buff.wait(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}			
				} 
				if (isAlive) {
					buff.put(new Product());
				}
				buff.notifyAll();	
			}
		}
		System.out.printf(" %s finished producer\n", Thread.currentThread().getName());
	}
	
	public void stop()
	{
		this.isAlive = false;
	}
}