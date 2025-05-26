import java.util.Scanner;

public class Employee 
{
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		System.out.println("Object Initialized");
	}
	public static void main(String[] args) {
		Scanner sc=null;
		try
		{
			 sc=new Scanner(System.in);
			 System.out.println("Connection Established");
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			int sal=sc.nextInt();
			Employee e1=new Employee(name, sal);
		}
		catch (Exception e) 
		{
			System.out.println("Provide Correct input");
		}
		finally {
			sc.close();
			System.out.println("Connection closed");
		}
	}

}
