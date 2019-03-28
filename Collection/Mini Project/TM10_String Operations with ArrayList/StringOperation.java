import java.util.*;
public class StringOperation {
	
	public ArrayList<String> oper1(String s1, String s2, ArrayList<String> al) {
		StringBuffer str = new StringBuffer(s1);
		for(int i = 0; i < str.length(); i += 3 ) {
			str.replace(i, i+1, s2);
		}
		al.add(str.toString());
		return al;
	}
	
	public ArrayList<String> oper2(String s1, String s2, ArrayList<String> al) {
		
		StringBuffer str = new StringBuffer(s1);
		StringBuffer str2 = new StringBuffer(s2);
		// if s2 appears more than once in s1
		if(s1.indexOf(s2) != s1.lastIndexOf(s2)) {
			str.replace(s1.lastIndexOf(s2), s1.lastIndexOf(s2) + s2.length(), str2.reverse().toString());
		}
		
		al.add(str.toString());
		return al;
	}
	
	public ArrayList<String> oper3(String s1, String s2, ArrayList<String> al) {
		StringBuffer str = new StringBuffer(s1);
		// if s2 appears more than once in s1
		if(s1.indexOf(s2) != s1.lastIndexOf(s2)) {
			str.delete(str.indexOf(s2), str.indexOf(s2) + s2.length());
		}
		al.add(str.toString());
		return al;
	}
	
	public ArrayList<String> oper4(String s1, String s2, ArrayList<String> al) {
		// for even length s2 
		if(s2.length() %2 == 0) {
			String str1 = s2.substring(0, s2.length()/2);
			String str2 = s2.substring(s2.length()/2);
			//concatenating the string 
			s1 = str1 + s1 + str2;
		}
		// for odd length s2
		else {
			String str1 = s2.substring(0, s2.length()/2+1);
			String str2 = s2.substring(s2.length()/2 + 1);
			//concatenating the string 
			s1 = str1 + s1 + str2;
		}
		al.add(s1);
		return al;
	}
	
	public ArrayList<String> oper5(String s1, String s2, ArrayList<String> al) {
		for(int i = 0; i < s2.length(); ++i) {
			char ch = s2.charAt(i);
			// if character of s2 is in s1
			if(s1.contains(Character.toString(ch))){
				s1 = s1.replaceAll(Character.toString(ch), "*");
			}
		}
		al.add(s1);
		return al;
	}
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		StringOperation obj = new StringOperation();
		System.out.println("Enter two strings: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		al = obj.oper1(s1, s2, al);
		al = obj.oper2(s1, s2, al);
		al = obj.oper3(s1, s2, al);
		al = obj.oper4(s1, s2, al);
		al = obj.oper5(s1, s2, al);
		for(int i = 0; i < 5; ++i) {
			System.out.println((i+1) + ". " +al.get(i));
		}		
	}
}
