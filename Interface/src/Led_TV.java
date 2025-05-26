public class Led_TV extends TV{

	public Led_TV(String brand, int size, double price) {
		super(brand, size, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Led_TV l = new Led_TV("One Plus",23 , 234444);
		l.display();
		l.On();
	}
}
