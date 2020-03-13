package prjDishWasher;

public class KitchenAssistant implements Runnable
{
	private DishRack dishRack;
	private CleanDishes repository;
	private boolean done;
	
	public KitchenAssistant (DishRack dishRack, CleanDishes repository)
	{
		this.dishRack = dishRack;
		this.repository = repository;
	}

	public void done()
	{
		this.done = true;
	}
	
	private void dryDish(Dish dish)
	{
		System.out.printf("%s enxugando o prato %d\n", Thread.currentThread().getName(), dish.getId());
		Util.workHardFor(25);
	}
	
	@Override
	public void run()
	{
		Util.waitFor(10);
		
		done = false;
		while(!done || !dishRack.isEmpty())
		{			
			Dish dish = null;
			
			while(dish==null)
			{				
				dish = dishRack.getDish();
				if(!(dish==null))
					Util.waitFor(2);				
			}
				
			
			this.dryDish(dish);
		
			repository.putDish(dish);
		}
		System.out.printf("%s terminou enxugador", Thread.currentThread().getName());
	}	
}
