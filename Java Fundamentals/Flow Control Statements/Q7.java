/*Initialize a character variable with an alphabhet in a program. If the character value is in lowercase, the outut should be displayed in uppercase in the following format.
Example1)
i/p:a
o/p:a->A
If the character value is in uppercase, the outut should be displayed in lowercase in the following format.
Example2)
i/p:A
o/p:A->a*/

import java.io.*;
import java.util.*;
class Case{
	public static void main(String[] args) {
		char ch = 'A';

		if(Character.isLowerCase(ch)){
			System.out.println(ch+ "->"+ Character.toUpperCase(ch));
		}

		else{
			System.out.println(ch+ "->"+ Character.toLowerCase(ch));
		}
	}
}
