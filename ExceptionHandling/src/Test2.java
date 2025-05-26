//No Exception occured
public class Test2 
{
	public static void main(String[] args) {
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
