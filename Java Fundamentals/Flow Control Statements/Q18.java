/*Write a Java program to find if the given number is palindrome or not

Example1:

     C:\>java Sample 110011

     O/P Expected : 110011 is a palindrome

Example2:

     C:\>java Sample 1234

     O/P Expected : 1234 is not a palindrome
     */

import java.io.*;
class Palindrome{
	public static void main(String[] args) {
		//input through argument
		int number = Integer.parseInt(args[0]);
		int temp = number;
		int res = 0;
		while(number>0){
			int rem = number % 10;
			res = res*10 + rem;
			number = number / 10;
		}
		if(temp == res)
			System.out.println(temp+ " is a palindrome");
		else
			System.out.println(temp+ " is not a palindrome");
	}
}     