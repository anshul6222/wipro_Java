/*Write a program to print prime numbers between 10 and 99.*/

import java.io.*;
class PNo{
	public static void main(String[] args) {
		boolean flag = false;
		for(int i = 10; i <= 99; ++i){
			for(int j = 2; j <= i/2; ++j){
				if(i % j == 0){
					flag = true;
					break;
				}
			}
			if (!flag)
            	System.out.println(i);
            flag = false;
		}
	}
}