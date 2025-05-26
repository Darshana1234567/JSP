
public class Icici implements Upi
{
	@Override
	public void sendMoney() 
	{
       System.out.println("Money Sent(ICICI)");		
	}

	@Override
	public void checkBalance() 
	{
	  System.out.println("Balance-Checked(ICICI)");	
	}
	

}
