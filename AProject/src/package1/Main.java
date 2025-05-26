package package1;
public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Different class,same package");
		Watch w2=new Watch();
		System.out.println(w2.model+" "+w2.price);
		w2.display();
	}

}
