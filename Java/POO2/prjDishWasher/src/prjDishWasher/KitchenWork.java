package prjDishWasher;


public class KitchenWork
{
	private DishWasher[] washers;
	private KitchenAssistant[] assistants;
	
	private DishRack dishRack;
	private CleanDishes cleanDishes;
	
	
	public KitchenWork( int numberOfDishWashers, 
			            int numberOfKitchenAssistants, 
			            int dishRackCapacity )
	{
		this.dishRack = new Drainer(dishRackCapacity);
		
		// the interface has a default method,
		// so we will instantiate it as an anonymous class
		DishesToWash dishesToWash = new DishesToWash(){};
		
		// and equal to CleanDishesRepository
		this.cleanDishes = new CleanDishes(){};
		
		this.washers = new DishWasher[numberOfDishWashers];
		for(int i = 0; i<numberOfDishWashers; i++ )
			washers[i] = new DishWasher(dishesToWash, dishRack);
		
		
		
		this.assistants = new KitchenAssistant[numberOfKitchenAssistants];
		for(int i=0; i<numberOfKitchenAssistants; i++)
			assistants[i] = new KitchenAssistant(dishRack, cleanDishes);
	}
	
	public void go()
	{
		for(DishWasher w : this.washers)
			new Thread(w).start();
		
		for(KitchenAssistant ka : this.assistants)
			new Thread(ka).start();
	}
	
	public void done()
	{
		for(DishWasher w : this.washers)
			w.done();
		
		for(KitchenAssistant ka : this.assistants)
			ka.done();
	}
}
