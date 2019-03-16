import java.io.*;
import java.util.*;
public class Ems {

	int employeeID;
	String employeeName;
	int employeeAge;
	double employeeSalary;
	
	
	public void entry(int employeeId, String employeeName, int employeeAge, double employeeSalary) throws IOException {
		this.employeeID = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
		BufferedWriter br= new BufferedWriter(new FileWriter("employeeDatabase.txt", true)); // opening file in append mode
		String input = employeeId + " " + employeeName + " " + employeeAge + " " + employeeSalary + "\n";
		br.write(input);
		br.close();
	}
	
	public void display() throws IOException {
		Scanner sc = new Scanner(new File("employeeDatabase.txt"));
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	
}
