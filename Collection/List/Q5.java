/*Implement the assignment 1 using Linked List
*/

import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		
		for(String i : list) {
			System.out.println(i);
		}
	}
}
