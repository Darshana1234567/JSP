public class Employee 
{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
     public String toString()
     {
    	 return name+" "+salary+" "+super.toString();
     }
	public static void main(String[] args) {
		Employee e1=new Employee("Raj",25000);
		//System.out.println(e1);//e1.toString()
		System.out.println(e1.toString());
	}

}
