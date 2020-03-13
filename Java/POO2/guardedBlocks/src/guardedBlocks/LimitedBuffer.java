package guardedBlocks;

import java.lang.reflect.Array;

public class  LimitedBuffer <T extends Object>
{	
	T buff[];
	volatile int posInsert =0;
	volatile int posRemove =0;
	volatile int count     =0;
	
	public LimitedBuffer(Class<T[]> clazz, int size)
	{
		buff =  clazz.cast(Array.newInstance(clazz.getComponentType(), size));
	}
	
	public void put(T obj)
	{
		synchronized(buff)
		{
			while(! (count < buff.length) )
			{
				try
				{
				//	System.out.printf("%s waiting to put\n", Thread.currentThread().getName());
					buff.wait();
				}
				catch(InterruptedException e)
				{ }
			}
			buff[posInsert] = obj;		
			posInsert = ++posInsert % buff.length;
			++count;
			buff.notifyAll();
		}
	}
	
	public T get()
	{
		synchronized(buff) //trava um tempo aqui
		{
			while( count == 0 )
			{
				try
				{
					System.out.printf("%s waiting to get\n", Thread.currentThread().getName());
					buff.wait();
				}
				catch(InterruptedException e)
				{ }
			}
			T obj = (T) buff[posRemove];
			posRemove = ++posRemove % buff.length;
			--count;
			buff.notifyAll();
			return obj;
		}
	    
	}
	
	public boolean isEmpty()
	{
		return count == 0;
	}
}
