/*Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

import java.util.*;
public class Q2 {

	static HashMap<String, String> hm = new HashMap<String,String>();
	
	public boolean checkValue(String value) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getValue().equals(value)) {
				return true;
			}
			
		}
		// if we get out of the loop it means value is not present in the hash map
		return false;
		
	}
	
	public boolean checkKey(String Key) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals(Key)) {
				return true;
			}
		}
		// if we get out of the loop it means  key is not present in the hash map
		return false;
	}
	
	public static void main(String[] args) {
		hm.put("A", "Apple");
		hm.put("O", "Orange");
		hm.put("G", "Grapes");
		hm.put("L", "Lemon");
		
		Q2 obj = new Q2();
		
		//checking for key
		boolean ans = obj.checkKey("G");
		if(ans == true) {
			System.out.println("Key exists.");
		}
		else {
			System.out.println("Key does not exists.");
		}
		
		//checking for value
		ans = obj.checkValue("Mango");
		if(ans == true) {
			System.out.println("Value exists");
		}
		else {
			System.out.println("Value does not exists.");
		}
		
	}
}
