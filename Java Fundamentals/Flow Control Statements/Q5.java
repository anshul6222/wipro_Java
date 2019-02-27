/*Initialize a character variable in a program and print 'Alphabhet' if the initialized value is an alphabhet, print 'Digit' if the initialized value is a number, and print 'Special Character', if the initialized value is anything else.*/
import java.io.*;
import java.util.*;

class CheckCharacter{
	public static void main(String[] args) {
		char c = 'z';

		if(c>=65 && c<=90 || c>=97 && c<=122){
			System.out.println("Alphabet");
		}	

		else if(c>=48 && c<=57){
			System.out.println("Digit");
		}	

		else
			System.out.println("Special Character");
	}
}
