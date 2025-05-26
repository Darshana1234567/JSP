public class Student 
{
	private String name;
	private int age;
	private double percentage;
	//Setter Methods(Write operation)
	public void setName(String n)
	{
		name=n;
	}
	public void setAge(int a)
	{
		if(a>=1 && a<=100)
		{
			age=a;
		}
		else
		{
			System.out.println("Invalid age");
		}
	}
	public void setPercentage(double p)
	{
		if(p>=0&&p<=100)
		{
			percentage=p;
		}
		else
		{
			System.out.println("Invalid Percentage");
		}
	}
	//Getter methods(Read Operation)
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getPercentage()
	{
		return percentage;
	}
}














