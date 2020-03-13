package prjDishWasher;

//--Immutable--
public final class Dish {
	
	public static enum DirtyType { LITTLE_DIRTY, 
								   DIRTY, 
								   VERY_DIRTY } ;
	//-- class ----------------------------------
	private static volatile int count=0;
	
	//-- instance -------------------------------
	private final DirtyType dirtyLevel;
	private final int id;
	
	public Dish(DirtyType dirtyLevel) {
		
		this.dirtyLevel = dirtyLevel;
		this.id = ++Dish.count;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public DirtyType getDirtyLevel()
	{
		return this.dirtyLevel;
	}
}
