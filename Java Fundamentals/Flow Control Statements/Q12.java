/*Write a program to check if a given number is prime or not*/
import java.io.*;
class PrintPrime{
	public static void main(String[] args) {
		//taking input through arguments
		int number = Integer.parseInt(args[0]);
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