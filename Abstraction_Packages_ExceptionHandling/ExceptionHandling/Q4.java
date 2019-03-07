public class MathOperation {

	public static void main(String[] args) {
		try { // NumberFormatException try and catch block
			int[] arr = new int[] {Integer.parseInt(args[0]),Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4])};
			int sum =0;
			for(int i =0 ; i < arr.length; ++i) {
				sum  = sum + arr[i];
			}
			
			double average = 0;
			try { // Arithmetic Exception try and catch block
				average = sum/ 5;
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				System.exit(0);
			}
			
			System.out.println("Sum = " + sum);
			System.out.println("Average = " + average);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
	}
}
