
public class Test6 
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Try-Block");
			System.exit(0);
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
