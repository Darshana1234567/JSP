public class Atm 
{
	public static void main(String[] args) {
		int balance=75000;
		int amount = 100000;
	   if (amount <= balance)
	   {
		   balance = balance - amount ;
			System.out.println(balance);
	   }
	   else 
		   {
		   InsufficientBalanceException ibe = new InsufficientBalanceException();
		   throw ibe;
		   }
		
	}

}
