import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
	   try
	   {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter numerator");
			int x=sc.nextInt();
			System.out.println("Enter Denominator");
			int y=sc.nextInt();
			int res=x/y;//Risky-code
			System.out.println(res);
	   }
	   catch(ClassCastException a)
	   {
		   System.out.println("Denominator must be non-zero");
	   }
		System.out.println("End");

}
}