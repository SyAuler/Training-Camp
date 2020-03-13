package prjDishWasher;

public class Drainer implements DishRack
{
	private LimitedBuffer<Dish> buffer;
	
	public Drainer(final int capacity)
	{
		this.buffer = new LimitedBuffer<>(capacity);
	}

	@Override
	public boolean putDish(Dish dish)
	{
		while ( isFull() )
			Util.waitFor(10);
		
		synchronized (this.buffer)
		{
			return this.buffer.put(dish);
		}
	}

	@Override
	public Dish getDish()
	{
		while(isEmpty() )
			Util.waitFor(10);
		
		synchronized(this.buffer)
		{	
			return this.buffer.take();
		}
	}
	
	@Override
	public boolean isEmpty()
	{
		synchronized (this.buffer)
		{
			return this.buffer.isEmpty();
		}
	}

	@Override
	public boolean isFull()
	{
		synchronized (this.buffer)
		{
			return this.buffer.isFull();
		}
	}
}
