//implementation class
public  class  Dog extends Animal
{
	Dog(String n,String c)
	{
	  super(n,c);	
	}
	@Override
	void sound() 
	{
		System.out.println("Bark");
	}
	public static void main(String[] args) {
		Dog d1=new Dog("Max","Gold");
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.age);
	}
	

}
