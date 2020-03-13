package prjDishWasher;

public interface DishRack
{
	public boolean putDish(Dish dish);
	public Dish getDish();
	public boolean isEmpty();
	public boolean isFull();
}
