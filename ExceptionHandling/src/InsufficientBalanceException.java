public class InsufficientBalanceException extends RuntimeException
{
	String message="Insufficient funds";
	@Override
	public String getMessage() {
		return message;
	}

}
