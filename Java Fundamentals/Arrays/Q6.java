/*  Write a program to initialize an array and print them in a sorted fashion
 */
import java.util.*; 
class Q6{
	 public static void main(String[] args) {
		 int[] arr = new int[] {65, 66, 23, 790, -1, 43, -3};
		 Arrays.sort(arr);
		 for(int num : arr) {
			 System.out.println(num);
		 }
	 }	 
 }