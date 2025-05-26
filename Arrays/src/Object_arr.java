//object type array 
public class Object_arr {
String name;
int age ;
public Object_arr(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return name;
}

}
class Main
{
	public static void main(String[] args) {
		try
		{
		Object_arr[] obj;
		obj = new Object_arr[3];
		obj[0]= new Object_arr("Rahul", 12);
		obj[1]= new Object_arr("Raj", 12);
		obj[2]= new Object_arr("Vijay", 22);

		for (Object_arr m :obj)
		{
			System.out.println(m);
		}
//		for (int i=0;i<obj.length;i++)
//		{
//			System.out.println(obj[i].name + obj[i].age);
//		}
	}catch(IndexOutOfBoundsException e)
		{
		System.out.println(e);
		}
		
	}
	
}
