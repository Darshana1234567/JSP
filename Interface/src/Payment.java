public class Payment implements OnlinePay , OfflinePay
{
@Override
	public void payment ()
	{
		System.out.println("payment done");
	}

	public static void main(String[] args) {
		Payment p = new Payment();
		p.payment();
	}
}
