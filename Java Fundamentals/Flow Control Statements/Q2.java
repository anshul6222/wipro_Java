/* Write a program to check if a given integer number is odd or even.*/

import java.io.*;
import java.util.*;

class EvenOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		int number = sc.nextInt();
		if(number % 2 == 0)
			System.out.println("Number is even.");
		else
			System.out.println("Number is odd.");
	}
}