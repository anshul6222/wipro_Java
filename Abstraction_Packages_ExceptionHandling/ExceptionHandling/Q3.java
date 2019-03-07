import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the array.");
		int[] arr = new int[size];
		boolean flag = true;
		
		for(int i = 0; i < size; ++i) {
			try {
				arr[i] =  sc.nextInt();
			} catch (Exception  e) {
				System.out.println(e);
				System.exit(0);
			}
		}
		
		System.out.println("Enter the index of the array element you want to access.");
		int index = sc.nextInt();
		
		try {
			System.out.println("The array element at index " +index + " = " + arr[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException e){ // replace with Array index out of bound exception
			System.out.println(e);
			flag = false;
		}
		
		if(flag == true) {
			System.out.println("The array element successfully accessed.");
		}
	}
}
