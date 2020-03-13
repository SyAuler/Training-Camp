package solution0;

public class App
{

	public static void main(String args[]) throws InterruptedException
	{
		LimitedBuffer<Product> buff = new LimitedBuffer<>(Product[].class,10);
		
		Producer vProducer[] = new Producer[2];
		for(int i=0; i<vProducer.length; i++)
			vProducer[i] = new Producer(buff, 100);
		
		Consumer vConsumer[] = new Consumer[5];
		for(int i=0; i<vConsumer.length; i++)
			vConsumer[i] = new Consumer(buff);
		
		Thread vtProducer[] = new Thread[vProducer.length];
		for(int i=0; i<vProducer.length; i++)
			vtProducer[i] = new Thread(vProducer[i]);
		
		for(Thread t: vtProducer)
			t.start();
		
		Thread vtConsumer[] = new Thread[vConsumer.length];
		for(int i=0; i<vConsumer.length; i++)
			vtConsumer[i] = new Thread(vConsumer[i]);
		
		for(Thread t: vtConsumer)
			t.start();
		
		for(Thread t : vtProducer)
			t.join();
		
		System.out.printf("last code %d\n", Product.actualProductCode());
		
		while (!buff.isEmpty())
		{
			Thread.sleep(10);
		}
		
		for(Consumer c : vConsumer)
			c.stop();
		
		for(Thread t : vtConsumer)
			t.join();
		
		System.out.printf("Last Product Code %d\n", Product.actualProductCode());
		System.out.printf("%s finished \n", Thread.currentThread().getName());
	}
}
