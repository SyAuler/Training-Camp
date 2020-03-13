package solution0;

public class Product
{
	private static volatile int productCode=0;
	private static Object lock = new Object();
	private final int code;
	
	public Product()
	{
		synchronized(lock)
		{
			this.code = ++productCode;
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

