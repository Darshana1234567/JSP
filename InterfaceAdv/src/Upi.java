
public interface Upi 
{
	void sendMoney();
	void checkBalance();
	default void display()
	{
		System.out.println("ThankYou for using UPI");
	}
}
