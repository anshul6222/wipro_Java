public class KidUser implements LibraryUser{
	
	public int age;
	public String bookType;
	
	KidUser(int age, String bookType){
		this.age =age;
		this.bookType = bookType;
		
	}

	public void registerAccount() {
		
		if(age < 12) {
			System.out.println("You have successfully registered under a Kids Account.");
		}
		
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid.");
		}
	}
	
	public void requestBook() {
		
		
		if (age < 12) {
			if (bookType.equals("Kids")) {
				System.out.println("Book Issued successfully, please return the book within 10 days");
			}

			else {
				System.out.println("OOps, you are allowed to take only kids books");
			} 
		}
	}
}
