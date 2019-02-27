/*Write a program to add all the values in a given number and print. Ex: 1234->10*/

import java.io.*;
class DigitAdd{
	public static void main(String[] args) {
		//taking input through arguments
		int num = Integer.parseInt(args[0]);
		int sum = 0;

		while(num > 0){
			int rem = num%10;
			sum = sum + rem;
			num/=10;
		}

		System.out.println(sum);
	}
}