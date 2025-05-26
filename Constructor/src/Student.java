
public class Student {
    String name ; 
    String qualification;
    int    year;
	public Student(String n , String q , int y) {
		// TODO Auto-generated constructor stub
		name = n;
		qualification = q; 
		year = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1 = new Student("Rahul", "B.Tech", 2015);
   System.out.println(s1.name+"  "+s1.qualification+ " "+ s1.year);
   Student s2 = new Student("Raj", "B.com", 2014);
   System.out.println(s2.name+"  "+s2.qualification+ " "+ s2.year);
	}

}
