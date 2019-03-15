import java.io.*;

public class Q2 {

	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input file name: ");
		String fileName = br.readLine();
		System.out.println("Enter the output file name: ");
		String fileName2 = br.readLine();
		
		FileReader in = new FileReader(fileName);
		FileWriter out = new FileWriter(fileName2);
		int i;
		while((i = in.read()) != -1) {
			out.write(i);
		}
		
		in.close();
		out.close();
		System.out.println("File is copied");
		
	}
}
