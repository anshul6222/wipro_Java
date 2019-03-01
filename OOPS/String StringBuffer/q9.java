/* Given two strings, a and b, print a new string which is made of the following combination-first character of a,
  the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod  */

public class Q9 {
	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("World");
		
		int maxLength = Math.max(a.length(), b.length());
		StringBuffer finalString = new StringBuffer("");
		
		for(int i = 0; i < maxLength; ++i) {
			if(i < a.length())
				finalString.append(a.charAt(i));
			if(i < b.length())
				finalString.append(b.charAt(i));
		}
		
		System.out.println(finalString);
		
	}

}