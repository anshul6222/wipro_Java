/* Given two strings a and b, return a new string, following the rules given below. 
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.

Example1)
i/p:abcXY123XYijk,XY
o/p:c13i

Example2)
i/p:XY123XY,XY
o/p:13

Example3)
i/p:XY1XY,XY
o/p:11  */


public class Q11 {
	public static void main(String[] args) {
		String a = "abcXY123XYijk";
		String b = "XY";
		String str = "";
		String finalString = "";
		
		if(a.toLowerCase().contains(b.toLowerCase()) == false) { // if substring is not present
			System.out.println("Substring not present");
		}
		else {
			str = a.replaceAll(b, "*"); //to replace all substring (b) occurrences in (a) with a placeholder char for simplicity
		}
		
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) == '*') {
				if(i-1 >= 0) {
					finalString = finalString + str.charAt(i-1);
				}
				
				if(i+1 <= str.length()-1) {
					finalString = finalString + str.charAt(i + 1);
				}
			}
			
		}
		System.out.println(finalString); //output
		
	}

}
