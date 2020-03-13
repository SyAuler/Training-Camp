package guardedBlocks;

public class AppMain 
{

	public static void main(String args[]) throws InterruptedException
	{
		LimitedBuffer<Product> buff = new LimitedBuffer<>(Product[].class, 10);
		
		Producer vProducer[] = new Producer[2];
		for(int i=0; i<vProducer.length; i++)
			vProducer[i] = new Producer(buff);
		
		Consumer vConsumer[] = new Consumer[10];
		for(int i=0; i<vConsumer.length; i++)
			vConsumer[i] = new Consumer(buff);
		
		Thread vtProducer[] = new Thread[vProducer.length];
		for(int i=0; i<vProducer.length; i++)
		{
			vtProducer[i] = new Thread(vProducer[i]);
			vtProducer[i].start();
		}
		
		Thread vtConsumer[] = new Thread[vConsumer.length];
		for(int i=0; i<vConsumer.length; i++)
		{
			vtConsumer[i] = new Thread(vConsumer[i]);
			vtConsumer[i].start();
		}
		while (Product.actualProductCode() < 10000)
		{
			Thread.sleep(10);
		}
		
		for(Producer p : vProducer)
			p.stop();
		for(Consumer c : vConsumer)
			c.stop();
		
		System.out.printf("%s finished \n", Thread.currentThread().getName());
	}
}
