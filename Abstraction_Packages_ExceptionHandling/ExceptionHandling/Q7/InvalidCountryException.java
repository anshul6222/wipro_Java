public class InvalidCountryException extends Exception {
	
	public InvalidCountryException() {
		System.out.println("Error:");
	}
	
	public String toString() {
		return "User Outside India  cannot be registered.";
	}

}