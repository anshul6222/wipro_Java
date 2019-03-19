import java.io.*;
import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee obj = new Employee();
		EmployeeDB obj2 = new EmployeeDB();
		obj.empname ="Xyz";
		obj.empid = 1;
		obj.email = "Xyz@gmail.com";
		obj.gender = "Male";
		obj.salary = 90000;
		obj2.addEmployee(obj);  // adding employee
		
		Employee obj3 = new Employee();
		obj3.empname ="Abhish";
		obj3.empid = 2;
		obj3.email = "abi@gmail.com";
		obj3.gender = "Male";
		obj3.salary = 70000;
		obj2.addEmployee(obj3);
		
		
		Employee obj4 = new Employee();
		obj4.empname ="Neha";
		obj4.empid = 3;
		obj4.email = "neha@gmail.com";
		obj4.gender = "Female";
		obj4.salary = 60000;
		obj2.addEmployee(obj4);
		
		System.out.println(obj2.showPaySlip(2)); // displaying employee pay slip
		obj.getemployeeDetails(); // displaying employee detail
		obj2.deleteEmployee(1);  // deleting specified employee
		}
}
