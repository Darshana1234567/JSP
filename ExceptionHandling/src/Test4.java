
public class Test4 
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Try-Block");
			System.out.println(100/0);
		}
		catch(ClassCastException e)
		{
			System.out.println("Catch-block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
