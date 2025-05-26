//Multiple Risky-code
public class Demo2 
{
	public static void main(String[] args) {
		System.out.println("Program-started");
		try
		{
			System.out.println("Try-Block-start");
			System.out.println(100/10);//Risky(Arithematic)
			int x[]= {};
			System.out.println(x[3]);//Risky(ArrayIndex)
			System.out.println("Try-Block-Ended");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch-Block 2");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch-Block 1");
		}
		
		System.out.println("Program-ended");
	}
}
