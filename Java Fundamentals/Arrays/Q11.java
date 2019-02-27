/*  Write a program to find biggest number in a 3*3 array. The program is supposed to receive 9 integer
 *  numbers as command line arguments.


Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 9 integer numbers

Example2:

     C:\>java Sample 1 23 45 55 121 222 56 77 89

     O/P Expected : 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222

 */


import java.util.*;
class HelloWorld{
	 public static void main(String[] args) {
		if(args.length == 9) {    // checking the valid arguments length
			
			int arr[][] = new int[3][3];
			int c = 0;
			
			for(int i = 0; i < 3; ++i) {      //Initialising the 2d array
				for(int j = 0; j < 3; ++j) {
					arr[i][j] = Integer.parseInt(args[c]);
					++c;
				}
			}
			System.out.println("The given array is :");
			for(int i = 0; i < 3; ++i) {     // printing the 2d array
				for(int j = 0; j < 3; ++j) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			int[] a = new int[9]; //new array to sort and find the max number
			int counter = 0;
			
			for(int i = 0; i < 9; ++i) { 
				a[i] = Integer.parseInt(args[i]); // filling the temp array 
			}
			
			Arrays.sort(a); // sorting the array
			int max_number = a[a.length-1]; // max number will be the last element of sorted array
			System.out.println("The biggest number in the given array is " + max_number);
		}
		
		else {
			System.out.println("Please enter 9 integer numbers");
		}
	
	 }
}