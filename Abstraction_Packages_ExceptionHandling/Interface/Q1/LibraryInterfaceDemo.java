public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		AdultUser obj1 = new AdultUser(18,"Fiction");
		KidUser obj2 = new KidUser(9, "Kids");
		
		obj1.registerAccount();
		obj1.requestBook();
		
		obj2.registerAccount();
		obj2.requestBook();
	}
}