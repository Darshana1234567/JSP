import java.util.*;
public class Demo_Arraylist {
	public static void main(String[] args) {
		ArrayList e1 = new ArrayList(2);
		ArrayList e2 = new ArrayList(1);
		ArrayList e3 = new ArrayList(3);
		ArrayList emp_details = new ArrayList(3);

		e1.add("Darshana");
		e2.add("Rahul");
		e3.add("Raj");
		e1.add(12);
		e2.add(13);
		e3.add(14);
		e1.add(345555);
		e2.add(32566);
		e3.add(45555);
		
		emp_details.addAll(e1);
		emp_details.addAll(e2);
		emp_details.addAll(e3);
		ArrayList test = new ArrayList(emp_details);
		System.out.println("Printing the arraylist " + test);
		Vector v = new Vector(test);
		System.out.println("Printing the vector " + v);
		Vector v1 = new Vec
				tor(0, 1);
		v1.add("hi");
		v1.add("hello");
		v1.add("bye");
		v1.add("check");
		v1.add("check");
		v1.add("check");
		v1.add("check");
		v1.add("check");
		v1.add("check");
		v1.add("check");
		System.out.println("printing the vector inc " + v1);
		
		

		
	}

	@Override
	public String toString() {
		return "name : +name ";
	}

}
