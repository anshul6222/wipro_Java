/*Write a program to receive a color code from the user (an Alphabhet). The program should then print the color name, based on the color code given. 
The following are the color codes.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
If color code in not valid then print "Invalid Code".*/

import java.io.*;
class Color{
	public static void main(String[] args) {
		//taking the input using arguments
		if(args.length == 0){
			System.out.println("Invalid Code");
		}

		else{
			String code = args[0];
			switch(code){

			case "R": System.out.println("Red");
					  break;
			case "B": System.out.println("Blue");
					  break;
		    case "G": System.out.println("Green");
					  break;
			case "O": System.out.println("Orange");
					  break;
		    case "Y": System.out.println("Yellow");
					  break;
			case "W": System.out.println("White");
					  break;		  			  		  			  		  
		}
		}


	}
}