public interface Test 
{
	default void display()
	{
		System.out.println("Concrete-Method from Interface");
	}
}
