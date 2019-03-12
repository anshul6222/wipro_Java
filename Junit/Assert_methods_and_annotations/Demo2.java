package junit.first;

public class Demo2 {

	public String palindrome(String name) {
		StringBuffer stb = new StringBuffer(name);
		stb = stb.reverse();
		String str2 = stb.toString();
		if(name.equals(str2)) {
			return "Palindrome";
		}
		
		else
			return "Not Palindrome";
	} 
}

