public class Person {

	String name;
	int age;
	long phn;
	Person ( String n , int a , long ph)
	{
		name = n ;
		age = a ;
		phn = ph;
	}
   void personDetails ()
   {
	   System.out.println("Name : " + name);
	   System.out.println("age : " + age);
	   System.out.println("Phone no : " + phn);

   }
   public static void main(String[] args) {
	
}
}
   class Student extends Person {
	  String qual;
	  int year ;
	  double  percentage;
	  Student (String n , int a , long ph, String qual , int y , double p)
	  {
		  super (n,a,ph);
		  this.qual =qual;
		  year = y;
		  percentage = p;
		  
	  }
	  void studentDetails ()
	   {
		  personDetails();
		   System.out.println("Qualification : " + qual);
		   System.out.println("year  : " + year);
		   System.out.println("Percentage : " + percentage);

	   }
  public static void main(String[] args) {
	Student s1 = new Student("Rahul", 21, 1233434, "bcom", 2000, 60d);
	s1.studentDetails ();
}  
  }
 //employee class
   
   class Employee extends Person {
		  int empid;
		  String company ;
		  double  salary;
		  Employee (String n , int a , long ph, int e , String c , double s)
		  {
			  super (n,a,ph);
			  empid =e;
			  company = c;
			  salary = s;
			  
		  }
		  void empDetails ()
		   {
			  personDetails();
			   System.out.println("Employee ID : " + empid);
			   System.out.println("company   : " + company);
			   System.out.println("Salary : " + salary);

		   }
	  public static void main(String[] args) {
		Employee e1 = new Employee("Raj", 21, 1233434, 123, "Oracle" , 6000.0);
		e1.empDetails ();
	}  

   }

