import java.util.*;
public class Student {

	String name ;
	int age ;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
	Scanner sc = null;
	try
	{
		sc = new Scanner(System.in);
		System.out.println("Name");
		String name = sc.next();
		System.out.println("age");
		int age = sc.nextInt();
		Student s = new Student(name, age);
		}
	catch (Exception e) {
	System.out.println("input correct details");
	}
	finally 
	{
		sc.close();
		System.out.println(" details");

	}
	}
}
