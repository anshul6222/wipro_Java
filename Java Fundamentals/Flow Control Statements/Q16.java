/* Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)

     C:\>java Sample 

     O/P Expected : Please enter an integer number

Example2)

     C:\>java Sample 3

     O/P Expected :
                   *
                   *  * 
                   *  *  *    */

import java.io.*;
class Pattern{
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Please enter an integer number");
		}

		else{
			int n = Integer.parseInt(args[0]);
			for(int i = 1; i <=n ; ++i){
				for(int j = 1; j <= i; ++j){
					System.out.print("*");
				}
				System.out.println("");
			}
		}
}
}