//Exception occured with matching catch-block
public class Test3 
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Try-Block");
			System.out.println(100/0);
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
