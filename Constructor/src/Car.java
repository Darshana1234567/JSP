public class Car
{
	//Properties
	String name;
	String color;
	double price;
	
	//User-defined 
	//parameter constructor
	Car(String n,String c,double p)
	{
		name=n;
		color=c;
		price=p;
	}
	void carDetails()
	{
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Price = "+price);
		System.out.println();

	}
	public static void main(String[] args) {
		Car c1=new Car("Nexon","White",1845000);
		Car c2=new Car("Civic","Purple",1565000);
		c2.carDetails();
		c1.carDetails();

	}
	

}
