/*Write a program to print first 5 values which are divisible by 2, 3, and 5.
*/

import java.io.*;
class Sample{
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		boolean flag = false;
		while(count < 5){
			if(i % 5 == 0 && i % 2 == 0 && i % 3 == 0 ){
				System.out.println(i);
				count ++;
			}
			++i;

		}
	}
}