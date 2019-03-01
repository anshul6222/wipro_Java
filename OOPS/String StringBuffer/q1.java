/*  Write a Program to check whether a given String is Palindrome or not. */


public class Palindrome {
	
	public static void main(String[] args) {   // input by arguments
			String str = args[0];
			StringBuffer stb = new StringBuffer(str);
			stb = stb.reverse();
			String str2 = stb.toString();
			if(str.equals(str2)) {
				System.out.println("Palindrome");
			}
			
			else
				System.out.println("Not Palindrome");
		} 
		
	}