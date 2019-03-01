/*  Given 2 strings, a and b, return a new string of the form short+long+short,
  with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi". */

public class Q6 {
	public static void main(String[] args) {
		
		String s1 = "hi";
		String s2 = "hello";
		
		//check whether the length of both string are same or not
		if(s1.length() == s2.length())
			System.out.println("Length of both strings should be different.");
		
		else {
			String small, large;
			if(s1.length() < s2.length()) {
				small = s1;
				large = s2;
			}	
			
			else {
				small = s2;
				large = s1;
			}
			
			System.out.println(small + large + small);
				
				
		}
		
	}
}