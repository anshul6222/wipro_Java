public class Employee {

	int empid;
	String empname;
	String email;
	String gender;
	float salary;
	
	public Employee(int empid, String empname, String email, String gender, float salary) {
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	
	// giving the object String representation
	public String toString() {
		return "Employee id: " + empid + "\nEmployee name: " + empname + "\nEmail: " + email + "\nGender: " + gender + "\nSalary: " + salary;
		
	}

}
