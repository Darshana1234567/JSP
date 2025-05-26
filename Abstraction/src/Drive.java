public abstract class Drive {
     static int a = 10 ;
	public  abstract void driving();
	public void playMusic()
	{
		System.out.println("Play music");
	}
	
}
class WagnoR extends Drive 
{
	public void driving()
	{
		System.out.println(a);
		System.out.println("Driving WagnoR");
	}
}
 class Check2
{
public static void main(String[] args) {
	Drive w = new WagnoR();
	w.driving();
	w.playMusic();
	System.out.println(w.a);
}	
}