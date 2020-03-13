package prjDishWasher;

public class LimitedBuffer<T>
{

	private Object[] buff;
	private int size = 0;
	private int posPut = 0;
	private int posTake = 0;

	public LimitedBuffer(int capacity)
	{
		this.buff = new Object[capacity];
	}

	public boolean isFull()
	{
		return (this.size == this.buff.length);
	}

	public boolean isEmpty()
	{
		return this.size == 0;
	}

	public boolean put(T obj)
	{		
		
		if(isFull())
			return false;
		
		if (posPut < buff.length)
			buff[posPut] = obj;
		else
		{
			posPut = 0;
			buff[posPut] = obj;
		}
		posPut++;
		size++;
		
		return true;
		
	}

	public T take() 
	{
		Object obj = null;
		
				
		if(isEmpty())
			return null;
		
		if(posTake < buff.length){
			obj = buff[posTake];
		}
			
		else
		{
			posTake = 0;
			obj = buff[posTake];
		}	
		buff[posTake] = null;
		posTake++;
		size--;
		
		return (T) obj;
	}

}
