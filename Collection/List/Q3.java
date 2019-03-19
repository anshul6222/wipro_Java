/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.*/


import java.util.*;
public class Q3 {

	static ArrayList<String> al = new ArrayList<String>();
	
	public static void printAll() {
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
		
		public static void main(String[] args) {
			al.add("Hello");
			al.add("How are you?");
			al.add("Ok");
			al.add("Hello World");
			printAll();
		}

	
}