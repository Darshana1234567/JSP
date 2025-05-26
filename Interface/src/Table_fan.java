public class Table_fan extends Fan{

	public Table_fan(String brand, String color, double price) {
		super(brand, color, price);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Table_fan t = new Table_fan("Bajaj","White", 23444.4);
		t.display();
		t.On();
		t.DescSpeed();
	}

	
}
