
public class CalcCo {

	String name;
	int price;
	double desk;
	CalcCo (String n , int p )
	{
		name = n;
		price = p;
		//desk = d;
		System.out.println("in this 1");
		
	}
	CalcCo (String n,double calc )
	{
		this("Raj",12);
		System.out.println("in this");
		
	}
	public static void main(String[] args) {
		CalcCo c1 = new CalcCo("Rahul", 12.0);
		System.out.println(c1.name);
	}
}
Object

