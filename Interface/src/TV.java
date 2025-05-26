public class TV implements ISwitch {
String brand;
int size;
double price;


public TV(String brand, int size, double price) {
	super();
	this.brand = brand;
	this.size = size;
	this.price = price;
}


public void display()
{
	System.out.println("TV Brand :"+brand + "  Size "+size +"  Price " + price);
}


@Override
public void On() {
	System.out.println("Turn on the TV");
	
}


@Override
public void Off() {
System.out.println("Turn off the TV");	
}
}
