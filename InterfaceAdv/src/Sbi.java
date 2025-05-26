
public class Sbi implements Upi
{
	@Override
	public void sendMoney() 
	{
       System.out.println("Money Sent(SBI)");		
	}

	@Override
	public void checkBalance() 
	{
	  System.out.println("Balance-Checked(SBI)");	
	}
	

}
