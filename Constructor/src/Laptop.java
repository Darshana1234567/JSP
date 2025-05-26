public class Laptop 
{
	String model;
	String color;
	double price;
	Laptop(String model,String color,double price)
	{
		this.model=model;
		this.model=color;
		this.price=price;
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop("Inspiron","Silver",65000);
		System.out.println(l1.model+" "+l1.color+" "+l1.price);
	}

}
