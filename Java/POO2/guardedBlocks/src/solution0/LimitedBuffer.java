package solution0;

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
	
	public void put(T obj) throws Exception
	{
		//synchronized(buff)
		{
			if(isFull())
				throw new Exception("buffer is full");
			buff[posInsert] = obj;		
			posInsert = ++posInsert % buff.length;
			++count;
		}
	}
	
	public T get() throws Exception
	{
		T obj = null;
		//synchronized(buff)
		{
			if (isEmpty())
				throw new Exception("buffer is empty");
			
			obj = (T) buff[posRemove];
			posRemove = ++posRemove % buff.length;
			--count;
		}
		return obj;
	}	
	
	public boolean isFull()
	{
		return count == buff.length;
	}
	
	public boolean isEmpty()
	{
		return count == 0;
	}
	public int count()
	{
		return this.count;
	}
}
