import java.util.*;
public class Database {
	
	public static void main(String[] args) {
		String fName;
		String lName;
		long mobile;
		String email;
		String address;
		// using tree map to get sorted output based on employee's name
		TreeMap<String, Employee> map = new TreeMap<String, Employee>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// Array of Employee objects
		Employee arr[] = new Employee[num];
		//Initialising array of objects
		for(int i = 0; i < num; ++i) {
			arr[i] = new Employee();
		}
		
		for(int i = 0; i < num; ++i) {
			System.out.println("Enter Employee " + (i+1) + " Details:");
			System.out.println("Enter the FirstName: ");
			fName = sc.nextLine();
			
			System.out.println("Enter the last name: ");
			lName = sc.nextLine();
			
			System.out.println("Enter the mobile:");
			mobile = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter the email:");
			email = sc.nextLine();
			
			System.out.println("Enter the address: ");
			address = sc.nextLine();
			
			// entering the details in the map
			arr[i].setLastName(lName);
			arr[i].setMobile(mobile);
			arr[i].setEmail(email);
			arr[i].setAddress(address);
			
			map.put(fName, arr[i]);
		}
		//displaying the output layout
		System.out.println("FirstName\tSecondName\tMobileNumber\t\tEmail\t\t\t\tAddress");
		
		// displaying the map contents
		Set set = map.entrySet();
		Iterator i = set.iterator();
		
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + "\t\t");
			System.out.println(me.getValue());
		}
	}
}
