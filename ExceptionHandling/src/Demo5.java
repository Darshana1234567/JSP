public class Demo5
{
	static void loadClass(String className)throws ClassNotFoundException,ArithmeticException 
	{
		Class.forName(className);
	}
	public static void main(String[] args) {
		try {
			loadClass("Demo40");
			System.out.println("Class loaded");
		} catch (Exception e) {
			System.out.println("Provide Correct class name");
		}
	}

}
