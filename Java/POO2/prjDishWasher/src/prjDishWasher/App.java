package prjDishWasher;

public class App
{

	public static void main(String[] args)
	{
		KitchenWork kw = new KitchenWork( 5, 3, 10);
		kw.go();
		
		Util.waitFor((int)(1000 * 60 * 0.5));
		
		kw.done();
	}
}
