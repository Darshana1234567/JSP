public class InvalidAgeException extends Throwable
{
	String message="Provide proper age";
	@Override
	public String getMessage() {
		return message;
	}

}
