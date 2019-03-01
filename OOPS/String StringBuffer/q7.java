/*  Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America". */

public class Q7 {

	public static void main(String[] args) {
		String str = "xHix";
		
		str = str.replace("x", "");
		System.out.println(str);
	}
}
