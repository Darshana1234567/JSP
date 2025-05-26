public class Person {
	 void override_ex ()
	{
		System.out.println("you are in parent method");
	}
}

class Student extends Person 
{
	public static void main(String[] args) {

	Student s1 = new Student();
	s1.override_ex();
	System.out.println("you are in child student method");
	}
}

class Employee1 extends Person 
{
	@Override
	public void override_ex()
	{
		System.out.println("you are in child Employee method");

	}
	public static void main(String[] args) {
	Employee1 s1 = new Employee1();
	s1.override_ex();	
	}
}

