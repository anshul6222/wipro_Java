/*Write a Java program to find if the given number is prime or not.

Example1)

     C:\>java Sample 

     O/P Expected : Please enter an integer number 

Example2)

     C:\>java Sample 1

     O/P Expected : 1 is neither prime nor composite

Example3)

     C:\>java Sample 0

     O/P Expected : 0 is neither prime nor composite
 
 Example4)

     C:\>java Sample 10

     O/P Expected : 10 is not a prime number

Example5)

     C:\>java Sample 7

     O/P Expected : 7 is a prime number
*/

import java.io.*;
class Prime{
	public static void main(String[] args) {
		//taking input through arguments
		int number = Integer.parseInt(args[0]);
		if(number == 1 || number == 0){
			System.out.println(number+ " is neither prime nor composite");
		}
		else{
			boolean flag = false;
			for(int i = 2; i <= number/2; ++i ){
				if(number % i == 0){
					flag = true;
					break;
				}
			}
			if (!flag)
	            System.out.println(number + " is a prime number.");
	        else
	            System.out.println(number + " is not a prime number.");
		}
}
}






























