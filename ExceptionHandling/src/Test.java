
public class Test 
{
	public static void main(String[] args) {
		System.out.println("Program-started");
		try
		{
			System.out.println("Try-Block-start");
			System.out.println(100/0);//Risky
			System.out.println("Try-Block-Ended");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch-Block");
		}
		System.out.println("Program-ended");
	}

}
