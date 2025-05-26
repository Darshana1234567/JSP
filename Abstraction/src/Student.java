public class Student 
{
	private String name;
	private int age;
	private double percentage;
	public Student(String n,int a,double p)
	{
		name=n;
		if(a>=1 && a<=100)
		{
			age=a;
		}
		else
		{
			System.out.println("Invalid age");
		}
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
