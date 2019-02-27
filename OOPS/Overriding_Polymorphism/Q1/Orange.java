public class Orange extends Fruit {
	private String taste;
	
	Orange(String name, String taste){
		super(name, taste);
		this.taste = taste;
	}
	
	public void eat() {
		System.out.println("The taste of the orange is: " + taste);
	}
	
	

}