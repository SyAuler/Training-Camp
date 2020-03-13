package GuardedBlockSynchronized;

public class Product
{
	private static int productCode=0;
	private static Object lock = new Object();
	
	private final int code;
	
	public Product()
	{
		synchronized(lock)
		{
			this.code = ++productCode;
			//System.out.println(this.code);
		}
	}
	
	public final int getCode()
	{
		return code;
	}
	
	public static final int actualProductCode()
	{
		return productCode;
	}	
}
