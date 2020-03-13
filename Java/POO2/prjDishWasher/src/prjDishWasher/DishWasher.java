package prjDishWasher;


public class DishWasher implements Runnable
{
	private DishesToWash dishToWash;
	private DishRack dishRack;
	private boolean done;
	
	public DishWasher( DishesToWash dishToWash, DishRack dishRack )
	{
		this.dishToWash = dishToWash;
		this.dishRack = dishRack;		
	}

	public void done()
	{
		this.done = true;
	}
	
	private void clean(Dish dish)
	{
		System.out.printf("%s lavando o prato %d\n", Thread.currentThread().getName(), dish.getId());
		switch(dish.getDirtyLevel())
		{
		case LITTLE_DIRTY:
			Util.workHardFor(10);
			break;
		case DIRTY:
			Util.workHardFor(20);
			break;		
		case VERY_DIRTY:
		default:
			Util.workHardFor(50);
			break;
		}
	}
	
	@Override
	public void run()
	{
		done = false;
		while(!done)
		{
			Dish dish = dishToWash.getDish();
			this.clean(dish);
			
			while (!dishRack.putDish(dish)) {
				Util.waitFor(2);
				
			}
		}
		System.out.printf("%s terminou lavador", Thread.currentThread().getName());
	}
}
