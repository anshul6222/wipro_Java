import java.util.*;
public class Q9 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the 2 numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			System.out.println("The quotient of " + num1 + "/" + num2 + " = " + num1 / num2);
		}
		
		catch(Exception e) {
			System.out.println("DivideByZeroException caught.");
		}
		
		finally {
			System.out.println("Inside finally block.");
		}
	}

}
