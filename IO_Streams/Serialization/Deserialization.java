import java.io.*;

public class Deserialization {

	public static void main(String[]args) {
		
		try {
			
			Employee obj2 ;
			
			FileInputStream fin = new FileInputStream("data");
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			obj2 = (Employee)ois.readObject();
			ois.close();
			System.out.println("The properties of object are: " + obj2);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
			System.exit(0);
		} catch (ClassNotFoundException e) {
			System.out.println("Error: " + e);
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Error: " + e);
			System.exit(0);
		}
	}
}
