import java.util.*;
public class EmployeeDB {

	ArrayList<Employee> al = new ArrayList<Employee>();  //ArrayList of employee objects
	
	boolean addEmployee(Employee e) {
		al.add(e);   // adding employee object
		System.out.println("\n");
		return true;
		
	}
	
	boolean deleteEmployee(int empid) {
		Iterator<Employee> i = al.iterator();   
		while(i.hasNext()) {
			if(i.next().empid == empid) {
				//removing the employee object if it matches the employee id specified
				i.remove(); 
				System.out.println("Employee Removed.");
				System.out.println(al.get(0).empid);
				break;
			}
			else {
				System.out.println("Employee not found.");
			}
		}
		return true;
		
	}
	
	String showPaySlip(int empid) {
		Iterator<Employee> i = al.iterator();
		while(i.hasNext()) {
			Employee temp = i.next();
			if(temp.empid == empid) {
				//returning the pay slip of the matched employee
				return "Payslip of the employee is: " + temp.salary;
			}
		}
		return "Employee not found.";
	}
}

