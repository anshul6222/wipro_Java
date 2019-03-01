/*  Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi */


public class Copy {
	
	public static void main(String[] args) { // input taken via arguments 
		String str = args[0];
		int n = str.length();
		String sub = str.substring(0,2);
		String sub1 = "";
		for(int i = 0; i < n; ++i) {
			sub1 = sub1 + sub;
		}
		
		System.out.println(sub1);
		}

}
