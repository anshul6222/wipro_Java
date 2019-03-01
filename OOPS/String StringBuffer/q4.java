*  Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null */


public class Q4 {
	public static void main(String[] args) { 
		
		String str = "TomCat";
		int length = str.length();
		
		if(length % 2 != 0)
			System.out.println("null");
		
		else {
			System.out.println(str.substring(0,length/2));
		}
	}
	

}