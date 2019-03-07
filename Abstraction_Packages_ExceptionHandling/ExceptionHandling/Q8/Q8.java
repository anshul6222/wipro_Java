public class Q8 {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		try {
			if(age <18 || age > 60) {
				throw new MyException() ;
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}