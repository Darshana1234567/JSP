package package2;
import package1.Watch;
public class Child extends Watch
{
	public static void main(String[] args) {
		Child w1=new Child();
		System.out.println(w1.model+" "+w1.price);
		w1.display();
	}
}
