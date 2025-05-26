//Child-class , Sub-class , Derived class
public class Bike extends Vehicle
{ 
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.model="R15";
		b1.color="Blue";
		b1.price=235000;
		b1.details();
	}

}
class Truck extends Vehicle
{ 
	public static void main(String[] args) {
		Truck b1=new Truck();
		b1.model="T";
		b1.color="Blue";
		b1.price=235000;
		b1.details();
	}

}
