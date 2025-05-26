public class Lcd_TV extends TV{

	public Lcd_TV(String brand, int size, double price) {
		super(brand, size, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Lcd_TV l = new Lcd_TV("Sony",22 , 234555);
		l.display();
		l.Off();
	}
}
