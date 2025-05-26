
public class Child1 implements Inf1,Inf2
{

	@Override
	public void display() {
		Inf1.super.display();
		Inf2.super.display();

	}
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.display();
	}

}
