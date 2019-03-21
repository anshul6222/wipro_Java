/* Implement the assignment 1 using TreeMap */
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Q5 {

	TreeMap<String, String> m1 = new TreeMap<String, String>();
	
	public TreeMap<String, String> saveCountryCapital(String CountryName, String CapitalName) {
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
	
	public TreeMap<String, String> swap() {
		
		TreeMap<String, String> m2 = new TreeMap<String, String>();
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
		
		TreeMap<String, String> m = obj.swap();
		
		//using key()
		
		ArrayList<Integer> al = obj.key();
		System.out.println(al.toString());
		
	}
	
}

