
public class Test5 
{
	public static void main(String[] args) 
	{
		System.out.println(100/0);
		try
		{
			System.out.println("Try-Block");
		}
		catch(Exception e)
		{
			System.out.println("Catch-block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
