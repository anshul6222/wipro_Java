/* Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,
 the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad	*/

public class Q8 {
	
	public static void main(String[] args) {
		String str = "ab*cd";
		StringBuffer stb = new StringBuffer(str);
		
		for(int i = 0; i< stb.length(); ++i) {
			char ch = stb.charAt(i);
			if(ch == '*') {
				stb.delete(i-1,i);
				stb.delete(i, i+1);
			}
		}
		str = stb.toString();
		str = str.replace("*", "");
		
		System.out.println(str);
	}

}
