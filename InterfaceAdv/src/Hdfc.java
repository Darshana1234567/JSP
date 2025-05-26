
public class Hdfc implements Upi
{

	@Override
	public void sendMoney() 
	{
       System.out.println("Money Sent(HDFC)");		
	}

	@Override
	public void checkBalance() 
	{
	  System.out.println("Balance-Checked(HDFC)");	
	}
	public static void main(String[] args) {
		Hdfc h1=new Hdfc();
		h1.display();
		h1.sendMoney();
		h1.checkBalance();
	}
	

}
