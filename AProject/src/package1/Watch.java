package package1;//Package Declaration
public class Watch 
{
	protected String model="Sonata";
	protected int price=4500;
	
	protected void display()
	{
		System.out.println(model);
		System.out.println(price);
	}
	public static void main(String[] args) 
	{
		System.out.println("Accessing within same class");
		Watch w1=new Watch();
		System.out.println(w1.model+" "+w1.price);
		w1.display();
	}

}
