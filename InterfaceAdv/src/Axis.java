
public class Axis implements Upi
{
	@Override
	public void sendMoney() 
	{
       System.out.println("Money Sent(Axis)");		
	}

	@Override
	public void checkBalance() 
	{
	  System.out.println("Balance-Checked(Axis)");	
	}
	

}
