package exceptions;

public class WrongTimeException extends Exception{
	
	public WrongTimeException() {
		super("Hours must be 0-23 minutes must be 0-59");
	}

}
