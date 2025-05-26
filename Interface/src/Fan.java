public class Fan implements Iregulator , ISwitch {
String brand;
String color;
double price;

public Fan(String brand, String color, double price) {
	super();
	this.brand = brand;
	this.color = color;
	this.price = price;
}


public void display()
{
	System.out.println(" Fan Brand "+brand + " Color "+color +" Price " + price);
}


@Override
public void IncSpeed() {
System.out.println("Increase the speed");	
}


@Override
public void DescSpeed() {
System.out.println("Decrease the speed ");	
}


@Override
public void On() {
	System.out.println("Turn on the Fan");	
	
}


@Override
public void Off() {
	System.out.println("Turn off the Fan");	
	
}



}
