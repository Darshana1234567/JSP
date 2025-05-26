public class Demo6 
{
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			InvalidAgeException iae=new InvalidAgeException();
			throw iae;
		}
	}
	public static void main(String[] args) {
		try {
			validateAge(12);
		} catch (InvalidAgeException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
