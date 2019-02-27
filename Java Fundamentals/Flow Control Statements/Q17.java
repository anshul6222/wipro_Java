/*Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001
*/

import java.io.*;
class Reverse{
	public static void main(String[] args) {
		//taking input through argument
		int number = Integer.parseInt(args[0]);
		int res = 0;
		while(number>0){
			int rem = number % 10;
			res = res*10 + rem;
			number = number / 10;
		}
		System.out.println(res);
	}
}