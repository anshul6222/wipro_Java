/*1. Develop a java class with a instance variable M1 (HashMap)  create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country                          Value - Capital
India                                                   Delhi
Japan                                                Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                                           India
Tokyo                                        Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
*/


import java.util.*;
public class Q1 {

	HashMap<String, String> m1 = new HashMap<String, String>();
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String CapitalName) {
		m1.put(CountryName, CapitalName);
		return m1;
	}
	
	public String getCapital(String CountryName) {
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals(CountryName)) {
				return (String) me.getValue();
			}
		}
		// if country is not found in the hash map
		return "Country not found";
	}
	
	public String getCountry(String CapitalName) {
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getValue().equals(CapitalName)) {
				return (String) me.getKey();
			}
		}
		// if country is not found in the hash map
		return "Capital not found";
	}
	
	public HashMap<String, String> swap() {
		
		HashMap<String, String> m2 = new HashMap<String, String>();
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			m2.put((String)me.getValue(), (String)me.getKey());
		}
		
		return m2;
	}
	
	public ArrayList key() {
		ArrayList<String> al = new ArrayList<String>();
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			al.add((String) me.getKey());
		}
		
		return al;
	}
	
	public static void main(String[] args) {
		Q1 obj = new Q1();
		// using saveCountryCapital() method
		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("Japan", "Tokyo");
		
		// using getCapital()
		System.out.println(obj.getCapital("India"));
		System.out.println(obj.getCountry("Tokyo"));
		
		// using swap()
		
		HashMap<String, String> m = obj.swap();
		
		//using key()
		
		ArrayList<Integer> al = obj.key();
		System.out.println(al.toString());
		
	}
	
}

