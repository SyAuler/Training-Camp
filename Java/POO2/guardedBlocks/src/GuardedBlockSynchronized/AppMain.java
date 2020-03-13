package GuardedBlockSynchronized;

public class AppMain 
{

	public static void main(String args[]) throws InterruptedException
	{
		LimitedBufferUnsafe<Product> buff = new LimitedBufferUnsafe<>(Product[].class, 10);
		
		ProducerSynchronized vProducer[] = new ProducerSynchronized[2];
		for(int i=0; i<vProducer.length; i++)
			vProducer[i] = new ProducerSynchronized(buff);
		
		ConsumerSynchronized vConsumer[] = new ConsumerSynchronized[10];
		for(int i=0; i<vConsumer.length; i++)
			vConsumer[i] = new ConsumerSynchronized(buff);
		
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
		
		for(ProducerSynchronized p : vProducer)
			p.stop();
		for(ConsumerSynchronized c : vConsumer)
			c.stop();
		
		System.out.printf(" %s finished \n", Thread.currentThread().getName());
	}
}
