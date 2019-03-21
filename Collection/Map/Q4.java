/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
 *  The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/


import java.util.*;
public class Q4 {
	static HashMap<String, Long> hm = new HashMap<String, Long>();
	
	public boolean checkKey(String key) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals(key)) {
				System.out.println("Key exists.");
				return true;
			}
		}
		// if loop terminates it means key does not exist in the HashMap
		System.out.println("Key does not exists.");
		return false;
	}
	public boolean checkValue(Long value) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getValue().equals(value)) {
				System.out.println("Value exists.");
				return true;
			}
		}
		// if loop terminates it means key does not exist in the HashMap
		System.out.println("Value does not exists.");
		return false;
	}

	public static void main(String[] args) {
		
		// adding contacts to HashMap
		hm.put("Dhoni",  9854678993L);
		hm.put("Sachin", 8975647889L);
		hm.put("Virat", 7895678443L);
		hm.put("Rohit", 6782456773L);
		hm.put("Chahal", 9856545332L);
		
		//check if key exists
		Q4 obj = new Q4();
		obj.checkKey("Rohit");
		
		//check if value exists
		obj.checkValue(8976545665L);
		
	}
}
