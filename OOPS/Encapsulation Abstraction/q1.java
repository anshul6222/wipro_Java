/*   Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables
Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
Assumption: Each book will be written by exactly one Author
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables
In the main method, create a book object and print all details of the book (including the author details) */

public class Author {
	static String name, email;
	static char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

}


public class Book {
	private String name;
	private double price;
	private int qtyInStock;
	Author author;
	
	Book(String name, double price, int qtyInStock){
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getqtyInStock() {
		return qtyInStock;
	}
	
	public void settName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setqtyInStock(int qtyInStock) {
		 this.qtyInStock = qtyInStock;
	}
	
	public static void main(String[] args) {
		Book o1 = new Book("ABC", 250.54, 10000);
		System.out.println("Book name = " + o1.getName());
		System.out.println("Price = " + o1.getPrice());
		System.out.println("Quantity = " + o1.getqtyInStock());
		
		
		
		
	}

}
