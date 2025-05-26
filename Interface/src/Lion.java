public class Lion implements Animal,Animal2{

	@Override
	public String sound() 
	{
      return "Roar";		
	}
	public static void main(String[] args) {
		Lion l1=new Lion();
		System.out.println(l1.sound());
		System.out.println(l1.name);//Error Ambiguity
		System.out.println(l1.age);
	}

}
