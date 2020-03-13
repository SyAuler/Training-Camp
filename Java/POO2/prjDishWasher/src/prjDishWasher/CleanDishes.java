package prjDishWasher;

public interface CleanDishes
{
	public default void putDish(Dish dish)
	{
		// nothing to do, let's leave to garbage collector
	}
}
