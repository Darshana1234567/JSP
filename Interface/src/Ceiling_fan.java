public class Ceiling_fan extends Fan{

	public Ceiling_fan(String brand, String color, double price) {
		super(brand, color, price);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Ceiling_fan t = new Ceiling_fan("Hartaj","White", 23444.4);
		t.display();
		t.Off();
		t.IncSpeed();
	}

	
}
