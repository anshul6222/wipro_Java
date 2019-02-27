/*  Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as
    Command Line arguments.

Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 4 integer numbers

Example2:

     C:\>java Sample 1 2 3 4

     O/P Expected : 
     
  The given array is :
  1 2 
  3 4 
  The reverse of the array is :
  4 3 
  2 1

 */


import java.util.*;
class HelloWorld{
	 public static void main(String[] args) {
		 int[][] arr = new int[2][2];
		 int c = 0;
		if (args.length == 4) {
			for (int i = 0; i < 2; ++i) {      //initializing 2d array
				for (int j = 0; j < 2; ++j) {
					arr[i][j] = Integer.parseInt(args[c]);
					++c;
				}
			}
			
			for(int i = 0; i < 2; ++i) {       // swapping row items
				for(int j = 0; j < 1; ++j) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][j+1];
					arr[i][j+1] = temp;
				}
			}
			for(int i = 0; i < 1; ++i) {      // swapping column items
				for(int j = 0; j < 2; ++j) {
					int temp = arr[i][j];
					arr[i][j] = arr[i+1][j];
					arr[i+1][j] = temp;
				}
			}
			for(int i = 0; i < 2; ++i)
			{
				for(int j = 0; j < 2; ++j)
					System.out.print(arr[i][j]);
				
				System.out.println();
			}
			System.out.println();
		}
		else {
			System.out.println("Please enter 4 integer numbers");
		}
	 }
}