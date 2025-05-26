//Generalized catch block
public class Demo3 
{
	public static void main(String[] args) {
		System.out.println("Program-started");
		try
		{
			System.out.println("Try-Block-start");
			System.out.println(100/0);//Risky(Arithematic)
			int x[]= {};
			System.out.println(x[3]);//Risky(ArrayIndex)
			System.out.println("Try-Block-Ended");
		}
		catch(Throwable e)
		{
			System.out.println("Catch-Block 1");
			System.out.println(e);
		}
		
		System.out.println("Program-ended");
	}

}
