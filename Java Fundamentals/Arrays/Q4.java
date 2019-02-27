/* Initialize an integer array with ascii values and print the corresponding character values in a single row. */
import java.util.*; 
class Q4{
	 public static void main(String[] args) {
		 int[] arr = new int[] {65, 66, 69, 70};
		 for(int num : arr) {
			 System.out.print((char)num + " ");
		 }
	 }
 }