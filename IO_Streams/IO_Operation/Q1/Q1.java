
import java.io.*;
public class Q1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name: ");
		String fileName = br.readLine();
		System.out.println("Enter the character to be counted: ");
		Character ch = Character.toLowerCase((char)br.read()); // since the character check is case sensitive converting to lower case
		
		FileReader in = new FileReader(fileName);  
		int i;
		int counter = 0;
		while((i = in.read()) != -1) {   // reading the file
			if(ch.equals(Character.toLowerCase((char)i))){ // since the character check is case sensitive converting to lower case
				counter ++;  // counting number of instances
			}
		}
		
		System.out.println("File " + "'" +  fileName + "' has " + counter + " instances of letter  " + "'" + ch + "'");
		in.close();
		
		
	}
	
}
