package prjDishWasher;

public interface DishesToWash
{
	public default Dish getDish() 
	{
		double x = Math.random();
		return x < 0.2 ? new Dish(Dish.DirtyType.LITTLE_DIRTY) :
			   x < 0.7 ? new Dish(Dish.DirtyType.DIRTY) :
				   new Dish(Dish.DirtyType.VERY_DIRTY);
		
	}
}
