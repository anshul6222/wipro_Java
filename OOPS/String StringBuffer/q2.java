/* Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate */


public class Concat {

	public static void main(String[] args) { // input is taken using arguments
		
		String str1 = args[0];
		String str2 = args[1];
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		Character ch1 = str1.charAt(str1.length() - 1);
		Character ch2 = str2.charAt(0);
		
		if(ch1.equals(ch2)) {
			str2 = str2.replaceFirst(ch2.toString(), "");
		}
		
		System.out.println(str1+str2);
		
		
	}
}
