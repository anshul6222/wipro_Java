/*Write a program to check if a given integer number is Positive, Negative, or Zero. */

import java.io.*;
import java.util.*;

class Number{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number > 0)
			System.out.println("Number is Positive.");
		else if(number < 0)
			System.out.println("Number is Negative");
		else
			System.out.println("Number is zero");
	}
}