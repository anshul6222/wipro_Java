/*Write a program that will have a Properties class object which is capable of storing some States of India and their Capital.
 *  Use an Iterator to list all the elements stored in the Properties.*/

import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		p.put("Uttarakhand", "Dehradun");
		p.put("Uttar Pradesh", "Lucknow");
		p.put("Orrisa", "Bhubneshwar");
		p.put("Karnataka", "Banglore");
		p.put("Punjab", "Chandigarh");
		
		Set set = p.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			String str = (String) i.next();
			System.out.println("The capital of the " + str + " is " + p.getProperty(str));
		}
	}
}
