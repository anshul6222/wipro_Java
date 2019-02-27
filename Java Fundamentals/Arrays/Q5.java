/* Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array */
import java.util.*; 
class Q5{
	 public static void main(String[] args) {
		 int[] arr = new int[] {65, 66, 23, 790, -1, 43, -3};
		 Arrays.sort(arr);
		 System.out.println("The largest 2 numbers are: "+ arr[arr.length-1]+ " and "+ arr[arr.length-2]+ ". \nThe smallest two numbers are: "+ arr[0]+ " and "+ arr[1]);
	 }
 }