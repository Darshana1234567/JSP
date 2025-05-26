// Multiple catch block with generalized catch block 
public class Demo4 {
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
		catch ( ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		/*
		 * catch ( ArrayIndexOutOfBoundsException e) {
		 * System.out.println("ArrayIndexOutOfBoundsException exception"); }
		 */
		catch(Exception e)
		{
			System.out.println("Exception 1");
			System.out.println(e);
		}
		catch(Throwable e)
		{
			System.out.println("Exception 2");
			System.out.println(e);
		}
		System.out.println("Program-ended");
	}
}
